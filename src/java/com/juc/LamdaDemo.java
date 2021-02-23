package com.juc;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * 对于函数式接口 可以用lamda 表达式，即接口中只有一个抽象方法
 */
// 如果只有抽象方法的话，默认会加上这个注解
@FunctionalInterface
interface Foo{
    public int add(int x,int y);
//    public int add1(int x,int y);
    default int mull(int x,int y){
        return x * y;
    }
    public static int div(int x,int y){
        return x/y;
    }

}
public class LamdaDemo {
    public static void main(String[] args) {
        Foo foo = (int x,int y)->{
            return x+y;
        };
        int a = foo.add(3,5);
        int b = foo.mull(3,5);
        System.out.println(a);
        System.out.println(b);

    }





}
