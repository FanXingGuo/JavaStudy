package time.day1.model;

/**
 * Created by FanXingGuo on 2017/9/4.
 */
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public int hashCode() {
        return this.name.hashCode()+this.age;
    }

    @Override
    public boolean equals(Object obj) {
        Student student=(Student)obj;
        if (this.age==student.getAge()&&this.name.equals(student.getName())){
            return true;
        }
        return false;
    }

//    @Override
//    public int compareTo(Object o) {
//        Student student=(Student) o;
//        return this.age-student.getAge();
//    }
}
