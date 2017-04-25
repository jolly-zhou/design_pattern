package decorator;

/**
 * Created by jolly on 2017/4/23.
 */
public class SwimCarDecorator extends CarDecorator {
    public SwimCarDecorator(Car c) {

        super(c);
    }

    @Override
    public void run() {

    }

    @Override
    public void show() {
        this.getCar().show();
        swim();
    }

    private void swim() {
        System.out.println("Car swimming..");
    }
}
