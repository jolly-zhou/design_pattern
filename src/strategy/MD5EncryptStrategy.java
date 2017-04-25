package strategy;

/**
 * Created by jolly on 2017/4/23.
 */
public class MD5EncryptStrategy implements EncryptStrategy {

    @Override
    public void encrypt(String str) {
        System.out.println("MD5 Encrypt " + str);
    }
}
