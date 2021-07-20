package com.coderpwh.leetcode;

import javax.print.attribute.standard.NumberUp;
import java.util.HashMap;
import java.util.Map;

public class FindRepeatNumber {


    public static void main(String[] args) {


        int[] nums = {2, 3, 10, 2, 5, 3};

        FindRepeatNumber number = new FindRepeatNumber();
        number.findRepeatNumber(nums);

    }


    public int findRepeatNumber(int[] nums) {


        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }

        }


        for (Integer count : map.keySet()) {

            if (map.get(count) > 1) {
                System.out.println(count);
                return  count;
            }
        }

        return 1;


    }


}
