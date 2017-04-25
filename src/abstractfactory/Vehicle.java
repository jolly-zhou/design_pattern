package abstractfactory;

/**
 * Created by jolly on 2017/4/23.
 */
public abstract class Vehicle {

    protected String name;

    private String color;

    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    /**
     * 行驶
     */
   public abstract  void travel();

    /***
     * 鸣笛
     */
    public abstract void whistle();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
