package cor;

/**
 * Created by jolly on 2017/4/25.
 */
public abstract class CarHandler {

    private CarHandler nextHandler;

    protected CarHandler setNextHandler(CarHandler handler) {
        this.nextHandler = handler;
        return handler;

    }

    protected CarHandler getNextHandler() {
        return this.nextHandler;
    }

    protected boolean next() {
        return this.nextHandler != null;
    }


    public abstract void handler();
}
