package proxy.base;

/**
 * 代理模式  <br/>
 * 是指具有与代理元（被代理的对象）具有相同的接口的类，客户端必须通过代理与被代理的目标类交互，<br/>
 * 而代理一般在交互的过程中（交互前后），进行某些特别的处理.<br/>
 *
 * Created by jolly on 2017/4/23.
 */
public class Main {

    public static void main(String[] args) {

        RealSubject rs = new RealSubject();

        ProxySubject ps = new ProxySubject();
        ps.setSubject(rs);
        ps.saleBook();

    }
}
