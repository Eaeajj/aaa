package Board.Builder;

import Board.BoardAnyCar;
import Board.BoardTaxi;
import Driver.TaxiDriver;
import Passenger.TaxiPassenger;
import Passenger.TypePassenger;

public class TaxiBuilder extends BoardBuilder {
    public BoardTaxi taxi;

    @Override
    public BoardAnyCar getBoard() {
        System.out.println("Taxi was served");
        return taxi;
    }

    @Override
    public void createBoard() {
        taxi = new BoardTaxi();
        System.out.println("Taxi has been created");
    }

    @Override
    public void addDriver() {
        taxi.driver = new TaxiDriver("Aleksey");
        System.out.println("Taxi driver has been created");

    }

    @Override
    public void addPassenger() {
        for (int i = 0; i < taxi.limitPassenger / 2; i++) {
            taxi.lPassengers.add(new TaxiPassenger(TypePassenger.Adult, "Sveta"));
            taxi.lPassengers.add(new TaxiPassenger(TypePassenger.Kid, "Svetlana"));
        }
        System.out.println("Taxi passengers has been created");

    }

    @Override
    public void protectPassengers() {
        for (int i = 0; i < taxi.lPassengers.size(); i++) {
            TaxiPassenger passenger = (TaxiPassenger) taxi.lPassengers.get(i);
            if (passenger.typePassenger.equals(TypePassenger.Kid)) {
                passenger.onCarSeat = true;

            }
        }
        System.out.println("Child seat was created");
    }

    @Override
    public void paintBoard() {
        // TODO Auto-generated method stub

    }

}
