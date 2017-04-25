package builder;

/**
 * 构造者模式
 *   direct --> builder --> object
 * Created by jolly on 2017/4/23.
 */
public class Main {

    public static void main(String[] args) {
        HouseBuilder builder = new GongyuHouseBuilder();

        HouseBuilderDirect direct = new HouseBuilderDirect(builder);
        House house =direct.makeHouse();


        System.out.println(house);

        builder = new XiezilouHouseBuilder();
        direct =  new HouseBuilderDirect(builder);
        house = direct.makeHouse();

        System.out.println(house);
    }
}
