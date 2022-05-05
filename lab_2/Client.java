import Board.BoardAnyCar;
import Board.BoardDirector;
import Board.Builder.BoardBuilder;
import Board.Builder.BusBuilder;
import Board.Builder.PlaneBuilder;
import Board.Builder.TaxiBuilder;

public class Client {
    public static void main(String[] args) {

        BoardBuilder builder = new BusBuilder();
        BoardDirector boardDirector = new BoardDirector(builder);
        BoardAnyCar board = boardDirector.createBoard();
        System.out.println("\tBus - " + board.isMoving());

        builder = new TaxiBuilder();
        boardDirector = new BoardDirector(builder);
        board = boardDirector.createBoard();
        System.out.println("\tTaxi - " + board.isMoving());

        builder = new PlaneBuilder();
        boardDirector = new BoardDirector(builder);
        board = boardDirector.createBoard();
        System.out.println("\tPlane - " + board.isMoving());
    }
}
