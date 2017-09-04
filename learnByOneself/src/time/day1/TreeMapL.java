package time.day1;

import time.day1.model.ComparatorByLength;
import time.day1.model.Student;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by FanXingGuo on 2017/9/4.
 */

/*
    有序的映射,在声明映射的时候,应当同时设置好排序方式,有两种方式,1.通过类2.通过实现方法

 */

public class TreeMapL {
    public static void main(String[] args) {
        TreeMap<Student,String> list=new TreeMap<Student,String>(new ComparatorByLength());
        list.put(new Student("A",1),"a");
        list.put(new Student("C",3),"c");
        list.put(new Student("B",2),"b");

        Set<Student> students=list.keySet();
        Iterator<Student>iterator=students.iterator();
        while (iterator.hasNext()){
            Student student=iterator.next();
            String name=student.getName();
            int age=student.getAge();
            System.out.println("Name:"+name+" age:"+age+" place:"+list.get(student));
        }
    }
}
