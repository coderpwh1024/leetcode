package com.coderpwh.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxFrequency {

    public static void main(String[] args) {


        int nums[] = {1, 4, 8, 13};

//        int nums[] = {1,2,4};

        int k = 5;


        MaxFrequency max = new MaxFrequency();
//        max.maxFrequency(nums, k);

        System.out.println(max.maxFrequency(nums, k));
    }


    public int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);

        int n = nums.length;

        long total = 0;

        int l = 0;
        int res = 1;

        for (int r = 1; r < n; ++r) {

            total += (long) (nums[r] - nums[r - 1]) * (r - l);

            while (total > k) {
                total -= nums[r] - nums[l];
                ++l;
            }
            res = Math.max(res, r - l + 1);
        }

        return res;

    }




}
