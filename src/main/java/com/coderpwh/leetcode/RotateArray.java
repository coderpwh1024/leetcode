package com.coderpwh.leetcode;

public class RotateArray {

    public static void main(String[] args) {


        int nums[] = {-1, -100, 3, 99};
        int k = 2;


        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums, k);


        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }


    /***
     *
     *
     *   -1 ,-100,3 99
     *   99 -1,-100,3
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        int[] newArr = new int[n];

        for (int i = 0; i < n; i++) {
            newArr[(i + k) % n] = nums[i];
        }

        System.arraycopy(newArr, 0, nums, 0, n);

    }


}
