package com.newfeature.lambda;

public class LambdaTest3 {
    public static void main(String[] args) {
        // 隐性 final
      int num = 1;
      Converter<Integer, String> s = param-> System.out.println(String.valueOf(param+num));
      s.convert(2);
//      num = 5;

    }
    interface Converter<T1,T2>{

        void convert(int i);

    }

}
