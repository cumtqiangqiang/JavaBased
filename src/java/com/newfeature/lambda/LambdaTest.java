package com.newfeature.lambda;

public class LambdaTest {
    public static void main(String[] args) {
        Fun1 f1 = () -> 5;
        System.out.println("返回5: " + f1.test1());

        Fun2 f2 = a->a+5;
        System.out.println("5 + 5 = " + f2.test(5));

        Fun3 f3 = (x,y)->x + y;
        System.out.println("两数之和: "+f3.test(3,5));

        Fun4 f4 = (x,y)->x - y;
        System.out.println("两数之差: "+f3.test(5,3));

        Fun5 f5 = System.out::println;
        f5.test("我们是lambda");



    }


    interface Fun1 {
        int test1();
    }

    interface Fun2{
        int test(int a);
    }
    interface Fun3{
        int test(int a,int b);
    }
    interface Fun4{
        int test(int a,int b);
    }
    interface Fun5{
        void test(String str);
    }

}


