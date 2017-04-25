package proxy.dynamic;

import proxy.base.RealSubject;
import proxy.base.Subject;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 *
 * Created by jolly on 2017/4/23.
 */
public class Main {

    public static void main(String[] args) {
        RealSubject rs = new RealSubject();

        DynamicProxySubject dps = new DynamicProxySubject();
        dps.setSubject(rs);
        Subject proxy = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(),rs.getClass().getInterfaces(),dps);
        proxy.saleBook();
    }
}
