package facade;

/**
 * 订单服务
 * Created by jolly on 2017/4/23.
 */
public class OrderService {

    public long placeOrder(long prodId,int num) {
        System.out.println("Place order to product[id=" + prodId + "] and number=" + num + " and orderId="+1234);
        return 1234;
    }
}
