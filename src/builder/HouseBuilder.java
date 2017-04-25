package builder;

import sun.security.ssl.HandshakeOutStream;

/**
 * Created by jolly on 2017/4/23.
 */
public interface HouseBuilder {

    void makeFloor();

    void makeWindow();

    void makeTop();

    void makeDoor();

    House getHouse();
}
