package com.jmm;

class Student{
//   volatile 可见性，一个线程修改了数据，可以通知另一个线程获取到最新的数据，不加这个的话，线程之间无法共享这个变量
    volatile int  age = 10;
    public void changeAge(){
        age = 20;
    }

}

public class JMMTest {
    public static void main(String[] args) {
        Student stu = new Student();

        new Thread(()->{
            try {
                Thread.sleep(3000);
                stu.changeAge();
                System.out.println("change age to 20");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        },"A").start();

        while (stu.age == 10){


        }
        System.out.println("name has changed");

    }


}
