package com.coderpwh.leetcode;

public class SearchInset {

    public static   int searchInsert(int nums[],int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return  nums.length;
    }



    public static void main(String[] args) {

         int nums[] ={1,3,5,6};
         searchInsert(nums,5);
        System.out.println(searchInsert(nums,4));

    }

}
