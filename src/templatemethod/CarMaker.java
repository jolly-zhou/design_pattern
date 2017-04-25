package templatemethod;

/**
 * Created by jolly on 2017/4/25.
 */
public abstract class CarMaker {

    public abstract void makeHead();

    public abstract void makeBody();

    public abstract void makeTail();

    public void make() {
        System.out.println("make car begin -->");
        this.makeHead();
        this.makeBody();
        this.makeTail();
        System.out.println("make car end <--");
    }
}
