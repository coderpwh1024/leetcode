package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author coderpwh
 */
public class AddToArrayForm {

    public static void main(String[] args) {

//        int[] arr = {9,9,9,9,9,9,9,9,9,9};
//        int[] arr = {1, 2, 3, 4};
//        int k = 1;

        int[] arr = {1, 2, 3};
        int k = 912;

        AddToArrayForm add = new AddToArrayForm();
//        System.out.println(add.addToArrayFormaddToArrayForm(arr, k));

        add.test(arr, k);
    }

    public List<Integer> test(int[] A, int K) {
        List<Integer> res = new ArrayList<>();

        int n = A.length;

        for (int i = n - 1; i >= 0 || K > 0; --i, K /= 10) {

            if (i >= 0) {
                K += A[i];
            }
            System.out.println(K);
            res.add(K % 10);

        }
        Collections.reverse(res);


        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i));
        }

        return res;

    }


    public List<Integer> addToArrayFormaddToArrayForm(int[] A, int K) {

        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        Integer total = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            sb.append(A[i]);

        }
        Integer count = Integer.valueOf(sb.toString()) + K;
        String str = count + "";
        String arr[] = str.split("");

        for (String s : arr) {
            list.add(Integer.valueOf(s));
        }

        return list;

    }


}
