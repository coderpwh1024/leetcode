package com.coderpwh.leetcode;


/***
 *
 *
 * 剑指 Offer 53 - I. 在排序数组中查找数字 I
 *
 * 统计一个数字在排序数组中出现的次数。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 * 示例 2:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: 0
 *  
 *
 *
 *
 *
 */
public class Search {


    public static void main(String[] args) {

        int[] num = {5, 7, 7, 8, 8, 10};
        int target = 8;


        Search search = new Search();
        search.search(num, target);

        System.out.println(search.search(num, target));

        System.out.println(search.test(num,target));
    }


    /****
     *   思路:
     *      1. 时间复杂度为O(N)
     *      2. 空间复杂度为O(1)
     *
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                count++;
            }
        }
        return count;

    }

    public int test(int[] nums, int target) {

        int leftIdx = binarySearch(nums, target, true);

        int rightIdx = binarySearch(nums, target, false) - 1;

        if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
            return rightIdx - leftIdx + 1;
        }

        return 0;
    }

    public int binarySearch(int[] nums, int target, boolean lower) {

        int left = 0;
        int right = nums.length - 1;
        int ans = nums.length;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }


}


