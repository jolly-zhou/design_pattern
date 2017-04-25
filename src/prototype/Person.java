package prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jolly on 2017/4/23.
 */
public class Person implements Cloneable {

    private String name;

    private int age;

    private String sex;

    private List<String> friends;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    protected Person clone() {
        try {
            Person p = (Person) super.clone();
            List<String> fs = new ArrayList<>(this.friends);
            p.setFriends(fs);
            return p;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", friends=" + friends +
                '}';
    }
}
