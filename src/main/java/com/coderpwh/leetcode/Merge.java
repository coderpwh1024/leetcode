package com.coderpwh.leetcode;

/****
 *  合并两个有序数组
 *
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 *
 *  
 *
 * 说明：
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 *  
 *
 * 示例：
 *
 * 输入：
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出：[1,2,2,3,5,6]
 *  
 *
 * 提示：
 *
 * -10^9 <= nums1[i], nums2[i] <= 10^9
 * nums1.length == m + n
 * nums2.length == n
 *

 */

public class Merge {

    public static void main(String[] args) {

        Merge merge = new Merge();
        int nums1[] = {4, 5, 6, 0, 0, 0};
        int nums2[] = {1, 2, 3};
        merge.merge(nums1, 3, nums2, 3);
    }


    /****
     *   思路：
     *    1：先合并到一个数组里面
     *    2：给数组排序，冒泡排序 时间复杂度为O((m+n)^2) 并不是最优解法
     *
     *
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {


        for (int i = 0; i < nums2.length; i++) {
            nums1[m + i] = nums2[i];
        }

        for (int i = 0; i <= nums1.length - 1; i++) {

            for (int j = i + 1; j <= nums1.length - 1; j++) {

                if (nums1[i] > nums1[j]) {
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }

            }

        }
    }


}
