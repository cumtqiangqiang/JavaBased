package com.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * A,B,C 三个线程 按顺序执行
 */
class shareData {
    private int flag = 1;
    private final Lock lock = new ReentrantLock();
    private final Condition c1 = lock.newCondition();
    private final Condition c2 = lock.newCondition();
    private final Condition c3 = lock.newCondition();

    public void print3() {
        lock.lock();
        try {
            while (flag != 1) {

                c1.await();
            }

            for (int i = 1; i <= 3; i++) {
                System.out.println(i);
            }
            flag = 2;
            // 通知第二个线程工作
            c2.signal();

        } catch (InterruptedException e) {
            e.printStackTrace();

        }finally {
            lock.unlock();
            System.out.println("========");
        }


    }
    public void print5() {
        lock.lock();

        try {

            while (flag != 2) {

                c3.await();
            }

            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
            }
            flag = 3;
            // 通知第二个线程工作
            c3.signal();

        } catch (InterruptedException e) {
            e.printStackTrace();

        }finally {
            lock.unlock();
            System.out.println("========");

        }


    }
    public void print7() {
        lock.lock();

        try {
            while (flag != 3) {

                c3.await();
            }

            for (int i = 1; i <= 7; i++) {
                System.out.println(i);
            }
            flag = 1;
            // 通知第二个线程工作
            c1.signal();

        } catch (InterruptedException e) {
            e.printStackTrace();

        }finally {
            lock.unlock();
            System.out.println("**************************");
        }


    }

}

public class ConditionDemo {

    public static void main(String[] args) {

        shareData sd = new shareData();

        new Thread(()->{
            for (int i = 0; i <5 ; i++) {
                sd.print3();
            }
        },"A").start();

        new Thread(()->{
            for (int i = 0; i <5 ; i++) {
                sd.print5();
            }
        },"B").start();
        new Thread(()->{
            for (int i = 0; i <5 ; i++) {
                sd.print7();
            }
        },"C").start();

    }
}
