package com.cn.methodReference;

import java.util.function.Consumer;

public class MethodReferenceDemo1 {
    private static void printString(Consumer<String> con,String s ){
       con.accept(s);

    }
    public static void main(String[] args) {

        printString((String s)-> System.out.println(s),"HelloWorld");

        printString(s-> System.out.println(s),"HelloWorld");

        printString(System.out::println,"HelloWorld");
    }


}
