package com.cn.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Tom1", "Tom2", "Tom3", "Tom4");
        List<String> names = stream.collect(Collectors.toList());

        for (String s : names) {
            System.out.println(s);
        }


    }

}
