package com.cn.stream;

import com.cn.methodReference.classNameRef.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;



public class StreamDemo2 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("迪丽热巴");
        list1.add("宋远桥");
        list1.add("苏星河");
        list1.add("老子");
        list1.add("庄子");
        list1.add("孙子");
        list1.add("洪七公");
        list2.add("古力娜扎");
        list2.add("张无忌");
        list2.add("张三丰");
        list2.add("赵丽颖");
        list2.add("张二狗");
        list2.add("张天爱");
        list2.add("张三");
        Stream<String> s1 = list1.stream().filter(s -> s.length() > 2)
                .limit(3);
        Stream<String> s2 = list2.stream().filter(s -> s.startsWith("张")).skip(2);

//        Stream.concat(s1,s2).map(Person::new).forEach(System.out::println);
        System.out.println("-----------------------");
        Stream.concat(s1,s2).map(new Function<String, Person>() {

            @Override
            public Person apply(String s) {
                return new Person(s);
            }
        }).forEach(System.out::println);








    }


}
