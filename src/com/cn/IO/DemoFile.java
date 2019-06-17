package com.cn.IO;

import java.io.File;

public class DemoFile {
    public static void main(String[] args) {
        File parent = new File ("d:\\");
        String child = "a.txt";
        File file = new File(parent,child);
        System.out.println(file);

    }
}
