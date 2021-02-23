package com.juc;

import scala.Int;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
// 可以有返回值
class Mythread implements Callable<Integer>{


    @Override
    public Integer call() throws Exception {
        System.out.println("Come in call method");
        return 1024;
    }
}

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//       FutureTask 实现了Runnable 接口
        FutureTask<Integer> futureTask = new FutureTask<>(new Mythread());
        new Thread(futureTask,"A").start();
        Integer a = futureTask.get();
        System.out.println(a);



    }
}
