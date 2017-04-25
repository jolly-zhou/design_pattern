package templatemethod;

/**
 * Created by jolly on 2017/4/25.
 */
public class JeepCarMaker extends CarMaker {
    @Override
    public void makeHead() {
        System.out.println("make jeep head");
    }

    @Override
    public void makeBody() {
        System.out.println("make jeep body");
    }

    @Override
    public void makeTail() {
        System.out.println("make jeep tail");
    }
}
