package Board;

import java.util.ArrayList;
import java.util.List;

import Driver.Driver;
import Passenger.Passenger;

public abstract class BoardAnyCar {
    public Driver driver;
    public List<Passenger> lPassengers = new ArrayList<>();

    public abstract boolean boardDriver();

    public abstract boolean boardPassenger();

    public boolean isMoving() {
        return boardDriver() && boardPassenger();
    }
}
