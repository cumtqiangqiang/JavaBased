package com.cn.qiang.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("qiang");
        list.add("feng");
        list.add(10);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
