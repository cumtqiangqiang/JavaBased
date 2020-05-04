package com.learn.coreclass.exception;

/**
 * Created by fiona on 2020/1/5.
 */
public class App {
    public static void main(String[] args) {
//        tax(2000,0.1);
//        tax(-200,0.1);
//        tax(2000,-0.1);

        assertTest(-10);

    }

     static double tax(int salary,double rate){

        try{
            if (salary <= 0 || rate <= 0 ){
                throw new IllegalArgumentException();
            }

        }catch (Exception e){
            e.printStackTrace();

        }finally {
            System.out.println("End");
        }


        return salary * rate;
    }
    static void assertTest(int num){
         // JVM 配置 -ea 才会生效
        if (num < 0 ){
            assert num > 0 : "num is must > 0";
        }

        System.out.println("assert test");


    }

}
