package com.cn.IO.propertity;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo1 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("Tom","25");
        properties.setProperty("谷歌","good");
        properties.setProperty("Feng","34");
        properties.setProperty("JackMa","56");

        properties.store(new FileOutputStream("./test/proper1.pro"),"save data");
        properties.store(new FileWriter("./test/proper2.pro"),"save data");


    }
}
