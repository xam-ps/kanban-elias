import java.util.Scanner;

public class Task {
    private String taskMessage;

    Task(String taskMessage1) {
        this.taskMessage = taskMessage1;
    }

    public String getTaskMessage() {
        return taskMessage;
    }

    @Override
    public String toString() {
        return " " + taskMessage;
    }
}


