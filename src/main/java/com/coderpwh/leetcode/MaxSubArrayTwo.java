package com.coderpwh.leetcode;

/**
 * 面试题 16.17. 连续数列
 * <p>
 * 给定一个整数数组，找出总和最大的连续数列，并返回总和。
 * <p>
 * 示例：
 * <p>
 * 输入： [-2,1,-3,4,-1,2,1,-5,4]
 * 输出： 6
 * 解释： 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶：
 * <p>
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 *
 * @author coderpwh
 * @date 2023/10/31 14:09
 */
public class MaxSubArrayTwo {


    public static void main(String[] args) {


        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        MaxSubArrayTwo max = new MaxSubArrayTwo();
        Integer result = max.maxSubArray(arr);
        System.out.println(result);

    }

    public int maxSubArray(int[] nums) {
        int pre = 0;
        int maxAns = nums[0];

        for (int i = 0; i < nums.length; i++) {
            pre = Math.max(pre + nums[i], nums[i]);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }

}
