package com.newfeature.lambda;

public class LambdaTest2 {
    final static String salution = "Hello";
    public static void main(String[] args) {
        GreetingService gs1 = message -> System.out.println(salution+message);
       gs1.sayMessage("Jack");

       GreetingService gs2 = new GreetingService() {
           @Override
           public void sayMessage(String message) {
               System.out.println(salution+message);

           }
       };
       gs2.sayMessage("Qiang");


    }

    interface GreetingService{
        void sayMessage(String message);
    }

}
