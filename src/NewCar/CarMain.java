package NewCar;

public class CarMain {
    public static void main(String[] args) {
        Door door1 = new Door(1, 70, "Toyota");
        Door door2 = new Door (2, 80, "Bosh");

        Engine engine1 = new Engine(1, 500, "Toyota");
        Engine engine2 = new Engine(2, 700, "Bosh");

        Hood hood1 = new Hood(1, 30, "Toyota");
        Hood hood2 = new Hood(2, 40, "Bosh");

        Bumper bumper1 = new Bumper(1, 50, "Toyota");
        Bumper bumper2 = new Bumper(2, 60, "Bosh");

        AirBag airBag1 = new AirBag(1, 35, "Toyota");
        AirBag airBag2 = new AirBag(2, 45, "Bosh");



    }
}
