package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedSquares {

    public static void main(String[] args) {


//        int[] nums = {-4, -1, 0, 3, 10};

        int[] nums = {-7, -3, 2, 3, 3, 11};


        // {0,1,9,16,100}
        SortedSquares sort = new SortedSquares();
        sort.sortedSquares(nums);


    }


    /***
     *     思路:
     *        1. 时间复杂度为O(NlogN),对数组长度为N进行遍历，并进行排序
     *        2. 空间复杂度为O(N),创建了大小为N的集合
     *        3. 数组遍历+排序
     *
     *
     * @param nums
     * @return
     */
    public int[] sortedSquares(int[] nums) {

        int[] arrr = new int[nums.length];

        List<Integer> list = new ArrayList<>(nums.length);


        for (int i = 0; i < nums.length; i++) {
            Integer temp = nums[i] * nums[i];
            list.add(temp);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            arrr[i] = list.get(i);
            System.out.print(arrr[i] + " ");
        }

        return arrr;

    }


}
