public class Passenger extends PlanePart {
    public PassengerType passengerType;
    public double extraPayment = 0;
    public String name;
    public int number;

    public Passenger(PassengerType type, String _name, int _number) {
        name = _name;
        number = _number;

        passengerType = type;
        weight = 5 + Math.random() * 55;

        switch (passengerType) {
            case Economy:
                if (weight > 20) {
                    extraPayment = 100;
                }
                break;
            case Business:
                if (weight > 35) {
                    extraPayment = 50;
                }
                break;
            case First:
                extraPayment = 0;
                break;
            case Pilot:
                weight = 0;
                break;
            case Stewardess:
                weight = 0;
                break;
        }
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void add(PlanePart part) {
        // TODO Auto-generated method stub

    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void print() {
        System.out.println(name + " " + number);

    }

}
