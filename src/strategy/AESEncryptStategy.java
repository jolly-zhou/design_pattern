package strategy;

/**
 * Created by jolly on 2017/4/23.
 */
public class AESEncryptStategy implements EncryptStrategy {

    @Override
    public void encrypt(String str) {
        System.out.println("AES Encrypt " + str);
    }
}
