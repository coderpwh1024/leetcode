package com.coderpwh.leetcode;

/**
 * 162. 寻找峰值
 * 峰值元素是指其值严格大于左右相邻值的元素。
 * <p>
 * 给你一个整数数组 nums，找到峰值元素并返回其索引。数组可能包含多个峰值，在这种情况下，返回 任何一个峰值 所在位置即可。
 * <p>
 * 你可以假设 nums[-1] = nums[n] = -∞ 。
 * <p>
 * 你必须实现时间复杂度为 O(log n) 的算法来解决此问题。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,2,3,1]
 * 输出：2
 * 解释：3 是峰值元素，你的函数应该返回其索引 2。
 * 示例 2：
 * <p>
 * 输入：nums = [1,2,1,3,5,6,4]
 * 输出：1 或 5
 * 解释：你的函数可以返回索引 1，其峰值元素为 2；
 * 或者返回索引 5， 其峰值元素为 6。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 1000
 * -231 <= nums[i] <= 231 - 1
 * 对于所有有效的 i 都有 nums[i] != nums[i + 1]
 *
 * @author coderpwh
 * @date 2023/10/30 14:40
 */
public class FindPeakElement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 5, 6, 4};
//        int[] arr = {1, 2, 3, 1};

        FindPeakElement find = new FindPeakElement();
        Integer result = find.findPeakElement(arr);
        System.out.println(result);
    }


    /***
     *  1. 时间复杂度为O(logN)
     *  2. 空间复杂度为O(1)
     *
     * @param nums
     * @return
     */
    public int findPeakElement(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            int mid = (i + j) / 2;
            if (nums[mid] < nums[mid + 1]) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        return i;
    }



}
