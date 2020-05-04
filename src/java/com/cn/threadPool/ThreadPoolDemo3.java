package com.cn.threadPool;

import java.util.Scanner;
import java.util.concurrent.*;

public class ThreadPoolDemo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        while (true){
            System.out.println("Please input a number");
            long num = new Scanner(System.in).nextInt();
            Future<Long> f = ex.submit(new Callable<Long>() {
                @Override
                public Long call() throws Exception {
                    long sum = 0L;
                    for (long i = 1; i <=num ; i++) {
                        sum+=i;
                    }
                    return sum;
                }
            });
            System.out.println("sum:"+f.get());
        }


    }
}
