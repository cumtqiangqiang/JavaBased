package com.learn.oop;

import java.util.Arrays;
import java.util.StringJoiner;

public class App {
    public static void main(String[] args) {
//         Person p = new Person("Tom",20);
//        System.out.println(p.getName());
//        Person1 p1 = new Student("qiang",22,100);
//        System.out.println(p1.hello());
//
//        ImpStudent stu1 = new ImpStudent();
//        stu1.eat();
//        stu1.count = 20;
//        stu1.count = 30;
//        int count = ImpStudent.count;
//        System.out.println(count);

        String s = "A,B,C,D";
        String[] arr = s.split(",");
        System.out.println(Arrays.toString(arr));

        String[] names = {"Bob","Alice","Grace"};
        StringJoiner sj =  new StringJoiner(",","Hello ","!");

        for (String name:names) {
            sj.add(name);
        }
        System.out.println(sj.toString());

    }
}
