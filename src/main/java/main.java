public class main {

    public static void main(String[] args) {

        Board board = new Board();
        KanbanService service = new KanbanService();

        service.createCard(board);
        board.printBoard();

    }
}
