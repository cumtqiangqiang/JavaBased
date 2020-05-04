package com.cn.qiang.GenericInterface;

public class GenericInterfaceImpl1 implements GenericInterface<String> {
    @Override
    public void show(String s) {
        System.out.println(s);
    }
}
