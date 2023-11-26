package com.coderpwh.leetcode;

import java.util.List;
/***
 * 面试题 16.24. 数对和
 * 提示
 * 中等
 * 50
 * 相关企业
 * 设计一个算法，找出数组中两数之和为指定值的所有整数对。一个数只能属于一个数对。
 *
 * 示例 1:
 *
 * 输入: nums = [5,6,5], target = 11
 * 输出: [[5,6]]
 * 示例 2:
 *
 * 输入: nums = [5,6,5,6], target = 11
 * 输出: [[5,6],[5,6]]
 * 提示：
 */
public class PairSums {

    public static void main(String[] args) {

          int nums[]={5,6,5};
          int target=11;

        PairSums  sum = new PairSums();
         List<List<Integer>> list = sum.pairSums(nums,target);

    }

    public List<List<Integer>> pairSums(int[] nums, int target) {

        return null;
    }

}
