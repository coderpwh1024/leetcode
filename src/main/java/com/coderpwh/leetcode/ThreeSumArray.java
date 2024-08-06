package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumArray {

    public static void main(String[] args) {


        int[] nums = {-1, 0, 1, 2, -1, -4};

        ThreeSumArray threeSumArray = new ThreeSumArray();
        List<List<Integer>> list = threeSumArray.threeSum(nums);


        System.out.println(list);

    }


    /***
     * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，
     * 同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。
     *
     * 注意：答案中不可以包含重复的三元组。
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - 1; j++) {
                for (int k = 2; k < nums.length - 2; k++) {
                    if (i != j && i != k && j != k) {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            List<Integer> data = new ArrayList<>();
                            data.add(nums[i]);
                            data.add(nums[j]);
                            data.add(nums[k]);
//                            list.add(data);
                            set.add(data);
                        }

                    }
                }
            }
        }

        System.out.println(set);

        return list ;
    }


}
