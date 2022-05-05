package AbstractFactory.Passenger;

public abstract class Passenger {
    public TypePassenger typePassenger;
    public String namePassenger;

    public Passenger(TypePassenger type, String name) {
        typePassenger = type;
        namePassenger = name;

        System.out.println("Passenger " + namePassenger + " with type " + typePassenger.toString());
    }
}
