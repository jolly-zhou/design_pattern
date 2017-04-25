package flyweight;

/**
 * 享元模式
 * 即Flyweight模式,  通过与其他类似对象共享数据来减小内存占用
 *
 * Created by jolly on 2017/4/23.
 */
public class Main {

    public static void main(String[] args) {

        TeacherFactory factory = new TeacherFactory();
        Teacher t1 = factory.getTeacher("001");
        Teacher t2 = factory.getTeacher("002");
        Teacher t3 = factory.getTeacher("003");

        Teacher t11 = factory.getTeacher("001");
        System.out.println(t1 == t11);
    }
}
