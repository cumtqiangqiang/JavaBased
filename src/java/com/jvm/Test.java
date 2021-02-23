package com.jvm;

import java.util.Random;

public class Test {
    public static void main(String[] args) {

//        long maxMemory = Runtime.getRuntime().maxMemory();// 虚拟机最大内存
//        long totalMemory = Runtime.getRuntime().totalMemory();
//        System.out.println("-Xmx:MAX_MEMORY  "+maxMemory/(double)1024/1024 + " M");
//        System.out.println("-Xms:TOTAL_MEMORY  " + totalMemory/(double)1024/1024 +" M");

        String str = "www.atguigu.com" ;
        while(true)
        {
            str += str + new Random().nextInt(88888888) + new Random().nextInt(999999999) ;
        }

    }

}


