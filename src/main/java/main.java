public class main {

    public static void main(String[] args) {

        Board board = new Board();
        KanbanService service = new KanbanService();

        service.createCardWithInput(board);
        board.printBoard();

    }
}