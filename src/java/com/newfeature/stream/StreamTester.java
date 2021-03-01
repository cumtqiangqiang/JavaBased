package com.newfeature.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTester {

    @Test
    public static void StreamTest(){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> collect = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());

    }



}
