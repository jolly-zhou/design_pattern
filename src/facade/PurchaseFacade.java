package facade;

/**
 * 购买服务（最外层服务,外观模式的facade）
 *
 * 对订单、商品、支付做一个聚合
 *
 * Created by jolly on 2017/4/23.
 */
public class PurchaseFacade {

    private OrderService orderService;

    private ProductService productService;

    private PayService payService;

    public  PurchaseFacade() {
        this.orderService = new OrderService();
        this.productService = new ProductService();
        this.payService = new PayService();
    }

    public void purchage(long prodId,int num) {
        productService.selectProduct(prodId);
        long orderId = orderService.placeOrder(prodId,num);
        payService.pay(100,orderId);
    }
}
