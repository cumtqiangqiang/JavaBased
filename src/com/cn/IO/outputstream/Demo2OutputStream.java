package com.cn.IO.outputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;


public class Demo2OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("./test/1.txt"));

        byte[]bytes = "你好".getBytes();
        fos.write(bytes);
        System.out.println(Arrays.toString(bytes));
        fos.close();
    }

}
