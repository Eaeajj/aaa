package Board;

import Driver.TypeLicense;
// import Passenger.TaxiPassenger;
// import Passenger.TypePassenger;

public class BoardTaxi extends BoardAnyCar {
    public TypeLicense license;
    public int limitPassenger;
    public double price;

    public BoardTaxi() {
        license = TypeLicense.B;
        limitPassenger = 4;
        price = 300;

        // for (int i = 0; i < limitPassenger / 2; i++) {
        // lPassengers.add(new TaxiPassenger(TypePassenger.Adult, "Petr"));
        // lPassengers.add(new TaxiPassenger(TypePassenger.Kid, "Petyu"));
        // }
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
