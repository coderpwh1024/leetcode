package com.coderpwh.leetcode;

public class MoveZeroes {

    public static void main(String[] args) {
        int nums[] = {0, 1, 0, 3, 12};

        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }


    }


    /***
     * 输入: nums = [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     * @param nums
     */
    public void moveZeroes(int[] nums) {

        int n = nums.length;
        int left=0;
        int right=0;

        while (right<n){
            if(nums[right]!=0){
                swap(nums,left,right);
                left++;
            }
            right++;
        }


    }




    /***
     * 交换值
     * @param nums
     * @param left
     * @param right
     */
    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }


}
