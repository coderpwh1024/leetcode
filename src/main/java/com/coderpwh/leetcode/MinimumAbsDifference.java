 package com.coderpwh.leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/****
 *1200. 最小绝对差
 *
 *
 *给你个整数数组 arr，其中每个元素都 不相同。
 *
 * 请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：arr = [4,2,1,3]
 * 输出：[[1,2],[2,3],[3,4]]
 * 示例 2：
 *
 * 输入：arr = [1,3,6,10,15]
 * 输出：[[1,3]]
 * 示例 3：
 *
 * 输入：arr = [3,8,-10,23,19,-4,-14,27]
 * 输出：[[-14,-10],[19,23],[23,27]]
 *
 *
 */
public class MinimumAbsDifference {


    public static void main(String[] args) {


//        int[] arr = {4, 2, 1, 3};

        int[] arr = {1, 3, 6, 10, 15};


//         {{-14,-10},{19,23},{23,27}}
//        int[] arr = {3, 8, -10, 23, 19, -4, -14, 27};

//        int[] arr = {40, 11, 26, 27, -20};


        MinimumAbsDifference min = new MinimumAbsDifference();
        min.minimumAbsDifference(arr);

    }


    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> date = new ArrayList<>();

        Integer count = Integer.MAX_VALUE;

        Arrays.sort(arr);


        for (int i = 0; i < arr.length - 1; i++) {

            count = Math.min(count, arr[i + 1] - arr[i]);

        }

        for (int i = 0; i < arr.length; i++) {

            if (i + 1 < arr.length) {

                if (count == arr[i + 1] - arr[i]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[i + 1]);
                    date.add(list);
                }

            }

        }
        return date;
    }


}

