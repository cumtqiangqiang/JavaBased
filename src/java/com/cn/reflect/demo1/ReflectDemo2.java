package com.cn.reflect.demo1;

public class ReflectDemo2 {

    public static void main(String[] args) throws ClassNotFoundException {
        Class  clazz = Class.forName("com.cn.reflect.demo1.Person");
        String simpleName = clazz.getSimpleName();
        System.out.println(simpleName);

        String name = clazz.getName();
        System.out.println(name);


    }


}
