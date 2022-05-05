import java.util.ArrayList;

public class Cabin extends PlanePart {
    public ArrayList<PlanePart> part;

    @Override
    public double getWeight() {
        double sum = 0;
        for (int i = 0; i < part.size(); i++) {
            sum += part.get(i).getWeight();
        }
        return sum;
    }

    public Cabin(ArrayList<PlanePart> lPassengers) {
        part = lPassengers;
    }

    @Override
    public void remove(int number) {
        int index = 0;
        for (int i = 0; i < part.size(); i++) {
            if (part.get(i).getNumber() == number) {
                index = i;
                part.remove(index);
            }
        }
    }

    @Override
    public int getNumber() {
        return 0;
    }

    @Override
    public void add(PlanePart part) {
        // TODO Auto-generated method stub

    }

    @Override
    public void print() {
        // TODO Auto-generated method stub

    }
}
