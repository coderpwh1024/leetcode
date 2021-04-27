package com.coderpwh.leetcode;

import java.util.Arrays;


/***
 *    268 丢失的数字
 *
 *给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 *
 *  
 *
 * 进阶：
 *
 * 你能否实现线性时间复杂度、仅使用额外常数空间的算法解决此问题?
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [3,0,1]
 * 输出：2
 * 解释：n = 3，因为有 3 个数字，所以所有的数字都在范围 [0,3] 内。2 是丢失的数字，因为它没有出现在 nums 中。
 * 示例 2：
 *
 * 输入：nums = [0,1]
 * 输出：2
 * 解释：n = 2，因为有 2 个数字，所以所有的数字都在范围 [0,2] 内。2 是丢失的数字，因为它没有出现在 nums 中。
 * 示例 3：
 *
 * 输入：nums = [9,6,4,2,3,5,7,0,1]
 * 输出：8
 * 解释：n = 9，因为有 9 个数字，所以所有的数字都在范围 [0,9] 内。8 是丢失的数字，因为它没有出现在 nums 中。
 * 示例 4：
 *
 * 输入：nums = [0]
 * 输出：1
 * 解释：n = 1，因为有 1 个数字，所以所有的数字都在范围 [0,1] 内。1 是丢失的数字，因为它没有出现在 nums 中。
 *  
 *
 *
 *
 * @author coderpwh
 */
public class MissingNumber {

    public static void main(String[] args) {


//        int[] nums = {3, 0, 1};

//        int[] nums = {0, 1};

//        int[] nums = {1, 2};

        int[] nums = {0, 2, 3};

//        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        MissingNumber miss = new MissingNumber();
//        miss.missingNumber(nums);
        System.out.println(miss.missingNumber(nums));

    }


    public int missingNumber(int[] nums) {


        Integer count = -1;
        Arrays.sort(nums);

        if (nums[nums.length - 1] != nums.length) {
            count = nums.length;
        } else if (nums[0] != 0) {
            count = 0;
        }


        for (int i = 1; i < nums.length; i++) {

            int temp = nums[i - 1] + 1;

            if (nums[i] != temp) {
                count = temp;
            }
        }

        return count;

    }


}

