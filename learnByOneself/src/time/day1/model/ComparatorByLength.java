package time.day1.model;

import java.util.Comparator;

/**
 * Created by FanXingGuo on 2017/9/4.
 */
public class ComparatorByLength implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge()-o2.getAge();
    }
}
