package com.cn.qiang.demoGeneric;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *  泛型的通配符
 *  创建对象的时候不能用
 *  作为方法的参数的泛型使用.
 */
public class Demo01Generic {
    public static void main(String[] args) {
//        List<?>list = new ArrayList();
//        list.add(1);

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        List<Integer>list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        showList(list);
        showList(list1);

    }



    private  static  void showList(List<?> list){
        Iterator<?> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
