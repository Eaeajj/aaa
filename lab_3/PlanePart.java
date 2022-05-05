public abstract class PlanePart {
    public double weight;

    public abstract double getWeight();

    public abstract void remove(int number);

    public abstract void add(PlanePart part);

    public abstract int getNumber();

    public abstract void print();
}
