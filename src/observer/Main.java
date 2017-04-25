package observer;

/**
 * 观察者模式
 *
 * Created by jolly on 2017/4/23.
 */
public class Main {

    public static void main(String[] args) {
        UserInfo user = new UserInfo();
        UserInfoObserver observ = new UserInfoObserver();
        user.addObserver(observ);

        user.setId(123L);
        user.setUsername("Tom");
        user.setPassword("123456");

        user.setPassword("1qaz@WSX");
    }
}
