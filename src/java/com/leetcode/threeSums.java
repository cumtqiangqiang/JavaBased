package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSums {
    public static void main(String[] args) {
       int[] nums = new int[]{-1, 0, 1, 2, -1, -4};

       List rest =  threeSum(nums);

        System.out.println(rest.toString());
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        if(nums.length<3) return res; // no solution

        Arrays.sort(nums);

        int l,r,sum;
        for(int i=0; i < nums.length-1 ; i++){
            l = i+1;
            r = nums.length-1;

            while(l<r){
                sum = nums[i]+nums[l]+nums[r];
                if(sum==0){//result found
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    // skip same values nearby
                    while(l<r && nums[l]==nums[l-1]) l++;
                    while(l<r && nums[r]==nums[r+1]) r--;
                }
                else if(sum <0){
                    l++;
                }
                else{
                    r--;
                }

            }

            //skip same value nearby
            while(i< nums.length-1 && nums[i]== nums[i+1])
                i++;
        }
        return res;
    }

}
