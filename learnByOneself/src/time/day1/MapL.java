package time.day1;

import time.day1.model.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by FanXingGuo on 2017/9/4.
 */
/*
映射--Map 学习
Map的创建: Map<类型,类型> 变量名=new HashMap<类型,类型>();

Map常用方法:
添加:
    put(key,values);
    putAll()
获取:
    get(key) 根据键,获取值
    keySet() 获取映射中键组成的集合
删除:
    remove(key)
    clear() 清空
判断:
    containsKey()
    containsValue()
    isEmpty()
属性:
    ﻿size() 长度

 */
public class MapL {

    //******************************************************************************
    //遍历操作

    //教材
//    public static void main(String[] args) {
//
//    Map<Integer, String> map = new HashMap<Integer, String>();
//        map.put(2010, "xiaoqiang");
//        map.put(2011, "wangcai");
//        map.put(2012, "zhangsan");
//    Set<Integer> keySet = map.keySet();
//    Iterator<Integer> it = keySet.iterator();
//        while (it.hasNext()) {
//        Integer key = it.next();
//        String value = map.get(key);
//        System.out.println(key + "=" + value);
//    }
//}

    //My
//
//    public static void main(String[] args) {
//        Map<String,String> map=new HashMap<String,String>();
//        map.put("A","1");
//        map.put("B","2");
//        map.put("C","3");
//
//        Map<String,String> map1=new HashMap<String,String>();
//        map1.put("D","4");
//        map1.put("E","5");
//        map.putAll(map1);
//        map.remove("A");
//        Set<String> keys=map.keySet();
//        Iterator<String> iterator=keys.iterator();
//        System.out.println(map.size());
//        while (iterator.hasNext()){
//            String key=iterator.next();
//            System.out.println(key+"="+map.get(key));
//        }
//
//    }

    //******************************************************************************
    //通过键为对象,获取值

    //作对象判断时,应当覆写对象类的 hashCode和equals方法
    public static void main(String[] args) {
        HashMap<Student,String> lists=new HashMap<Student,String>();
        lists.put(new Student("张三",20),"山东");
        lists.put(new Student("李四",21),"湖北");
        lists.put(new Student("王五",18),"天津");

        Set<Student> students=lists.keySet();
        Iterator iterator=students.iterator();
        while (iterator.hasNext()){
            Student student =(Student) iterator.next();
            String name=student.getName();
            int age=student.getAge();
            String place=lists.get(student);
            System.out.println("姓名:"+name+" 年龄:"+age+" 住址:"+place);
        }
    }
}
