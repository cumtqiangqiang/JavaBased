package com.cn.IO.inputstream.copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./test/photo.jpg");
        byte[] bytes = new byte[1024];
        FileOutputStream fos = new FileOutputStream("./test/copy_photo.jpg");
        int len = 0;
        while ((len = fis.read(bytes))!= -1){
            fos.write(bytes,0,len);
        }

        fos.close();
        fis.close();
        System.out.println("over");



    }
}
