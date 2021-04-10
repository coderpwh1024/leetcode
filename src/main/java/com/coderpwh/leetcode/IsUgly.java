package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class IsUgly {

    public static void main(String[] args) {


        Integer n = 14;
        IsUgly isUgly = new IsUgly();
//        System.out.println(isUgly.isUgly(n));

        System.out.println(isUgly.test(n));

    }


    public boolean test(Integer n) {

        if (n <= 0) {
            return false;
        }
        int[] array = {2, 3, 5};

        for (int a : array) {

            while (n % a == 0) {
                n = n / a;
            }
        }
        return n == 1;
    }


    public boolean isUgly(Integer n) {
        List<Integer> list = new ArrayList<>();

        while (n != 1) {

            for (int j = 2; j <= n; j++) {

                if (j == n) {
                    n = 1;
                    list.add(j);
                    break;
                }

                if (n % j == 0) {
                    n = n / j;
                    list.add(j);
                    break;
                }
            }

        }

        Integer count = 0;
        for (Integer a : list) {

            if (a == 2) {
                count++;
            } else if (a == 3) {
                count++;
            } else if (a == 5) {
                count++;
            }

        }
        if (count != list.size()) {
            return false;
        } else {
            return true;
        }
    }

}
