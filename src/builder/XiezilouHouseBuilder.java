package builder;

/**
 * Created by jolly on 2017/4/23.
 */
public class XiezilouHouseBuilder implements HouseBuilder {

    House house = new House();

    @Override
    public void makeFloor() {
        house.setFloor("xiezilou floor");
    }

    @Override
    public void makeWindow() {
        house.setWindow("xiezilou window");
    }

    @Override
    public void makeTop() {
        house.setTop("xiezilou top");
    }

    @Override
    public void makeDoor() {
        house.setDoor("xiezilou door");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
