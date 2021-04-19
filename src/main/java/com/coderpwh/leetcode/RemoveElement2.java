package com.coderpwh.leetcode;


public class RemoveElement2 {

    public static void main(String[] args) {


        int nums[] = {3, 2, 2, 3};
        int val = 3;


//        int nums[] = {0, 1, 2, 2, 3, 0, 4, 2};
//        int val = 2;

        RemoveElement2 remove = new RemoveElement2();
//        remove.removeElement(nums, val);

        System.out.println(remove.removeElement(nums, val));

    }


    /***
     *
     *      思路:
     *          1. 时间复杂度为O(N)
     *          2. 空间复杂度为O(1)
     *          3. 利用数组的双指针来解决
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {

        int left = 0;

        int right = nums.length;

        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right - 1];
                right--;

            } else {
                left++;
            }
        }
        return left;
    }

}
