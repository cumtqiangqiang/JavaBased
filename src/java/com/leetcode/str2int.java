package com.leetcode;

public class str2int {
    public static void main(String[] args) {
        int a = myAtoi("+-2");
        System.out.println(a);
    }


    public static int myAtoi(String str) {
        if(str.isEmpty())
            return 0;

        double result = 0, pop = 0;
        int length = str.length(), index = 0;
        boolean sign = false;

        for(; index < length && str.charAt(index) == ' '; ++index);

        if(index == length || (str.charAt(index) != '-' && str.charAt(index) != '+' && !Character.isDigit(str.charAt(index))))
            return 0;

        if(str.charAt(index) == '-'){
            sign = true;
//            ++index;
            index++;
        }
        else if(str.charAt(index) == '+')
            ++index;

        for( ; index < length && Character.isDigit(str.charAt(index)) ; ++index)
        {
            pop = str.charAt(index) - '0';
            result = result * 10 + pop;
        }

        if(sign)
            result = -result;

        if(result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        if(result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        return (int)result;


    }
}
