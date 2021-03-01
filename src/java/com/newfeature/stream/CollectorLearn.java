package com.newfeature.stream;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorLearn {

    @Test
    public  void ColllectorTest(){

        Stream<String> stringStream = Arrays.asList("c", "d", "q").stream();
        String s = stringStream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
//        System.out.println(s);

        List<String> servers = Arrays.asList("Qiang","Feng","Tom","Jerry","Feng");
        String collect = servers.stream().collect(Collectors.joining(","));
//        System.out.println(collect);

        String collect1 = servers.stream().collect(Collectors.collectingAndThen(Collectors.joining(","),
                String::toUpperCase));
//        System.out.println(collect1);

        Map<Integer, List<String>> collect2 = servers.stream().collect(Collectors.groupingBy(String::length));

        collect2.forEach((l,list)->{
            System.out.println(l+":" +list.toString());
        });

        Map<Integer, Set<String>> collect3 = servers.stream().collect(Collectors.groupingBy(String::length,
                Collectors.toSet()));


        List<Student> stus = Arrays.asList(new Student(21,"Beijing"),new Student(23,"Beijing"),new Student(34,"S" +
                "Shanxi"),new Student(19,"Shanxi"));

        stus.stream().collect(Collectors.reducing())



    }
}
