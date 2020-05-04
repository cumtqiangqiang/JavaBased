package com.cn.IO;

import java.io.File;
import java.io.IOException;

public class DemoFileMothed {
    public static void main(String[] args) {
        File file = new File("./Resource/a.txt");

//        System.out.println(file.getName());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getPath());
//        System.out.println(file.length());

        File f1 = new File("./test");
        boolean b =  f1.mkdir();
        System.out.println(b);

        File f2 = new File("./test/11/22/33/44");
        boolean b1 = f2.mkdirs();
        System.out.println(b1);

        File f3 = new File("./test/11/22/33/44/test.txt");
        try {
            boolean b2 = f3.createNewFile();
            System.out.println(b2);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
