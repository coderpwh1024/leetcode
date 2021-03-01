package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

/***
 *
 */
public class SortArrayByParity {

    public static void main(String[] args) {

        /***
         *   4,2 1 3
         */
        int[] arr = {3, 1, 2, 4};

        SortArrayByParity sort = new SortArrayByParity();
//        sort.sortArrayByParity(arr);
        System.out.println(sort.sortArrayByParity(arr));


    }


    public int[] sortArrayByParity(int[] A) {


        int[] arr = new int[A.length];

        List<Integer> dateList = new ArrayList<>();


        List<Integer> list = new ArrayList<>();
        List<Integer> date = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {

            if (A[i] % 2 == 0) {
                list.add(A[i]);
            } else {
                date.add(A[i]);
            }
        }


        for (Integer a : list) {
            dateList.add(a);
        }
        for (Integer b : date) {
            dateList.add(b);
        }

        for (int i = 0; i < dateList.size(); i++) {
            arr[i] = dateList.get(i);
        }

        return arr;

    }

}
