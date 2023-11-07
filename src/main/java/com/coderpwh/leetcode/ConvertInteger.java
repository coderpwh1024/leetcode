package com.coderpwh.leetcode;


/***
 *
 * 整数转换。编写一个函数，确定需要改变几个位才能将整数A转成整数B。
 *
 * 示例1:
 *
 *  输入：A = 29 （或者0b11101）, B = 15（或者0b01111）
 *  输出：2
 * 示例2:
 *
 *  输入：A = 1，B = 2
 *  输出：2
 * 提示:
 *
 * A，B范围在[-2147483648, 2147483647]之间
 *
 *
 */
public class ConvertInteger {

    public static void main(String[] args) {

          int A=29;
          int B=15;

        ConvertInteger convertInteger = new ConvertInteger();
        int result =  convertInteger.convertInteger(A,B);
        System.out.println(result);

    }


    /***
     * 1. 时间复杂度为O(1)
     * 2. 空间复杂度为O(1)
     *
     * @param A
     * @param B
     * @return
     */
    public int convertInteger(int A, int B) {
        int diff = A ^ B;

        return Integer.bitCount(diff);
    }


}
