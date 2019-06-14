package com.cn.supplierInterface;

import java.util.function.Supplier;

public class SupplierDemo {
    public static String getString(Supplier<String> sup){
        String s = sup.get();

        return s;
    }

    public static void main(String[] args) {
        String name = getString(()->{
            return "Hello";
        });
        System.out.println(name);


    }

}
