package com.coderpwh.leetcode;

public class TwoSumArray {


    public static void main(String[] args) {


        int[] nums = {2, 7, 11, 15};
        int target = 9;

        TwoSumArray twoSumArray = new TwoSumArray();
        int result[] = twoSumArray.twoSum(nums, target);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }


    /***
     * 输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = nums[i];
                    arr[1] = nums[j];
                }
            }
        }
        return  arr;
    }
}
