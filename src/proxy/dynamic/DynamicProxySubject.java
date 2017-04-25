package proxy.dynamic;

import proxy.base.RealSubject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by jolly on 2017/4/23.
 */
public class DynamicProxySubject implements InvocationHandler {

    private RealSubject subject;

    public void setSubject(RealSubject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        this.discount();
        Object result = method.invoke(subject,args);
        this.give();

        return result;
    }

    private void discount() {
        System.out.println("discount before sale...");
    }

    private void give() {
        System.out.println("give Voucher after sale....");
    }
}
