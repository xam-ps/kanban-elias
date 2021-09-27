import java.util.Scanner;

public class KanbanService {

    public void createCard(Board board) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to create a Task?\n y = yes\n n = no");
        String inputAnswer = scanner.next();

        if (inputAnswer.equals("y")) {

            System.out.print("From 1 to 3 how many tasks?");
            int howManyTasks = scanner.nextInt();
            int NumberOfTasks = howManyTasks;
            for (int i = 0; i < NumberOfTasks; i++) {
                System.out.print("Please enter your task message: ");
                String taskMessage = scanner.next();
                board.addTaskToWaiting(new Task(taskMessage));

            }

            board.printBoard();
            System.out.println("Do you want to move a Task?\n y = yes\n n = no");
            String inputAnswer2 = scanner.next();

            if (inputAnswer2.equals("y")) {
                moveTask(board, scanner);
                System.out.println("Move another Task?\n y = yes\n n = no");
                String moveAnother = scanner.next();

                if (moveAnother.equals("y")) {
                    moveTask(board, scanner);
                } else {
                    System.exit(0);
                }
            } else {
                System.out.println("Vorgang abgeschlossen");
            }
        }
    }

    private void moveTask(Board board, Scanner scanner) {
        board.printBoard();
        System.out.println("Move to InProgress or Done?");
        String whatMove = scanner.next();
        if (whatMove.equals("Done")) {
            System.out.println("Which Task do you want to move(0 - 2)?");
            int whichElement = scanner.nextInt();
            board.moveTaskToDone(whichElement);
        } else {
            System.out.println("Which Task do you want to move(0 - 2)?");
            int whichElement = scanner.nextInt();
            board.moveTaskToInProgress(whichElement);
        }
    }
}


