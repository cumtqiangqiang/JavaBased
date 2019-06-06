package com.cn.qiang.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(new Date(0L));
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String s = df.format(new Date());
        System.out.println(s);
        try {
            Date d = df.parse("1949-10-01");
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
