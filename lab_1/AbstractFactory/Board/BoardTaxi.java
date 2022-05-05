package AbstractFactory.Board;

import AbstractFactory.Driver.TaxiDriver;
import AbstractFactory.Driver.TypeLicense;
import AbstractFactory.Passenger.TaxiPassenger;
import AbstractFactory.Passenger.TypePassenger;

public class BoardTaxi extends BoardAnyCar {
    public TypeLicense license;
    public int limitPassenger;

    public BoardTaxi() {
        driver = new TaxiDriver("Oleg");
        license = TypeLicense.B;
        limitPassenger = 4;

        for (int i = 0; i < limitPassenger / 2; i++) {
            lPassengers.add(new TaxiPassenger(TypePassenger.Adult, "Petr"));
            lPassengers.add(new TaxiPassenger(TypePassenger.Kid, "Petyu"));
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
