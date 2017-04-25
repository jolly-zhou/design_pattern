package decorator;

/**
 * Created by jolly on 2017/4/23.
 */
public class RunCar implements Car{

    @Override
    public void run() {
        System.out.println("Car Running...");
    }

    @Override
    public void show() {
        this.run();
    }
}
