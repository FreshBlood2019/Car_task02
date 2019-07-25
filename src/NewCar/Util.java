package NewCar;

public class Util {
    public static double carPrice (Car car) {
        return car.getHood().getPriceHood()+ car.getEngine().getPriceEngine()
                + car.getBumper().getPriceBumper() + car.getAirBag().getPriceAirBag()
                + car.getDoor().getPrice();
    }
}
