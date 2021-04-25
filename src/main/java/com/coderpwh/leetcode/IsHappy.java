package com.coderpwh.leetcode;


import java.util.HashSet;
import java.util.Set;

/***
 *  202 快乐数
 *
 *
 *
 *
 */
public class IsHappy {

    public static void main(String[] args) {

        int n = 19;
//        int n = 2;
        IsHappy happy = new IsHappy();
        System.out.println(happy.isHappy(n));

    }



    public boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {

            set.add(n);
            n = getNext(n);
        }

        return n == 1;
    }


    private int getNext(int n) {

        int totalSum = 0;

        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;

        }
        return totalSum;
    }


}
