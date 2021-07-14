package com.coderpwh.leetcode;

import java.util.Arrays;

/**
 * @author coderpwh
 */
public class MinAbsoluteSumDiff {

    public static void main(String[] args) {


        int nums1[] = {1, 7, 5};

        int nums2[] = {2, 3, 5};

        MinAbsoluteSumDiff diff = new MinAbsoluteSumDiff();
        diff.minAbsoluteSumDiff(nums1, nums2);
        System.out.println(diff.minAbsoluteSumDiff(nums1,nums2));


    }

    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {

        final int MOD = 1000000007;

        int n = nums1.length;
        int[] rec = new int[n];

        System.arraycopy(nums1, 0, rec, 0, n);
        Arrays.sort(rec);

        int sum = 0;
        int maxn = 0;

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            sum = (sum + diff) % MOD;
            int j = binarySearch(rec, nums2[i]);
            if (j < n) {
                maxn = Math.max(maxn, diff - (rec[j] - nums2[i]));
            }
            if (j > 0) {
                maxn = Math.max(maxn, diff - (nums2[i] - rec[j - 1]));
            }
        }
        return (sum - maxn + MOD) % MOD;
    }


    public int binarySearch(int[] rec, int target) {
        int low = 0;
        int higt = rec.length - 1;

        if (rec[higt] < target) {
            return higt + 1;
        }

        while (low < higt) {
            int mid = (higt - low) / 2 + low;

            if (rec[mid] < target) {
                low = mid + 1;
            } else {
                higt = mid;
            }
        }
        return low;
    }

}
