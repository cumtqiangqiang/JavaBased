package com.cn.IO;

import java.io.File;

public class DemoRecurtionFiles {
    public static void main(String[] args) {
        getAllFiles(new File("./test"));
    }

    private static void getAllFiles(File dir){
        File[] files = dir.listFiles();
        for (File f:files) {
            if (f.isDirectory()){
                getAllFiles(f);
            }else {
                String name = f.getName();
                System.out.println(name);
            }

        }

    }

}
