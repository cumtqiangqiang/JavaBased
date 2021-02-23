package com.juc;

import javax.print.DocFlavor;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ThreadSafeList {
    public static void main(String[] args) {
//      testArray();
//        testSet();

        testHash();
    }

    private static void testHash() {
        Map<String, String> map = new ConcurrentHashMap<>();

        for (int i = 0; i < 300; i++) {
            new Thread(()->{
                map.put(Thread.currentThread().getName(),UUID.randomUUID().toString().substring(0,8));

                System.out.println(map);
            },String.valueOf(i)).start();
        }

    }


    public static void  testSet(){
        Set<String> set = new CopyOnWriteArraySet<>();

        for (int i = 0; i < 300; i++) {
            new Thread(()->{
                set.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(set);
            },String.valueOf(i)).start();
        }

    }


    public static void testArray(){
        List<String> list =  new Vector<>();
//                new CopyOnWriteArrayList<>();
//                new Vector<>();
//                new ArrayList();
        for (int i = 1; i <=300; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(list);

            },String.valueOf(i)).start();

        }

    }
}
