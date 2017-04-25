package builder;

/**
 * Created by jolly on 2017/4/23.
 */
public class GongyuHouseBuilder implements HouseBuilder {

    private House house = new House();

    @Override
    public void makeFloor() {
        house.setFloor("gongyu floor");
    }

    @Override
    public void makeWindow() {
        house.setWindow("gongyu window");
    }

    @Override
    public void makeTop() {
        house.setTop("gongyu top");
    }

    @Override
    public void makeDoor() {
        house.setDoor("gongyu door");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
