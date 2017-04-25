package strategy;

/**
 * Created by jolly on 2017/4/23.
 */
public class EncryptContext {

    private EncryptStrategy strategy;

    public EncryptContext(EncryptStrategy strategy) {
        this.strategy = strategy;
    }

    public void encrypt(String str) {
        this.strategy.encrypt(str);
    }
}
