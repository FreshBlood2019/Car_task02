package NewCar;


import java.util.Objects;

public class Car {
    private Door door;
    private Engine engine;
    private Hood hood;
    private AirBag airBag;
    private Bumper bumper;

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    private String carModel;

    public Car() {

    }

    public Car(Door door, Engine engine, Hood hood, AirBag airBag, Bumper bumper, String carModel) {
        this.door = door;
        this.engine = engine;
        this.hood = hood;
        this.airBag = airBag;
        this.bumper = bumper;
        this.carModel = carModel;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Hood getHood() {
        return hood;
    }

    public void setHood(Hood hood) {
        this.hood = hood;
    }

    public AirBag getAirBag() {
        return airBag;
    }

    public void setAirBag(AirBag airBag) {
        this.airBag = airBag;
    }

    public Bumper getBumper() {
        return bumper;
    }

    public void setBumper(Bumper bumper) {
        this.bumper = bumper;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(door, car.door) &&
                Objects.equals(engine, car.engine) &&
                Objects.equals(hood, car.hood) &&
                Objects.equals(airBag, car.airBag) &&
                Objects.equals(bumper, car.bumper);
    }

    @Override
    public int hashCode() {
        return Objects.hash(door, engine, hood, airBag, bumper);
    }

    @Override
    public String toString() {
        return "Car{" +
                "door=" + door +
                ", engine=" + engine +
                ", hood=" + hood +
                ", airBag=" + airBag +
                ", bumper=" + bumper +
                '}';
    }
}
