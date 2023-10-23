package com.coderpwh.leetcode;

/**
 * 递归乘法。 写一个递归函数，不使用 * 运算符， 实现两个正整数的相乘。可以使用加号、减号、位移，但要吝啬一些。
 * <p>
 * 示例1:
 * <p>
 * 输入：A = 1, B = 10
 * 输出：10
 * 示例2:
 * <p>
 * 输入：A = 3, B = 4
 * 输出：12
 * 提示:
 * <p>
 * 保证乘法范围不会溢出
 *
 * @author coderpwh
 * @date 2023/10/23 13:39
 */
public class Multiply {

    public static void main(String[] args) {

//        int A = 3;
//        int B = 4;


        int A = 4;
        int B = 6;

        Multiply multiply = new Multiply();
        int result = multiply.multiply(A, B);
        System.out.println(result);

    }


    /***
     * 1. 时间复杂度为O(N)
     * 2. 空间复杂度为O(1)
     * 3. 递归方式
     *
     * @param A
     * @param B
     * @return
     */
    public int multiply(int A, int B) {

        int max = Math.max(A, B);
        int min = Math.min(A, B);

        if (A == 1 || B == 1) {
            return A + B - 1;
        } else {
            return max + multiply(max, min - 1);
        }
    }


}
