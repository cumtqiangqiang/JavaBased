package com.learn.oop;

public interface InterPerson {
    void run();
    String getName();
    default void  eat(){
        System.out.println(getName() + ":is eating");
    }
}
