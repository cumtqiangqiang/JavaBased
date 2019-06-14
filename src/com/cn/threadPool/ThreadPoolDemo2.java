package com.cn.threadPool;

import java.util.Random;
import java.util.concurrent.*;

public class ThreadPoolDemo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        Future<Double> f =  ex.submit(new Callable<Double>() {


            @Override
            public Double call() throws Exception {
                return 1.1;
            }
        });

        Double d = f.get();
        System.out.println(d);

        Future<Integer> fi = ex.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return new Random().nextInt(100);
            }
        });
        System.out.println(fi.get());

        ex.shutdown();

    }


}
