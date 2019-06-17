package com.cn.methodReference;

import java.util.function.Supplier;

public class MethodReferenceDemo2 {
        private static void getString(Supplier<String> supplier){
            String s = supplier.get();
            System.out.println(s);
        }

    public static void main(String[] args) {
            String str = "hello";

            getString(()->{

                return str.toUpperCase();
            });

            getString(()->str.toUpperCase());

            getString(str::toUpperCase);


    }



}
