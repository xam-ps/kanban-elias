public class Task {
    private String taskMessage;


    public Task() {

    }

    Task(String taskMessage) {
        this.taskMessage = taskMessage;
    }

    @Override
    public String toString() {
        return " " + taskMessage;
    }
}