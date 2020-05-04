package com.cn.IO;

import java.io.File;

public class DemoFileMothed1 {

    public static void main(String[] args) {
//       show01();
       show02();
    }
    private static void show01(){
        File f = new File("./test/11/22/33/44");
        File[] files = f.listFiles();
        for (File file:files) {
            System.out.println(file);
        }

    }

    private static void show02(){
        File f = new File("./test");
//        不遍历子目录
        String[] list = f.list();
        for (String s :list) {
            System.out.println(s);
        }


    }
}
