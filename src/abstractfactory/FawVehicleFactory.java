package abstractfactory;

/**
 * Created by jolly on 2017/4/23.
 */
public class FawVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle getBus(String name, String color) {
        return new Bus(name,color);
    }

    @Override
    public Vehicle getCar(String name, String color) {
        return new Car(name,color);
    }
}
