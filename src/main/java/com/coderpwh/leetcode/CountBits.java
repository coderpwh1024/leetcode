package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CountBits {

    public static void main(String[] args) {


        /***
         * 2
         * [0,1,1]
         */
        CountBits bit = new CountBits();
        bit.countBits(5);

    }


    public int[] countBits(int num) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= num; i++) {
            list.add(Integer.bitCount(i));
        }

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;


    }

}
