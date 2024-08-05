package com.coderpwh.leetcode;

public class RemoveArray {


    public static void main(String[] args) {


        int nums[] = {0, 1, 2, 2, 3, 0, 4, 2};

        int val = 2;


        RemoveArray removeArray = new RemoveArray();
        int result = removeArray.removeElement(nums, val);

        System.out.println(result);

    }


    public int removeElement(int[] nums, int val) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            if(nums[i]==val){
                count+=1;
            }
        }

        return nums.length-count;
    }

}
