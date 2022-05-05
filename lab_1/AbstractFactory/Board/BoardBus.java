package AbstractFactory.Board;

import AbstractFactory.Driver.BusDriver;
import AbstractFactory.Driver.TypeLicense;
import AbstractFactory.Passenger.BusPassenger;
import AbstractFactory.Passenger.TypePassenger;

public class BoardBus extends BoardAnyCar {
    public TypeLicense license;
    public int limitPassenger;

    public BoardBus() {
        driver = new BusDriver("Sergei");
        license = TypeLicense.D;
        limitPassenger = 30;

        for (int i = 0; i < limitPassenger / 2; i++) {
            lPassengers.add(new BusPassenger(TypePassenger.Adult, "Vasiliyi"));
            lPassengers.add(new BusPassenger(TypePassenger.Kid, "Vasyu"));
        }
    }

    @Override
    public boolean boardDriver() {
        return driver.typeLicense.equals(license);
    }

    @Override
    public boolean boardPassenger() {
        return limitPassenger >= lPassengers.size();
    }
}
