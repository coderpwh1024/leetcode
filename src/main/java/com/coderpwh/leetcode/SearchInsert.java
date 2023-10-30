package com.coderpwh.leetcode;

/**
 * 35. 搜索插入位置
 * <p>
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 请必须使用时间复杂度为 O(log n) 的算法。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,3,5,6], target = 5
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: nums = [1,3,5,6], target = 2
 * 输出: 1
 * 示例 3:
 * <p>
 * 输入: nums = [1,3,5,6], target = 7
 * 输出: 4
 *
 * @author coderpwh
 * @date 2023/10/30 9:57
 */
public class SearchInsert {

    public static void main(String[] args) {


        int[] nums = {1, 3, 5, 6};
        int target = 7;

        SearchInsert search = new SearchInsert();
        int result = search.searchInsert(nums, target);
        System.out.println(result);
        System.out.println("-----------------------------------");
        int count = search.searchInsertByTwo(nums, target);
        System.out.println(count);


    }


    /***
     * 1. 时间复杂度为O(N)
     * 2. 空间复杂度为O(1)
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    /***
     *  1. 时间复杂度为O(logN)
     *  2. 空间复杂度为O(1)
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsertByTwo(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int ans = n;

        while (left <= right) {
            int mid = (right - left) / 2 + left;

            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

}
