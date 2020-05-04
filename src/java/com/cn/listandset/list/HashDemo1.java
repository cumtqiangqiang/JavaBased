package com.cn.listandset.list;

import java.util.HashSet;

public class HashDemo1 {
    public static void main(String[] args) {
        HashSet<Person> sets = new HashSet<>();
        Person p1 = new Person("Tom1",22);
        Person p2 = new Person("Tom2",23);
        Person p3 = new Person("Tom3",34);
        sets.add(p1);
        sets.add(p2);
        sets.add(p3);
        for (Person p : sets) {
            System.out.println(p);

        }



    }


}
