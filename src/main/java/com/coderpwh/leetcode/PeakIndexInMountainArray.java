package com.coderpwh.leetcode;


import java.util.Arrays;

public class PeakIndexInMountainArray {

    public static void main(String[] args) {


        int arr[] = {24, 69, 100, 99, 79, 78, 67, 36, 26, 19};

        PeakIndexInMountainArray array = new PeakIndexInMountainArray();
//        array.peakIndexInMountainArray(arr);

        System.out.println(array.peakIndexInMountainArray(arr));

    }


    public int peakIndexInMountainArray(int arr[]) {


        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }


        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                return i;
            }
        }

        return 0;
    }

}
