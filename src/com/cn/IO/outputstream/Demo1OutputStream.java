package com.cn.IO.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./test/1.txt");
        try {
            fos.write(97);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            fos.close();
        }
    }

}
