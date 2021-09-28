import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    private List<Task> waitingTasks = new ArrayList<>();
    private List<Task> inProgressTasks = new ArrayList<>();
    private List<Task> doneTasks = new ArrayList<>();

    @Test
    public void addTask() {
        Task newTask = new Task("123");
        waitingTasks.add(newTask);

        String expected = " 123";
        String taskMessage = waitingTasks.get(0).toString();
        assertEquals(expected, taskMessage);
    }
}