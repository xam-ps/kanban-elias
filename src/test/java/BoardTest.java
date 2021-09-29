import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    public void addTaskTest() {
        Board board = new Board();
        board.addTaskToWaiting(new Task("123"));
        String expected = "123";

        String taskMessage = board.getWaitingList().get(0).toString();
        assertEquals(expected, taskMessage);
    }

    @Test
    public void moveTaskToInProgressTest() {
        Board board = new Board();
        board.addTaskToWaiting(new Task("123"));
        board.moveTaskToInProgress(0);
        String expected = "123";

        String taskMessage = board.getInProgressList().get(0).toString();
        assertEquals(expected, taskMessage);
    }

    @Test
    public void moveTaskToDoneTest() {
        Board board = new Board();
        board.addTaskToWaiting(new Task("123"));
        board.moveTaskToInProgress(0);
        board.moveTaskToDone(0);

        String expected = "123";

        String taskMessage = board.getDoneList().get(0).toString();
        assertEquals(expected, taskMessage);
    }
}