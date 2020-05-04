package com.cn.reflect.demo2;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Properties pro = new Properties();
        pro.load(new FileReader("./test/reflectPro.txt"));

        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        Class clazz = Class.forName(className);
        Object obj = clazz.newInstance();
        Object method = clazz.getMethod(methodName);
        ((Method) method).invoke(obj);



    }
}
