package strategy;

/**
 * 策略模式
 *
 * Created by jolly on 2017/4/23.
 */
public class Main {

    public static void main(String[] args) {

        EncryptStrategy strategy = new MD5EncryptStrategy();
        EncryptContext ctx = new EncryptContext(strategy);
        ctx.encrypt("Hello");

        EncryptStrategy strategy1 = new AESEncryptStategy();
        ctx = new EncryptContext(strategy1);
        ctx.encrypt("Hello");
    }
}
