package com.cn.qiang.GenericInterface;

public class GenericInterfaceImpl2<I> implements GenericInterface<I> {
    @Override
    public void show(I i) {
        System.out.println(i);
    }
}
