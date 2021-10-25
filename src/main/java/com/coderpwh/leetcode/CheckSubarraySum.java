package com.coderpwh.leetcode;

import java.util.Arrays;

/**
 * @author coderpwh
 */
public class CheckSubarraySum {


    public static void main(String[] args) {


//        int[] nums = {23, 2, 6, 4, 7};
//        int k = 13;

        int[] nums={23,2,4,6,6};
        int k=7;


        CheckSubarraySum sum = new CheckSubarraySum();
//        sum.checkSubarraySum(nums, k);
        System.out.println(sum.checkSubarraySum(nums,k));

    }

    public boolean checkSubarraySum(int[] nums, int k) {


        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            if (sum % k == 0 && i >= 1) {
                return true;
            }
        }
        return false;
    }

}
