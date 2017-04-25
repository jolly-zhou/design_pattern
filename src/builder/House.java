package builder;

/**
 * Created by jolly on 2017/4/23.
 */
public class House {

    private String floor;

    private String window;

    private String top;

    private String door;

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    @Override
    public String toString() {
        return "House{" +
                "floor='" + floor + '\'' +
                ", window='" + window + '\'' +
                ", top='" + top + '\'' +
                ", door='" + door + '\'' +
                '}';
    }
}
