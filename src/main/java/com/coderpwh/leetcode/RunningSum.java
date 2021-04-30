package com.coderpwh.leetcode;

/**
 * 1480. 一维数组的动态和
 * <p>
 * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 * <p>
 * 请返回 nums 的动态和。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,6,10]
 * 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。
 * 示例 2：
 * <p>
 * 输入：nums = [1,1,1,1,1]
 * 输出：[1,2,3,4,5]
 * 解释：动态和计算过程为 [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1] 。
 * 示例 3：
 * <p>
 * 输入：nums = [3,1,2,10,1]
 * 输出：[3,4,6,16,17]
 *
 * @author coderpwh
 */
public class RunningSum {

    public static void main(String[] args) {


//        int[] nums = {1, 2, 3, 4};

//        int[] nums = {1, 1, 1, 1, 1};

        int[] nums = {3, 1, 2, 10, 1};


        RunningSum sum = new RunningSum();
        sum.runningSum(nums);
    }


    /***
     *    思路:
     *        1.时间复杂度为O(N)
     *        2. 空间复杂度为O(N)
     *        3. 利用数组遍历
     *
     *
     * @param nums
     * @return
     */
    public int[] runningSum(int[] nums) {

        int[] arr = new int[nums.length];


        Integer sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            arr[i] = sum;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        return arr;


    }

}
