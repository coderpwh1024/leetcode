package com.coderpwh.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {


    public static void main(String[] args) {


//        int[] nums = {2, 7, 11, 15};
//        int target = 9;



        Integer a =1;

        Integer b = 1;

        boolean resultOne = a.equals(b);

        System.out.println(resultOne);



         Map<String,Object> map = new HashMap<>();

        int[] nums = {3, 3};
        int target = 6;

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
            for (int j = 1; j <=nums.length - 1; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    arr[0] = i;
                    arr[1] = j;
                    System.out.println("j:"+j);
                }
            }
        }
        return arr;
    }
}
