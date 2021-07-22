package com.coderpwh.leetcode;

import java.util.*;

public class Intersect {

    public static void main(String[] args) {


//        int[] nums1 = {1, 2, 2, 1};

//        int[] nums2 = {2, 2};


        int[] nums1 = {4, 9, 5};

        int[] nums2 = {9, 4, 9, 8, 4};


        Intersect intersect = new Intersect();
        int[] arr =  intersect.intersect(nums1, nums2);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }


    }


    /****
     *
     *  思路:
     *      1. 时间复杂度为O(N+M),对两个数组nums1,nums2的遍历
     *      2. 空间复杂度为O(min(m,n)) 创建长度为m或者n的数组
     *
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }

        int[] intersection = new int[nums1.length];
        int index = 0;

        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);

            if (count > 0) {
                intersection[index++] = num;
                count--;

                if (count > 0) {
                    map.put(num, count);
                } else {
                    map.remove(num);
                }
            }
        }

        return Arrays.copyOfRange(intersection, 0, index);
    }

}

