package com.cn.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {

        Map<Person,String>map = new HashMap<>();
        Person p1 = new Person("Tom1",22);
        Person p2 = new Person("Tom2",23);
        Person p3 = new Person("Tom3",24);
        Person p4 = new Person("Tom1",22);

        map.put(p1,"XiaMen");
        map.put(p2,"AnQing");
        map.put(p3,"Beijing");
        map.put(p4,"Australia");


        for (Map.Entry<Person,String> entry : map.entrySet()) {

            System.out.println(entry.getKey());
        }



    }


}
