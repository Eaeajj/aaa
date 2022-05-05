import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        ArrayList<PlanePart> passengers = new ArrayList<>();
        passengers.add(new Passenger(PassengerType.Business, "Vasiy", 1));
        passengers.add(new Passenger(PassengerType.Economy, "Petyu", 2));
        passengers.add(new Passenger(PassengerType.First, "Kirill", 3));
        passengers.add(new Passenger(PassengerType.Pilot, "Lecha", 4));
        passengers.add(new Passenger(PassengerType.Stewardess, "Sasha", 5));

        for (int i = 0; i < passengers.size(); i++) {
            passengers.get(i).print();
        }
        System.out.println("\n");

        PlanePart cabin = new Cabin(passengers);
        cabin.remove(1);
        cabin.remove(3);
        cabin.remove(4);
        cabin.remove(5);

        for (int i = 0; i < passengers.size(); i++) {
            passengers.get(i).print();
        }

    }
}
