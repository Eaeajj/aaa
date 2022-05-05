package Board;

import Board.Builder.BoardBuilder;

public class BoardDirector {
    public BoardBuilder boardBuilder;
    public BoardBuilder Builder;

    public BoardDirector(BoardBuilder builder) {
        boardBuilder = builder;
    }

    public BoardAnyCar createBoard() {
        boardBuilder.createBoard();
        boardBuilder.addDriver();
        boardBuilder.addPassenger();
        boardBuilder.protectPassengers();
        boardBuilder.paintBoard();

        return boardBuilder.getBoard();
    }
}
