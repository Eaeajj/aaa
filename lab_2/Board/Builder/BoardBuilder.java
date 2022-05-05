package Board.Builder;

import Board.BoardAnyCar;

public abstract class BoardBuilder {
    public abstract BoardAnyCar getBoard();

    public abstract void protectPassengers();

    public abstract void createBoard();

    public abstract void addDriver();

    public abstract void addPassenger();

    public abstract void paintBoard();
}
