package NewCar;

public class CarMain extends Util {
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

        Car car1 = new Car(door1, engine1, hood1, airBag1, bumper1, "BMW");
        Car car2 = new Car(door2, engine2, hood2, airBag2, bumper2, "Toyota");
        Util util = new Util();

        System.out.println(Util.carPrice(car1));
        System.out.println(Util.carPrice(car2));
        System.out.println(car1.getCarModel());
        System.out.println(car2.getCarModel());


    }
}
