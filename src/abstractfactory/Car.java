package abstractfactory;

/**
 * Created by jolly on 2017/4/23.
 */
public class Car extends Vehicle {

    public Car(String name, String color) {
        super(name, color);
    }

    @Override
    public void travel() {
        System.out.println("Car[name=" + this.getName() + ",color=" + this.getColor() + "]  travel..");
    }

    @Override
    public void whistle() {
        System.out.println("Car[name=" + this.getName() + ",color=" + this.getColor() + "]  whistle..");
    }
}
