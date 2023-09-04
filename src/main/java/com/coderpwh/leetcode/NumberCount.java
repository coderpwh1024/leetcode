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


        Integer count2 = numberCount.countNumbersWithUniqueDigits2(n);
        System.out.println(count2);

        Integer result = numberCount.validNumber(98233);
        System.out.println(result);


    }

    public int countNumbersWithUniqueDigits2(int n) {

        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return 10;
        }

        int res = 10;
        int cur = 9;

        for (int i = 0; i < n - 1; i++) {
            cur *= 9 - i;
            res += cur;
        }

        return res;
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

            int count = validNumber(i);
            if (count == 0) {
                list.add(i);
            }
        }
        System.out.println(list.size());
        sum = sum - list.size();
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
    public int validNumber(int n) {
        int[] arr = new int[10];
        while (n != 0) {
            if (arr[n % 10] == 1) {
                return 0;
            } else {
                arr[n % 10] = 1;
            }
            n = n / 10;
        }
        return 1;
    }

}
