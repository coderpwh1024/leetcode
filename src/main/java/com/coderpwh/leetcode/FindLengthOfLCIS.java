package com.coderpwh.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author coderpwh
 */
public class FindLengthOfLCIS {


    public static void main(String[] args) {


//        int nums[] = {1, 3, 5, 4, 7};

        int nums[] = {1, 3, 5, 4, 1, 2, 3, 4, 5, 6, 7};

//        int nums[] = {2, 2, 2, 2, 2};

        FindLengthOfLCIS find = new FindLengthOfLCIS();
        find.findLengthOfLCIS(nums);
        System.out.println(find.findLengthOfLCIS(nums));
    }


    public int findLengthOfLCIS(int[] nums) {

        int ans = 0;

        int n = nums.length;
        int start = 0;

        for (int i = 0; i < n; i++) {

            if (i > 0 && nums[i] <=nums[i - 1]) {
                start = i;
            }
            ans = Math.max(ans, i - start + 1);
        }
        return ans;
    }


}
