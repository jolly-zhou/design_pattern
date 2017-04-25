package proxy.base;

/**
 * Created by jolly on 2017/4/23.
 */
public class ProxySubject {

    private RealSubject subject;

    public void setSubject(RealSubject subject) {
        this.subject = subject;
    }

    public void saleBook() {
        this.discount();
        this.subject.saleBook();
        this.give();
    }

    private void discount() {
        System.out.println("discount before sale...");
    }

    private void give() {
        System.out.println("give Voucher after sale....");
    }
}
