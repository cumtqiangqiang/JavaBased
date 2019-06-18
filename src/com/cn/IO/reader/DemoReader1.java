package com.cn.IO.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoReader1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("./test/2.txt");
        int len = 0;
        while ((len = fr.read())!=-1){
            System.out.println(len);
        }


    }

}
