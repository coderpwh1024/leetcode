package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SortArrayByParityII {

    public static void main(String[] args) {


        //  4 ，5 ，2，7
//        int nums[] = {4, 2, 5, 7};

        int nums[] = {4, 1, 2, 1};
        SortArrayByParityII sort = new SortArrayByParityII();
        sort.sortArrayByParityII(nums);

    }


    /***
     *    思路:
     *       1. 时间复杂度为O(logN)
     *       2. 空间复杂度为O(N)，定义了3个未知大小的集合
     *       3. for循环区分开奇偶数，算法效率不够高
     *
     *
     * @param nums
     * @return
     */
    public int[] sortArrayByParityII(int[] nums) {


        int arr[] = new int[nums.length];


        List<Integer> list = new ArrayList<>();
        List<Integer> date = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (nums[i] % 2 == 0) {
                list.add(nums[i]);
            } else {
                date.add(nums[i]);
            }
        }


        int count = 0;
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = list.get(count);
                ++count;
            } else {
                arr[i] = date.get(num);
                ++num;
            }

        }
        return arr;
    }

}
