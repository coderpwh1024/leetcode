package com.coderpwh.leetcode;

public class Searchs {

    public static void main(String[] args) {


        int nums[] = {-1, 0, 3, 5, 9, 12};


        int target = 9;


        Searchs search = new Searchs();

        search.search(nums, target);

    }


    /***
     *   思路:
     *     1. 时间复杂度为O(N)
     *     2. 空间复杂度为O(1)
     *     3. 算法效率不高
     *
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {

        if (nums == null || nums.length <= 0) {
            return -1;
        }

        int count = -1;

        for (int i = 0; i < nums.length; i++) {
            if (target == count) {
                count = i;
                break;
            }
        }

        return count;

    }
}
