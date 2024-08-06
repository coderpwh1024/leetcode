package com.coderpwh.leetcode;

public class RotateArray {

    public static void main(String[] args) {


        int nums[] = {-1, -100, 3, 99};
        int k = 2;


        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums,k);


        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

    }


    /***
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {

    }
}
