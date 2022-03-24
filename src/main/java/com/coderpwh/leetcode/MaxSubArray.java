package com.coderpwh.leetcode;


import java.util.*;
import java.util.ArrayList;

/**** *
 *
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 *
 *
 */
public class MaxSubArray {


    /***
     *
     *   思路:
     *     1.时间复杂度为O(N)
     *     2.空间复杂度为O(1)
     *     3.利用动态规划实现
     *
     *
     *
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {

        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        System.out.println(maxAns);
        return maxAns;
    }


    public static void main(String[] args) {
        int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArray(nums);

    }

}
