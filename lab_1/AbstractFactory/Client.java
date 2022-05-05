package AbstractFactory;

import AbstractFactory.Board.BoardAnyCar;
import AbstractFactory.Board.BoardBus;
import AbstractFactory.Board.BoardPizza;
import AbstractFactory.Board.BoardTaxi;

public class Client {
    public static void main(String[] args) {
        BoardAnyCar car;

        car = new BoardBus();
        System.out.println("\tBus - " + car.isMoving());

        car = new BoardTaxi();
        System.out.println("\tTaxi - " + car.isMoving());

        car = new BoardPizza();
        System.out.println("\tPizza - " + car.isMoving());
    }
}
