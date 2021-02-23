package com.classcloader;

import com.jvm.Test;

class QTest{
    public QTest(){
        System.out.println("QTest 的构造方法1111");
    }
    {
        System.out.println("QTest 的构造块2222");
    }
    static {
        System.out.println("QTest 的静态代码块3333");
    }


}
// 静态代码块（加载一次）>  构造块 > 构造方法
public class Test1 {
    {
        System.out.println("Test1 的构造块4444");
    }
    static {
        System.out.println("Test1 的静态代码块5555");
    }

    public Test1() {
        System.out.println("Test1 的构造方法6666");
    }

    public static void main(String[] args) {
        System.out.println("Test1 的main 方法 7777=============");
        new QTest();
        System.out.println("-----------------------");
        new QTest();
        System.out.println("-----------------------");
        new Test1();


    }
}
