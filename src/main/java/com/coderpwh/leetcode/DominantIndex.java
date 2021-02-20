package com.coderpwh.leetcode;

public class DominantIndex {

    public static void main(String[] args) {
//        int[] arr = {3, 6, 1, 0};

        int[] arr = {1,2,3,4};

        DominantIndex index = new DominantIndex();
//        index.dominantIndex(arr);
        System.out.println(index.dominantIndex(arr));

    }


    public int dominantIndex(int[] nums) {
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (maxIndex != i && nums[maxIndex] < nums[i] * 2) {
                return -1;
            }
        }

        return maxIndex;
    }


}
