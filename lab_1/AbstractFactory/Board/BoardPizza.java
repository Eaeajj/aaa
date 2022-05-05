package AbstractFactory.Board;

import AbstractFactory.Driver.PizzaDriver;
import AbstractFactory.Driver.TypeLicense;
import AbstractFactory.Passenger.PizzaPassenger;
import AbstractFactory.Passenger.TypePassenger;

public class BoardPizza extends BoardAnyCar {
    public TypeLicense license;
    public int limitPassenger;

    public BoardPizza() {
        driver = new PizzaDriver("Sasha");
        license = TypeLicense.A;
        limitPassenger = 1;

        lPassengers.add(new PizzaPassenger(TypePassenger.Pizza, "Vova"));

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
