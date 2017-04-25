package facade;

/**
 * 支付服务
 *
 * Created by jolly on 2017/4/23.
 */
public class PayService {

    public void pay(double money,long orderId) {
        System.out.println("pay for order[id=" + orderId + "],money=" + money) ;
    }
}
