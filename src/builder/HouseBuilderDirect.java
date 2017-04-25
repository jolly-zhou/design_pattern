package builder;

import sun.security.ssl.HandshakeOutStream;

/**
 * Created by jolly on 2017/4/23.
 */
public class HouseBuilderDirect {

    private HouseBuilder builder;

    public HouseBuilderDirect(HouseBuilder builder) {
        this.builder = builder;
    }

    public House makeHouse(){
        builder.makeDoor();
        builder.makeFloor();
        builder.makeTop();
        builder.makeWindow();
        return builder.getHouse();
    }
}
