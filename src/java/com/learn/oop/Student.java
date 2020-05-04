package com.learn.oop;

public class Student extends Person1 {
   protected int score;
    public Student(String name, int age,int score) {
        super(name, age);
        this.score = score;
    }

    @Override
    public String hello() {
        name = name + " Test";
        return super.hello() + "!";
    }
}
