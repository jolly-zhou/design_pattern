package decorator;

/**
 * Created by jolly on 2017/4/23.
 */
public class FlyCarDecorator extends CarDecorator {
    public FlyCarDecorator(Car c) {
        super(c);
    }

    @Override
    public void run() {
        //
    }

    @Override
    public void show() {
        this.getCar().show();
        this.fly();
    }

    public void fly(){
        System.out.println("Car flying");
    }


}
