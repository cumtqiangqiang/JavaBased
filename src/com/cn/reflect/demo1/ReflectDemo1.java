package com.cn.reflect.demo1;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person p = new Person();
        Class c1 = p.getClass();
        System.out.println(c1);

        Class c2 = Person.class;
        System.out.println(c2);

        Class c3 = Class.forName("com.cn.reflect.demo1.Person");
        System.out.println(c3);

        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
        System.out.println(c2 == c3);

    }
}
