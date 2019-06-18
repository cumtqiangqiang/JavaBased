package com.cn.IO.inputstream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./test/1.txt");
        byte[] b = new byte[3];
        while ((fis.read(b))!=-1){
            System.out.println(new String(b));
        }



    }

}
