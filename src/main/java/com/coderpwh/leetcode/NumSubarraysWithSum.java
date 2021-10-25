package com.coderpwh.leetcode;

import java.util.HashMap;
import java.util.Map;

/***
 *
 * 930. 和相同的二元子数组
 *
 *  给你一个二元数组 nums ，和一个整数 goal ，请你统计并返回有多少个和为 goal 的 非空 子数组。
 *
 * 子数组 是数组的一段连续部分。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,0,1,0,1], goal = 2
 * 输出：4
 * 解释：
 * 如下面黑体所示，有 4 个满足题目要求的子数组：
 * [1,0,1,0,1]
 * [1,0,1,0,1]
 * [1,0,1,0,1]
 * [1,0,1,0,1]
 * 示例 2：
 *
 * 输入：nums = [0,0,0,0,0], goal = 0
 * 输出：15
 *
 *
 *
 */
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
