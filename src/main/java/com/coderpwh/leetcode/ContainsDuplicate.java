package com.coderpwh.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author coderpwh
 */
public class ContainsDuplicate {

    public static void main(String[] args) {

//        int nums[] = {1, 2, 3, 1};
         int nums[] = {0,4,5,0,3,6};

//        int nums[] ={1,2,3,4};

        ContainsDuplicate contains = new ContainsDuplicate();

        System.out.println(contains.containsDuplicate(nums));
    }





    // {1,2,3,4,5,6,7,8,1,9}
    public boolean containsDuplicate(int[] nums) {


        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if (set.size() != nums.length) {
            return true;
        } else {
            return false;
        }


    }


}
