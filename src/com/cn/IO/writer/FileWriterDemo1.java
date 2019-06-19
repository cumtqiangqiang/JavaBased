package com.cn.IO.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("./test/3.txt");
        fw.write(65);
        fw.write(100);
        fw.flush();
        fw.write(35);
        fw.close();
    }
}
