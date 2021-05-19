package com.coderpwh.leetcode;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author coderpwh
 */
public class RelativeSortArray {

    public static void main(String[] args) {

//        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};

//        int[] arr2 = {2, 1, 4, 3, 9, 6};


//        int[] arr1 = {28, 6, 22, 8, 44, 17};
//
//        int[] arr2 = {22, 28, 8, 6};


        int[] arr1 = {2, 21, 43, 38, 0, 42, 33, 7, 24, 13, 12, 27, 12, 24, 5, 23, 29, 48, 30, 31};

        int[] arr2 = {2, 42, 38, 0, 43, 21};


        // [2,42,38,0,43,21,5,7,12,12,13,23,24,24,27,29,30,31,33,48]
        // 结果为： [2,2,2,1,4,3,3,9,6,7,19]


        RelativeSortArray array = new RelativeSortArray();
//        array.relativeSortArray(arr1, arr2);
        array.test(arr1,arr2);


    }


    public int[] relativeSortArray(int[] arr1, int[] arr2) {


        List<Integer> list = new ArrayList<>(arr1.length);


        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr1.length; j++) {

                if (arr1[j] == arr2[i]) {
                    System.out.print(arr1[j] + " ");
                    list.add(arr1[j]);
                }
            }
        }


        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            if (!list.contains(arr1[i])) {
                list.add(arr1[i]);
            }
        }


        System.out.println("");

        int[] arr = new int[list.size()];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = list.get(i);
            System.out.print(arr[i] + " ");
        }


        return arr;
    }

    public int[] test(int[] arr1, int[] arr2) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int num : arr1) {
            list.add(num);
        }

        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }

        Collections.sort(list, (x, y) -> {
            if (map.containsKey(x) || map.containsKey(y)) {
                return map.getOrDefault(x, 1001) - map.getOrDefault(y, 1001);
            } else {
                return x - y;
            }

        });

        for (int i = 0; i < arr1.length; ++i) {
            arr1[i] = list.get(i);
        }

        return arr1;


    }


}
