package Board;

import Driver.TypeLicense;

public class BoardBus extends BoardAnyCar {
    public TypeLicense license;
    public int limitPassenger;
    public double price;

    public BoardBus() {
        license = TypeLicense.D;
        limitPassenger = 30;
        price = 48;
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
