package com.coderpwh.nk;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/***
 *
 * 4. 寻找两个正序数组的中位数
 *
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 *
 * 算法的时间复杂度应该为 O(log (m+n)) 。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums1 = [1,3], nums2 = [2]
 * 输出：2.00000
 * 解释：合并数组 = [1,2,3] ，中位数 2
 * 示例 2：
 *
 * 输入：nums1 = [1,2], nums2 = [3,4]
 * 输出：2.50000
 * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
 *
 */
public class FindMedianSortedArrays {


    public static void main(String[] args) {

//        int nums1[] = {1,2};
//        int nums2[] = {3,4};

         int nums1[] = {1,3};
         int nums2[] = {2};

        FindMedianSortedArrays find = new FindMedianSortedArrays();
         double result = find.findMedianSortedArrays(nums1,nums2);
        System.out.println(result);
    }


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();

        for(int num:nums1){
            list.add(num);
        }
        for(int num:nums2){
            list.add(num);
        }
        int size = list.size();
        Collections.sort(list);

        if(size % 2 == 0){
            int index = size / 2;
            return (list.get(index) + list.get(index - 1)) / 2.0;
        }else{
            int index = size / 2;
            System.out.println("index:"+index);
            return list.get(index);
        }

    }




}
