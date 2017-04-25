package facade;

/**
 * Facade（外观）模式
 *
 * Created by jolly on 2017/4/23.
 */
public class Main {

    public static void main(String[] args) {
        PurchaseFacade purchaseFacade = new PurchaseFacade();
        purchaseFacade.purchage(123,1);
    }
}
