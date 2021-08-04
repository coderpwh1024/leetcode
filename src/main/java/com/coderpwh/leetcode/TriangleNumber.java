package com.coderpwh.leetcode;

import java.util.Arrays;

public class TriangleNumber {


    public static void main(String[] args) {


        int arr[] = {2, 2, 3, 4};

        TriangleNumber triangleNumber = new TriangleNumber();
        triangleNumber.triangleNumber(arr);

    }


    public int triangleNumber(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int k = i;
            for (int j = i + 1; j < n; j++) {
                while (k + 1 < n && nums[k + 1] < nums[i] + nums[j]) {
                    ++k;
                }
                ans += Math.max(k - j, 0);
            }
        }
        System.out.println(ans);
        return ans;
    }

}
