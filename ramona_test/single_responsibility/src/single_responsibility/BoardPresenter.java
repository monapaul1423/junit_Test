package single_responsibility;


public class BoardPresenter {
    Board board;

    public BoardPresenter(Board board) {
        this.board = board;
    }

    public void displayBoard() {
        String formattedBoard = "";
        for (int index = 0; index < this.board.getSize()*this.board.getSize(); index++) {
            String borderOrNewline = "";
            if ((index+1) % board.getSize() == 0) {
                borderOrNewline += "\n";
            }
            else {
                borderOrNewline += "|";
            }
            formattedBoard += board.getSpots().get(index);
            formattedBoard += borderOrNewline;
        }
        System.out.print(formattedBoard);
    }
}