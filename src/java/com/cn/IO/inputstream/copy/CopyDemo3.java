package com.cn.IO.inputstream.copy;

import java.io.*;

public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./test/Desert.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("./test/Desert_buffer_cp.jpg"));
        int len = 0;

        while ((len = bis.read())!= -1){
            bos.write(len);
        }

//        byte[] bytes = new byte[5];
//        while ((len = bis.read(bytes))!=-1){
//            bos.write(bytes,0,len);
//        }

        bis.close();
        bos.close();
        System.out.println("over");
        long e = System.currentTimeMillis();

        System.out.println("BufferedStream has executed ："+(e-s)+"毫秒");// 57 41








    }
}
