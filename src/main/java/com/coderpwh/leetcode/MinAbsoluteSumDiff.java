package com.coderpwh.leetcode;

import java.util.Arrays;

/**
 * 给你两个正整数数组 nums1 和 nums2 ，数组的长度都是 n 。
 * <p>
 * 数组 nums1 和 nums2 的 绝对差值和 定义为所有 |nums1[i] - nums2[i]|（0 <= i < n）的 总和（下标从 0 开始）。
 * <p>
 * 你可以选用 nums1 中的 任意一个 元素来替换 nums1 中的 至多 一个元素，以 最小化 绝对差值和。
 * <p>
 * 在替换数组 nums1 中最多一个元素 之后 ，返回最小绝对差值和。因为答案可能很大，所以需要对 109 + 7 取余 后返回。
 * <p>
 * |x| 定义为：
 * <p>
 * 如果 x >= 0 ，值为 x ，或者
 * 如果 x <= 0 ，值为 -x
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * 输入：nums1 = [1,7,5], nums2 = [2,3,5]
 * 输出：3
 * 解释：有两种可能的最优方案：
 * - 将第二个元素替换为第一个元素：[1,7,5] => [1,1,5] ，或者
 * - 将第二个元素替换为第三个元素：[1,7,5] => [1,5,5]
 * 两种方案的绝对差值和都是 |1-2| + (|1-3| 或者 |5-3|) + |5-5| = 3
 * <p>
 * 示例 2：
 * 输入：nums1 = [2,4,6,8,10], nums2 = [2,4,6,8,10]
 * 输出：0
 * 解释：nums1 和 nums2 相等，所以不用替换元素。绝对差值和为 0
 * <p>
 * 示例 3：
 * 输入：nums1 = [1,10,4,4,2,7], nums2 = [9,3,5,1,7,4]
 * 输出：20
 * 解释：将第一个元素替换为第二个元素：[1,10,4,4,2,7] => [10,10,4,4,2,7]
 * 绝对差值和为 |10-9| + |10-3| + |4-5| + |4-1| + |2-7| + |7-4| = 20
 *
 * @author coderpwh
 */
public class MinAbsoluteSumDiff {

    public static void main(String[] args) {


        int nums1[] = {1, 7, 5};

        int nums2[] = {2, 3, 5};

        MinAbsoluteSumDiff diff = new MinAbsoluteSumDiff();
        diff.minAbsoluteSumDiff(nums1, nums2);
        System.out.println(diff.minAbsoluteSumDiff(nums1, nums2));


    }


    /***
     *    思路:
     *      1. 时间复杂度为O(nlogN),
     *      2. 空间复杂度为O(N)
     *
     * @param nums1
     * @param nums2
     * @return
     */

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


    /***
     *  二分查找，找出数组中最小的值的下标
     *
     * @param rec
     * @param target
     * @return
     */
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
