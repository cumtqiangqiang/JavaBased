package com.cn.reflect.demo1;

public class Person {
    private String name;
    private  int age;
    static {
        System.out.println("静态代码块");
    }
    public Person(){
        System.out.println("Person类的空参数构造方法");
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person类的满参数构造方法");
    }

    private Person(String name) {
        this.name = name;
        System.out.println("Person类的私有构造方法");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private void method(){
        System.out.println("私有方法");
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


}
