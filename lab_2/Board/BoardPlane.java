package Board;

import Driver.TypeLicense;

public class BoardPlane extends BoardAnyCar {
    public TypeLicense license;
    public int limitPassenger;

    public BoardPlane() {
        license = TypeLicense.F;
        limitPassenger = 10;
    }

    @Override
    public boolean boardDriver() {
        return driver.typeLicense.equals(license);
    }

    @Override
    public boolean boardPassenger() {
        return limitPassenger >= lPassengers.size();
    }

    public void paintWhite() {
        System.out.println("Plane is painted white");
    }

}
