package com.newfeature.reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 测试一个函数式接口 Predicate
 */
public class PredicateTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("输出所有数据");
        eval(list,n->true);
        System.out.println("输出所有偶数");
        eval(list,n->n%2 == 0);


    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate){
          list.forEach(num->{
              if (predicate.test(num)){
                  System.out.println(num);
              }
          });


    }


}
