import java.util.Scanner;
public class KanbanBoard extends Kanban {

    Scanner scanner = new Scanner(System.in);

    public void createKanbanBoard(){
        System.out.print("Please enter a KanbanBoard Name: ");
        String inputName = scanner.next();
        this.boardName = inputName;
    }

}
