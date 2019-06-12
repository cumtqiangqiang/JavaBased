package com.cn.listandset.list;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("abc");
        linkedHashSet.add("123");
        linkedHashSet.add(new String("123"));

        for (String s:linkedHashSet) {
            System.out.println(s);
        }
    }



}
