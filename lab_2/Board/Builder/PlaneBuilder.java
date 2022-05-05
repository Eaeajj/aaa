package Board.Builder;

import Board.BoardAnyCar;
import Board.BoardPlane;
import Driver.PlaneDriver;
import Passenger.PlanePassenger;
import Passenger.TypePassenger;

public class PlaneBuilder extends BoardBuilder {
    public BoardPlane plane;

    @Override
    public BoardAnyCar getBoard() {
        System.out.println("Plane was served");
        return plane;
    }

    @Override
    public void protectPassengers() {
    }

    @Override
    public void createBoard() {
        plane = new BoardPlane();
        System.out.println("Plane has been created");
    }

    @Override
    public void addDriver() {
        plane.driver = new PlaneDriver("Aleksey");
        System.out.println("Plane driver has been created");

    }

    @Override
    public void addPassenger() {
        for (int i = 0; i < plane.limitPassenger / 2; i++) {
            plane.lPassengers.add(new PlanePassenger(TypePassenger.Adult, "Sveta"));
            plane.lPassengers.add(new PlanePassenger(TypePassenger.Kid, "Svetlana"));
        }
        System.out.println("Taxi passengers has been created");
    }

    @Override
    public void paintBoard() {
        plane.paintWhite();
    }

}
