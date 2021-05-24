package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


        for (List<Integer> list : date) {
            System.out.println(list);
        }


        return date;
    }


}
