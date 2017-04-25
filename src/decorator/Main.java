package decorator;

/**
 * 装饰者模式
 *
 * 给核心对象扩展一个功能,是继承是另外一种替代方案
 *
 * Created by jolly on 2017/4/23.
 */
public class Main {

    public static void main(String[] args) {

        RunCar car = new RunCar();
//        car.show();

        FlyCarDecorator fly = new FlyCarDecorator(car);
//        fly.show();

        SwimCarDecorator swim = new SwimCarDecorator(fly);
        swim.show();
    }
}
