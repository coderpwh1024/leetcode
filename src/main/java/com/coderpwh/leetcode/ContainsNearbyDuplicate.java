package com.coderpwh.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,2,3,1], k = 3
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: nums = [1,0,1,1], k = 1
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: nums = [1,2,3,1,2,3], k = 2
 * 输出: false
 *
 * @author coderpwh
 */
public class ContainsNearbyDuplicate {

    public static void main(String[] args) {


//         int nums[] ={1,2,3,1};

         int nums[] = {1,2,3,1,2,3};

//         int nums[] ={99,99};

//        int nums[] = {1, 2, 3, 3, 4};
        int k = 2;

        ContainsNearbyDuplicate contains = new ContainsNearbyDuplicate();
        System.out.println(contains.containsNearbyDuplicate(nums, k));

        System.out.println(contains.test(nums, k));
    }


    public boolean test(int[] nums, int k) {
       Set<Integer> set = new HashSet<>();
       for(int i=0;i<nums.length;i++){
           if(set.contains(nums[i])){
               return  true;
           }
           set.add(nums[i]);
           if(set.size()>k){
               set.remove(nums[i-k]);
           }
       }
        return false;
    }


    public boolean containsNearbyDuplicate(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    int c = i - j;
                    if (Math.abs(c) <= k) {
                        return true;
                    }
                }
            }
        }

        return false;
    }


}
