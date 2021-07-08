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


    /***
     *    思路:
     *       1. 时间复杂度为O(N),
     *       2. 空间复杂度为O(N)
     *       3. 利用哈希方式实现
     *
     * @param nums
     * @param goal
     * @return
     */
    public int numSubarraysWithSum(int[] nums, int goal) {

        int sum = 0;

        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();

        int ret = 0;

        for (int num : nums) {
            cnt.put(sum, cnt.getOrDefault(sum, 0) + 1);
            sum += num;
            System.out.println(sum);
            System.out.println("差值为:" + (sum - goal));
            ret += cnt.getOrDefault(sum - goal, 0);
            System.out.println("结果为:" + ret);
        }
        return ret;
    }

}

