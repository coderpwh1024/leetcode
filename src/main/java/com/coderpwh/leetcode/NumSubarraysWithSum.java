package com.coderpwh.leetcode;

import java.util.HashMap;
import java.util.Map;

public class NumSubarraysWithSum {


    public static void main(String[] args) {

        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;

        NumSubarraysWithSum num = new NumSubarraysWithSum();
//        num.numSubarraysWithSum(nums, goal);

        System.out.println(num.numSubarraysWithSum(nums, goal));

    }




    public int numSubarraysWithSum(int[] nums, int goal) {

        int sum = 0;

        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();

        int ret = 0;

        for (int num : nums) {
            cnt.put(sum, cnt.getOrDefault(sum, 0) + 1);
            sum += num;
            ret += cnt.getOrDefault(sum - goal, 0);
        }
        return ret;
    }

}
