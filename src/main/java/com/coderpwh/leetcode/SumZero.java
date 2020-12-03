package com.coderpwh.leetcode;


import java.util.Random;

/***
 * 和为零的N个唯一整数
 * 给你一个整数 n，请你返回 任意 一个由 n 个 各不相同 的整数组成的数组，并且这 n 个数相加和为 0 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 5
 * 输出：[-7,-1,1,3,4]
 * 解释：这些数组也是正确的 [-5,-1,1,2,3]，[-3,-1,2,-2,4]。
 * 示例 2：
 *
 * 输入：n = 3
 * 输出：[-1,0,1]
 * 示例 3：
 *
 * 输入：n = 1
 * 输出：[0]
 *
 *
 */
public class SumZero {

    public static void main(String[] args) {

        SumZero sum = new SumZero();
        sum.sumZero(48);

    }


    public int[] sumZero(int n) {

        int nums[] = new int[n];

        Random random = new Random();

        Integer sum = 0;
        for (int i = 0; i < n-1; i++) {
             nums[i]=i;
             sum+=i;
        }
        nums[n-1]=-sum;


        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        }


        return nums;
    }


}
