package com.coderpwh.leetcode;

import java.util.HashSet;
import java.util.Set;


/***
 *
 * 349. 两个数组的交集
 *
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 * 示例 2：
 *
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 *
 *
 *
 */
public class Intersection {


    public static void main(String[] args) {


//        int nums1[] = {1, 2, 2, 1};
//        int nums2[] = {2, 2};

        int nums1[] = {4, 9, 5};
        int nums2[] = {9, 4, 9, 8, 4};

        Intersection intersection = new Intersection();
        intersection.intersection(nums1, nums2);


    }


    /***
     *    思路:
     *        1.时间复杂度为O(N^2)
     *        2. 空间复杂度为O(N)
     *        3. for循环遍历
     *
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                }
            }
        }


        int[] arr = new int[set.size()];

        int i = 0;
        for (Integer count : set) {
            arr[i] = count;
            i++;
        }


        return arr;
    }

}

