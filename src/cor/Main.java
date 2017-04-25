package cor;

/**
 *职责链模式
 * Chain of Responsibility（CoR）模式也叫职责链模式或者职责连锁模式，是行为模式之一，
 * 该模式构造一系列分别担当不同的职责的类的对象来共同完成一个任务，
 * 这些类的对象之间像链条一样紧密相连，所以被称作职责链模式
 * Created by jolly on 2017/4/25.
 */
public class Main {

    public static void main(String[] args) {
        CarHandler head = new CarHeaderHandler();
        CarHandler body = new CarBodyHandler();
        CarTailHandler tail = new CarTailHandler();
        head.setNextHandler(body).setNextHandler(tail);
        head.handler();
    }
}
