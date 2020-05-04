package com.cn.lambda.demo1;

public class Sport {
    public static void main(String[] args) {

        show((String ball)-> System.out.println(ball),"BasketBall");

    }
    public  static void show(Play play,String ball){

        play.play(ball);

    }
}
