package com.coderpwh.leetcode;

/**
 * @author coderpwh
 */
public class JudgeSquareSum {

    public static void main(String[] args) {


        int num = 1;

        JudgeSquareSum sum = new JudgeSquareSum();
//        sum.judgeSquareSum(num);
        System.out.println(sum.judgeSquareSum(num));
    }


    /***
     *    思路:
     *        1. 时间复杂度为O(N^2)
     *        2. 空间复杂度为O(1)
     *        3. 暴力求解，当c比较大时，就会出现超时现象，测试用例不通过
     *
     *
     * @param c
     * @return
     */
    public boolean judgeSquareSum(int c) {
        for (int i = 0; i <= c; i++) {
            for (int j = 0; j <= c; j++) {
                if (i * i + j * j == c) {
                    return true;
                }

            }
        }
        return false;
    }

}
