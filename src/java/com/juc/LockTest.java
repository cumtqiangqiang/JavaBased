package com.juc;


import java.util.concurrent.TimeUnit;

/**

 *  8 lock
 *1 标准访问，请问先打印邮件还是短信
 *2 暂停4秒钟在邮件方法，请问先打印邮件还是短信

一个对象如果有多个synchronized 方法，某一时刻内，只要有一个线程去调用其中的一个synchronized，其他的线程只能等待
锁定的是当前的对象this，被锁定后，其他的线程都不鞥进入当前对象的其他synchronized 方法

 *3 新增普通sayHello方法，请问先打印邮件还是hello
加一个普通的方法，与同步锁无关
 *4 两部手机，请问先打印邮件还是短信
两个对象不是同一个 锁 ？？
 *5 两个静态同步方法，同一部手机，请问先打印邮件还是短信
 *6 两个静态同步方法，2部手机，请问先打印邮件还是短信
static 对整个类 加锁
 *7 1个静态同步方法，1个普通同步方法,同一部手机，请问先打印邮件还是短信
 *8 1个静态同步方法，1个普通同步方法,2部手机，请问先打印邮件还是短信
 *
 */
class Phone{
    public static synchronized void sendEmail() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        System.out.println("********Email*******");
    }
    public static synchronized void sendSMS(){
        System.out.println("****SMS********");
    }
    public void sayHello(){
        System.out.println("HelloWorld");
    }


}
public class LockTest {
    public static void main(String[] args) throws InterruptedException {
        Phone phone = new Phone();
        Phone phone2 = new Phone();
        new Thread(() -> {
            try {
                phone.sendEmail();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"A").start();

        Thread.sleep(100);
        new Thread(()->{
            phone2.sendSMS();
//            phone.sayHello();
//            phone2.sendSMS();
        },"B").start();

    }
}
