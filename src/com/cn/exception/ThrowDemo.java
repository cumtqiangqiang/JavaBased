package com.cn.exception;

public class ThrowDemo {
    public static void main(String[] args) {
        int[]arr = {2,3,6,10};
        int index = 4;
        int element = getElement(arr,index);
        System.out.println(element);
        System.out.println("over");
    }

    private  static int getElement(int[]arr,int index){
        if (index < 0 || index>arr.length - 1){
            throw new ArrayIndexOutOfBoundsException("Error:OutOfBounds");

        }

        return arr[index];



    }


}
