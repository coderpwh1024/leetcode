package com.coderpwh.leetcode;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {


//        int[] nums = {3, 0, 1};

//        int[] nums = {0, 1};

//        int[] nums = {1, 2};

        int[] nums = {0, 2, 3};

//        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        MissingNumber miss = new MissingNumber();
//        miss.missingNumber(nums);
        System.out.println(miss.missingNumber(nums));

    }


    public int missingNumber(int[] nums) {


        Integer count = -1;
        Arrays.sort(nums);

        if (nums[nums.length - 1] != nums.length) {
            count = nums.length;
        } else if (nums[0] != 0) {
            count = 0;
        }


        for (int i = 1; i < nums.length; i++) {

            int temp = nums[i - 1] + 1;

            if (nums[i] != temp) {
                count = temp;
            }
        }

        return count;

    }


}
