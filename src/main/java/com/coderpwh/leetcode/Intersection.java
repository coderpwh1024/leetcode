package com.coderpwh.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Intersection {


    public static void main(String[] args) {


//        int nums1[] = {1, 2, 2, 1};
//        int nums2[] = {2, 2};

        int nums1[] = {4, 9, 5};
        int nums2[] = {9, 4, 9, 8, 4};

        Intersection intersection = new Intersection();
        intersection.intersection(nums1, nums2);


    }

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                }
            }
        }


         int [] arr = new int[set.size()];

        int i = 0;
        for (Integer count : set) {
            arr[i] = count;
            i++;
        }


        return arr;
    }

}
