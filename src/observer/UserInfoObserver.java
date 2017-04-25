package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by jolly on 2017/4/23.
 */
public class UserInfoObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(o + " hasChanged...");
        System.out.println("arg:=" + arg);
    }
}
