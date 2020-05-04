package com.learn.oop;

public class ImpStudent  implements  InterPerson  {

    public  static int count;
    @Override
    public void run() {

        System.out.println("Student is Running");
    }

    @Override
    public String getName() {
        return "qqiang";
    }
}
