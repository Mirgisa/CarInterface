

//Create FourDoorToyota, FourDoorBMW,  FourDoorFord, FourDoorHyundai classes, inherited from FourDoorCar.

//Implement necessary functions and write constructor.

public interface Car1 {


    void run();
    void stop();
    void repair();
    //void carType();
}
abstract class FourDoorCar1 implements Car1 {
    protected String model;
    protected String name;
    protected int year;
    protected String engineType;

    public FourDoorCar1(String model,int year,String engineType,String name) {
        this.model = model;
        this.year =year;
        this.engineType= engineType;
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getEngineType() {
        return engineType;
    }

    @Override
    public String toString() {
        return "FourDoorCar1{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", engineType='" + engineType + '\'' +
                '}';
    }

    @Override
    public void run() {
        System.out.println(name + " is running.");
    }

    @Override
    public void stop() {
        System.out.println(name + " has stopped.");
    }

    @Override
    public void repair() {
        System.out.println(name + " is being repaired.");
    }
}
class FourDoorToyota1 extends FourDoorCar1 {


    public FourDoorToyota1(String model, int year, String engineType, String name) {
        super(model, year, engineType, name);
    }
}
// FourDoorBMW class extending FourDoorCar
class FourDoorBMW1 extends FourDoorCar1 {


    public FourDoorBMW1(String model, int year, String engineType, String name) {
        super(model, year, engineType, name);
    }
}
// FourDoorFord class extending FourDoorCar
class FourDoorFord1 extends FourDoorCar1 {

    public FourDoorFord1(String model, int year, String engineType, String name) {
        super(model, year, engineType, name);
    }
}
// FourDoorHyundai class extending FourDoorCar
class FourDoorHyundai1 extends FourDoorCar1 {

    public FourDoorHyundai1(String model, int year, String engineType, String name) {
        super(model, year, engineType, name);
    }
}
abstract class TwoDoorCar1 implements Car1 {
    protected String model;
    protected int seat;
    protected String country;
    protected String name;


    public TwoDoorCar1(String model, int seat, String country,String name) {
        this.model = model;
        this.seat = seat;
        this.country = country;
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public int getSeat() {
        return seat;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TwoDoorCar1{" +
                "model='" + model + '\'' +
                ", seat=" + seat +
                ", country='" + country + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void run() {
        System.out.println(name +"is Running");
    }

    @Override
    public void stop() {
        System.out.println(name+" has Stopped");
    }

    @Override
    public void repair() {
        System.out.println(name+ " has repaired");

    }
}
class TwoDoorToyota1 extends TwoDoorCar1 {
    public TwoDoorToyota1(String model, int seat, String country, String name) {
        super(model, seat, country, name);
    }
}
class TwoDoorBMW1 extends TwoDoorCar1{

    public TwoDoorBMW1(String model, int seat, String country, String name) {
        super(model, seat, country, name);
    }
}
class TwoDoorFord1 extends TwoDoorCar1{

    public TwoDoorFord1(String model, int seat, String country, String name) {
        super(model, seat, country, name);
    }
}
class TwoDoorHyundai1 extends TwoDoorCar1{

    public TwoDoorHyundai1(String model, int seat, String country, String name) {
        super(model, seat, country, name);
    }
}
// Create TwoDoorToyota, TwoDoorBMW,  TwoDoorFord, TwoDoorHyundai classes, inherited from TwoDoorCar.
//
//Implement necessary functions and write constructor.
