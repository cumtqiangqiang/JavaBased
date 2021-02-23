package com.builder;

public class Test {
    public static void main(String[] args) {
        Student stu = Student.builder().name("qqiang").age(22).email("test@163.com").build();


        System.out.println(stu);

    }
}
