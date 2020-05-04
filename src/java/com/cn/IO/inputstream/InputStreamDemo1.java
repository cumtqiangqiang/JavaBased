package com.cn.IO.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./test/1.txt");
        int len = 0;
        while ((len=fis.read())!=-1){
            System.out.println(len);
        }
        fis.close();
    }
}
