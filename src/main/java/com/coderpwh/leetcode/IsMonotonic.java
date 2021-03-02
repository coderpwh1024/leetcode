package com.coderpwh.leetcode;

/**
 * @author coderpwh
 */
public class IsMonotonic {

    public static void main(String[] args) {

//        int[] arr = {1, 3, 2, 4};

//        int[] arr = {6, 5, 4, 3};

        int [] arr = {1,2,3,4};
//
//        int[] arr = {1, 3, 2};

        IsMonotonic isMonotonic = new IsMonotonic();
        isMonotonic.isMonotonic(arr);

        System.out.println(isMonotonic.isMonotonic(arr));

    }


    public boolean isMonotonic(int[] A) {
        boolean m = true;
        boolean n =true;


        for (int i = 0; i < A.length - 1; i++) {

            if (A[i] > A[i + 1]) {
                m = false;
            }
            if (A[i] < A[i + 1]) {
                n = false;
            }

        }


        return m || n;
    }


}
