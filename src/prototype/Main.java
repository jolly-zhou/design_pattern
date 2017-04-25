package prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式,通过Clonable接口,实现克隆
 * 注意 浅度拷贝（对基本类型的拷贝）,深度拷贝（对引用的拷贝）
 * Created by jolly on 2017/4/23.
 */
public class Main {

    public static void main(String[] args) {

        List<String> fs =new ArrayList<>();
        fs.add("wangwu");
        fs.add("zhaoliu");
        Person p1 = new Person();
        p1.setName("zhangsan");
        p1.setAge(30);
        p1.setSex("male");
        p1.setFriends(fs);
        System.out.println(p1);


        Person p2 = p1.clone();
        p2.setName("lisi");
        p2.getFriends().add("zhouqi");
        System.out.println(p2);



    }
}
