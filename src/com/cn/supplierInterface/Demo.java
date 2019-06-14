package com.cn.supplierInterface;

import java.util.function.Supplier;

public class Demo {

    private static int getMax(Supplier<Integer> supplier){
        return  supplier.get();
    }


    public static void main(String[] args) {
        int[] arr = {1,0,50,-100,88,77};
        int max = getMax(()->{
            int temp = arr[0];
            for (int i = 0; i <arr.length ; i++) {
                if (arr[i] > temp){
                    temp = arr[i];
                }

            }
            return temp;

        });

        System.out.println(max);

    }

}
