package facade;

/**
 * 商品服务
 *
 * Created by jolly on 2017/4/23.
 */
public class ProductService {

    public void selectProduct(long prodId) {
        System.out.println("select product " + prodId);
    }

    public void updateStorage(long prodId,int num) {
        System.out.println("update product[" + prodId + "]'s storage -" +num);
    }
}
