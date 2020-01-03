package cn.qiang.learn.oop;

public class Person1 {
    protected String name;
    protected int age;

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

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String hello(){
        return "Hello "+ name;
    }
}
