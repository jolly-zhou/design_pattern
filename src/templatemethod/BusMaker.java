package templatemethod;


/**
 * Created by jolly on 2017/4/25.
 */
public class BusMaker extends CarMaker {
    @Override
    public void makeHead() {
        System.out.println("make bus head");
    }

    @Override
    public void makeBody() {
        System.out.println("make bus body");
    }

    @Override
    public void makeTail() {
        System.out.println("make bus tail");
    }
}
