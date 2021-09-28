public class Task {
    private String taskMessage;

    Task(String taskMessage) {
        this.taskMessage = taskMessage;
    }

    @Override
    public String toString() {
        return " " + taskMessage;
    }
}