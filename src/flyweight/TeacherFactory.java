package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jolly on 2017/4/23.
 */
public class TeacherFactory {

    private Map<String,Teacher> teacherMap;

    public TeacherFactory(){
        teacherMap = new HashMap<>();
    }

    public Teacher getTeacher(String tNo) {
        Teacher t = teacherMap.get(tNo);
        if(t == null) {
            t = new Teacher(tNo);
            teacherMap.put(tNo,t);
        }
        return t;
    }
}
