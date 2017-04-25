package abstractfactory;

/**
 * Created by jolly on 2017/4/23.
 */
public class Bus extends Vehicle {

    public Bus(String name, String color) {
        super(name, color);
    }

    @Override
    public void travel() {
        System.out.println("Bus[name=" + this.getName() + ",color=" + this.getColor() + "]  travel..");
    }

    @Override
    public void whistle() {
        System.out.println("Bus[name=" + this.getName() + ",color=" + this.getColor() + "]  whistle..");
    }
}
