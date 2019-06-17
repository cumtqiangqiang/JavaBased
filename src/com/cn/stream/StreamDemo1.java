package com.cn.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo1 {

    public static void main(String[] args) {
        List<String>names = new ArrayList<>();

        names.add("张无忌");
        names.add("周芷若");
        names.add("赵敏");
        names.add("张强");
        names.add("张三丰");
        names.stream().filter(s -> s.startsWith("张"))
                .filter(s -> s.length()>2)
                .forEach(System.out::println);



    }
}
