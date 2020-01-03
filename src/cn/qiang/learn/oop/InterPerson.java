package cn.qiang.learn.oop;

public interface InterPerson {
    void run();
    String getName();
    default void  eat(){
        System.out.println(getName() + ":is eating");
    }
}
