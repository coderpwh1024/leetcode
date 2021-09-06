package com.coderpwh.leetcode;


/***
 *
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 *
 *
 * 示例 1:
 *
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 * 示例 2:
 *
 * 输入: nums = [-1,0,3,5,9,12], target = 2
 * 输出: -1
 * 解释: 2 不存在 nums 中因此返回 -1
 *
 */
public class Searchs {

    public static void main(String[] args) {


        int nums[] = {-1, 0, 3, 5, 9, 12};


        int target = 9;


        Searchs search = new Searchs();


        // 普通的for循环
        System.out.println(search.search(nums, target));


        // 二分查找方式实现
        System.out.println(search.testSearch(nums, target));

    }


    /***
     *   思路:
     *     1. 时间复杂度为O(N)
     *     2. 空间复杂度为O(1)
     *     3. 算法效率不高
     *
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {

        if (nums == null || nums.length <= 0) {
            return -1;
        }

        int count = -1;

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                count = i;
                break;
            }
        }

        return count;

    }


    /**
     * 思路:
     * 1. 时间复杂度为O(LogN)
     * 2. 空间复杂度为O(1)
     * 3.利用二分查找方式实现
     *
     * @param nums
     * @param target
     * @return
     */
    public int testSearch(int nums[], int target) {

        int low = 0;

        int high = nums.length - 1;

        while (low < high) {
            int mid = (high - low) / 2 + low;

            int num = nums[mid];

            if (num == target) {
                return mid;
            } else if (num > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }


}
