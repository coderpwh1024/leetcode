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

        mergeArray.merge(nums1, n, nums2, m);


        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }


    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i=0;i!=n;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);

    }

}
