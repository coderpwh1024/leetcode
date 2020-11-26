package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.*;

public class PlusOne {


    public int[] plusOne(int[] digits) {


        List<Integer> list = new ArrayList<>();


        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i] * Math.pow(10, digits.length - i - 1);
        }
        sum = sum + 1;

        System.out.println(sum);

        if (sum % 10 == 0) {
            for (int i = 0; i < digits.length; i++) {
                System.out.println(digits.length-1-i);
                Double a = (sum / (Math.pow(10, digits.length - 1 - i)));
                System.out.println(a);
                list.add(a.intValue());
            }
        } else {
            for (int i = 0; i < digits.length; i++) {

                if (i == digits.length - 1) {
                    list.add(digits[i] + 1);
                } else {
                    list.add(digits[i]);
        }
    }
        }


        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
            System.out.println(arr[i]);
        }


        return arr;
    }


    public static void main(String[] args) {


//        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8};
//        int nums[] = {8, 9, 9, 9};

        int nums[] ={9};


        PlusOne plusOne = new PlusOne();
        plusOne.plusOne(nums);

    }


}
