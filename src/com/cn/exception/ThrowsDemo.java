package com.cn.exception;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;

public class ThrowsDemo {
    public static void main(String[] args) throws FileNotFoundException {
        read("1.txt");
    }

    private static void read(String path)  {
        if (!path.equals("a.txt")){
            try {
                throw new FileNotFoundException("FileNotFound");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }finally {
                System.out.println("Finally");
            }
        }

    }


}
