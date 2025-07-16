package com.coderpwh.leetcode;

public class LongestConsecutive {

    public static void main(String[] args) {


        LongestConsecutive consecutive = new LongestConsecutive();
        int[] nums = {100, 4, 200, 1, 3, 2};

        int result = consecutive.longestConsecutive(nums);
        System.out.println(result);

    }


    /***
     * 要求时间复杂度为O(N)
     *
     * @param nums
     * @return
     */
    public int longestConsecutive(int[] nums) {

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==nums[i]+1){
                    nums[j]=nums[i];
                }
            }
        }
        return nums.length;
    }


}
