import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<Task> waitingTasks = new ArrayList<>();
    private List<Task> inProgressTasks = new ArrayList<>();
    private List<Task> doneTasks = new ArrayList<>();

    public void addTaskToWaiting(Task newTask) {
        waitingTasks.add(newTask);
    }

    public void moveTaskToInProgress(int whichElement) {
        inProgressTasks.add(waitingTasks.get(whichElement));
        waitingTasks.remove(whichElement);
        printBoard();
    }

    public void moveTaskToDone(int whichElement) {
        doneTasks.add(inProgressTasks.get(whichElement));
        inProgressTasks.remove(whichElement);
        printBoard();
    }

    public void printBoard() {
        System.out.println("Kanban");
        for (int i = 0; i < waitingTasks.size(); i++) {
            System.out.println("Waiting: " + i + waitingTasks.get(i));
        }
        for (int i = 0; i < inProgressTasks.size(); i++) {
            System.out.println("In Progress: " + i + " " + inProgressTasks.get(i));
        }
        for (int i = 0; i < doneTasks.size(); i++) {
            System.out.println("Done: " + i + doneTasks.get(i));
        }
    }
    public List<Task> getWaitingList(){
        return waitingTasks;
    }
    public List<Task> getInProgressList(){
        return inProgressTasks;
    }
    public List<Task> getDoneList(){
        return doneTasks;
    }
}