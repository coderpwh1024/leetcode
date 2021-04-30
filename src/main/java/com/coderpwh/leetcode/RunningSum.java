package com.coderpwh.leetcode;

/**
 * @author coderpwh
 */
public class RunningSum {

    public static void main(String[] args) {


//        int[] nums = {1, 2, 3, 4};

//        int[] nums = {1, 1, 1, 1, 1};

        int[] nums = {3, 1, 2, 10, 1};


        RunningSum sum = new RunningSum();
        sum.runningSum(nums);
    }


    public int[] runningSum(int[] nums) {

        int[] arr = new int[nums.length];


        Integer sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            arr[i] = sum;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        return arr;


    }

}
