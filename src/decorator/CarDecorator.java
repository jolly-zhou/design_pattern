package decorator;

/**
 * Created by jolly on 2017/4/23.
 */
public abstract class CarDecorator implements Car {

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public CarDecorator(Car c) {
        this.car = c;
    }

    public abstract void show();
}
