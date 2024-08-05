package com.coderpwh.leetcode;

public class RemoveArray {


    public static void main(String[] args) {


//        int nums[] = {0, 1, 2, 2, 3, 0, 4, 2};

//        int val = 2;


        int nums[] = {3, 2, 2, 3};
        int val = 2;


        RemoveArray removeArray = new RemoveArray();
        int result = removeArray.removeElement(nums, val);
        System.out.println(result);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }


    public int removeElement(int[] nums, int val) {

        int n = nums.length;
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }

}
