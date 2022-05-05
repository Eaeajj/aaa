package AbstractFactory.Driver;

public abstract class Driver {
    public TypeLicense typeLicense;
    public String nameDriver;

    public Driver(TypeLicense type, String name) {
        typeLicense = type;
        nameDriver = name;

        System.out.println("Driver " + nameDriver + " with license " + typeLicense.toString());
    }
}
