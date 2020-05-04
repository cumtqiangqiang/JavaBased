package com.cn.IO.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw  = new FileWriter("./test/3.txt");
        fw.write("HelloWord" );
        char[] chars = {'a','b','c','1','$','中'};
        fw.write(chars);
        fw.write(chars,2,2);
        fw.flush();
        fw.close();


    }
}
