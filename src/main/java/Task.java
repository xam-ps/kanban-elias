public class Task {
    private String taskMessage;

    Task(String taskMessage1) {
        this.taskMessage = taskMessage1;
    }

    @Override
    public String toString() {
        return " " + taskMessage;
    }
}