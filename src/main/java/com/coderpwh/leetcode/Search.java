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
    }



    public int search(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                count++;
            }
        }
        return count;

    }

}
