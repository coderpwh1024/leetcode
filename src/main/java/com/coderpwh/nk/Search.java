package com.coderpwh.nk;

public class Search {


    public static void main(String[] args) {

        int[] nums = {4,5,6,7,0,1,2};

        int target = 0;

        System.out.println(new Search().search(nums, target));

    }


    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }


}
