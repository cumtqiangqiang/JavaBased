package com.cn.IO.inputstream.copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./test/1.txt");

        FileOutputStream fos = new FileOutputStream("./test/1_cp.txt");
        byte[] bytes =  new byte[6];
        int len = 0;
        while ((len = fis.read(bytes))!=-1){
//            数组的长度和起始
            fos.write(bytes,0,len);
        }

        fis.close();
        fos.close();

        System.out.println("over");

    }
}
