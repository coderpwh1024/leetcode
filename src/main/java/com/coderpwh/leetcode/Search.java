package com.coderpwh.leetcode;

public class Search {


    public static void main(String[] args) {

        int[] num = {5, 7, 7, 8, 8, 10};
        int target = 8;


        Search search = new Search();
        search.search(num, target);

        System.out.println(search.search(num, target));
    }



    public int search(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                count++;
            }
        }
        return count;

    }

}
