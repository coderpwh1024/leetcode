package com.coderpwh.leetcode;

import java.util.HashMap;

public class RepeatedNTimes {

    public static void main(String[] args) {

        int nums[] = {2, 1, 2, 5, 3, 2};

        RepeatedNTimes times = new RepeatedNTimes();
        times.repeatedNTimes(nums);

    }

    public int repeatedNTimes(int[] nums) {

        int result = 0;

        int n = nums.length / 2;

        HashMap<Integer, Integer> map = new HashMap<>(n + 1);

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }

        }

        for (Integer count : map.keySet()) {
            if (map.get(count).equals(n)) {
                System.out.println(count);
                result = count;
            }
        }

        return result;

    }

}
