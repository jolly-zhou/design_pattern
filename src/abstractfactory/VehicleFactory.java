package abstractfactory;

/**
 * Created by jolly on 2017/4/23.
 */
public interface VehicleFactory {

    /**
     * 创建bus
     * @param name
     * @param color
     * @return
     */
    Vehicle getBus(String name,String color);

    /**
     * 创建car
     * @param name
     * @param color
     * @return
     */
    Vehicle getCar(String name,String color);
}
