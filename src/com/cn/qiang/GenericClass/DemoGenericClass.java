package com.cn.qiang.GenericClass;

import com.cn.qiang.collection.Generic;

public class DemoGenericClass {
    public static void main(String[] args) {
        GenericClass<Integer> generic = new GenericClass<Integer>();
        generic.setE(1);
        Integer a = generic.getE();
        System.out.println(a);

        GenericClass<String> genericClass = new GenericClass<String>();
        genericClass.setE("HelloWorld");
        String b = genericClass.getE();
        System.out.println(b);



    }

}
