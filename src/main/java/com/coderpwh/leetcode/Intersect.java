package com.coderpwh.leetcode;

import java.util.*;


/***
 *
 * 350. 两个数组的交集 II
 *
 给定两个数组，编写一个函数来计算它们的交集。



 示例 1：

 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 输出：[2,2]
 示例 2:

 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 输出：[4,9]
 *
 *
 *
 */
public class Intersect {

    public static void main(String[] args) {


//        int[] nums1 = {1, 2, 2, 1};

//        int[] nums2 = {2, 2};


        int[] nums1 = {4, 9, 5};

        int[] nums2 = {9, 4, 9, 8, 4};


        Intersect intersect = new Intersect();
        int[] arr = intersect.test(nums1, nums2);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }


    }


    /****
     *
     *  思路:
     *      1. 时间复杂度为O(N+M),对两个数组nums1,nums2的遍历
     *
     *      2. 空间复杂度为O(min(m,n)) 创建长度为m或者n的数组
     *
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {


        if (nums1.length > nums2.length) {
            intersect(nums2, nums1);
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (Integer num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }


        int[] intersection = new int[nums1.length];
        int index = 0;


        for (Integer num : nums2) {

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


    /***
     *   思路:
     *       1. 时间复杂度为O(NlogN+MlogM)
     *       2. 空间复杂度为O(min(m,n))
     *       3. 利用排序与双指针方式实现
     *
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] test(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);


        int length1 = nums1.length;

        int length2 = nums2.length;

        int index = 0;
        int index1 = 0;
        int index2 = 0;


        int intersection[] = new int[Math.min(length1, length2)];


        while (index1 < length1 && index2 < length2) {

            if (nums1[index1] < nums2[index2]) {
                index1++;
            } else if (nums1[index1] > nums2[index2]) {
                index2++;
            } else {
                intersection[index] = nums1[index];
                index++;
                index1++;
                index2++;

            }

        }
        return Arrays.copyOfRange(intersection, 0, index);
    }

}
