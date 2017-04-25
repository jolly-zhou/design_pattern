package proxy.base;

/**
 * Created by jolly on 2017/4/23.
 */
public class RealSubject implements Subject {
    @Override
    public void saleBook() {
        System.out.println("sale...");
    }
}
