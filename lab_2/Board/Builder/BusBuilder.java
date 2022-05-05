package Board.Builder;

import Board.BoardAnyCar;
import Board.BoardBus;
import Driver.BusDriver;
import Passenger.BusPassenger;
import Passenger.TypePassenger;

public class BusBuilder extends BoardBuilder {
    public BoardBus bus;

    @Override
    public BoardAnyCar getBoard() {
        System.out.println("Bus was served");
        return bus;
    }

    @Override
    public void createBoard() {
        bus = new BoardBus();
        System.out.println("Bus has been created");
    }

    @Override
    public void addDriver() {
        bus.driver = new BusDriver("Dmitriy");
        System.out.println("Bus driver has been created");

    }

    @Override
    public void addPassenger() {
        for (int i = 0; i < bus.limitPassenger / 3; i++) {
            bus.lPassengers.add(new BusPassenger(TypePassenger.Adult, "Liza"));
            bus.lPassengers.add(new BusPassenger(TypePassenger.Kid, "Elizaveta"));
            bus.lPassengers.add(new BusPassenger(TypePassenger.Free, "Lizzka"));
        }
        System.out.println("Bus passengers has been created");

    }

    @Override
    public void protectPassengers() {
    }

    @Override
    public void paintBoard() {
        // TODO Auto-generated method stub

    }

}
