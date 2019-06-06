package com.cn.qiang.GenericInterface;

public class DemoGenericInterface {
    public static void main(String[] args) {
        GenericInterface<String> g1 = new GenericInterfaceImpl1();
        g1.show("Qiang");

        GenericInterface<Integer> g2 = new GenericInterfaceImpl2();
        g2.show(2);

    }


}
