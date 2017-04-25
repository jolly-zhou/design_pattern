package templatemethod;

/**
 * 模板方法模式:
 *
 * Template Method模式也叫模板方法模式，是行为模式之一，
 * 它把具有特定步骤算法中的某些必要的处理委让给抽象方法，
 * 通过子类继承对抽象方法的不同实现改变整个算法的行为
 * Created by jolly on 2017/4/25.
 */
public class Main {

    public static void main(String[] args) {
        CarMaker jeepCarMakermaker = new JeepCarMaker();
        jeepCarMakermaker.make();

        CarMaker busCarMaker = new BusMaker();
        busCarMaker.make();
    }
}
