package com.cn.qiang.ArrCp;

import java.util.Arrays;

public class DemoArrayCp {
    public static void main(String[] args) {
        int[] src = new int[]{1,2,3,4,5,6};
        int[] des = new int[]{6,7,8,9,10};


        System.arraycopy(src,0,des,2,3);
        String aArr = Arrays.toString(src);
        String dArr = Arrays.toString(des);
        System.out.println(aArr);
        System.out.println("----------------------");
        System.out.println(dArr);




    }
}
