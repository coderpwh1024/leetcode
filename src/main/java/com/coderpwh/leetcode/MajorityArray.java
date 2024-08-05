package com.coderpwh.leetcode;

import java.util.HashMap;

public class MajorityArray {

    public static void main(String[] args) {


//        int nums[] = {2, 2, 1, 1, 1, 2, 2};


         int nums[] = {3,2,3};


        MajorityArray majorityArray = new MajorityArray();
        int result = majorityArray.majorityElement(nums);

        System.out.println(result);

    }


    public int majorityElement(int[] nums) {

        int flagCount = nums.length / 2;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) > flagCount) {
                return key;
            }
        }

        return -1;
    }
}
