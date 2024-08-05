package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArray {


    public static void main(String[] args) {

        MergeArray mergeArray = new MergeArray();

        int nums1[] = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int nums2[] = {2, 5, 6};
        int n = 3;

//        mergeArray.merge(nums1, n, nums2, m);

        mergeArray.mergeTwo(nums1, n, nums2, m);


        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }

    }


    /***
     * 常规方法
     *  1. 时间复杂度为O(M+N)LOG(m+n)
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i != n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);

    }


    /***
     *  双指针
     *   1. 时间复杂度为O(M+N)
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void mergeTwo(int[] nums1, int m, int[] nums2, int n) {

        int p1 = 0;
        int p2 = 0;
        int cur;

        int[] sorted = new int[m + n];

        while (p1 < m || p2 < n) {

            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1++];
            } else {
                cur = nums2[p2++];
            }
            sorted[p1 + p2 - 1] = cur;
        }


        for (int i = 0; i != m + n; i++) {
            nums1[i] = sorted[i];
        }

    }


}
