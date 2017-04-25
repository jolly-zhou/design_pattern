package cor;

/**
 * Created by jolly on 2017/4/25.
 */
public class CarBodyHandler extends CarHandler {
    @Override
    public void handler() {
        System.out.println("组装车身");

        if(this.getNextHandler() != null) {
            this.getNextHandler().handler();
        }
    }
}
