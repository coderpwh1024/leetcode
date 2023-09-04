package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 357
 *
 * @author coderpwh
 * @date 2023/9/4 13:54
 */
public class NumberCount {

    public static void main(String[] args) {

        int n = 2;


        NumberCount numberCount = new NumberCount();
        Integer count = numberCount.countNumbersWithUniqueDigits(n);

        System.out.println(count);

    }


    /***
     *  n=2:
     *  0<=x<=10^2;
     * 结果为91
     * 11 22 33 44 55 66 77 88 99
     *
     * 10^3
     * 111 112 ....
     * 221 222 223
     *
     * @param n
     * @return
     */
    public int countNumbersWithUniqueDigits(int n) {

        if (n == 0) {
            return 1;
        }

        long sum = 1;

        for (int i = 1; i <= n; i++) {
            sum = sum * 10;
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < sum; i++) {


        }

        return (int) sum;
    }


    /***
     *  校验数字是否有重复
     *  99 8
     *  11 22
     *  111 221 222 223
     * @param n
     * @return
     */
    public boolean validNumber(int n) {


    }

}
