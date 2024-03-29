package com.coderpwh.leetcode;

/**
 * 剑指 Offer 10- I. 斐波那契数列
 * <p>
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
 * <p>
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 * <p>
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 2
 * 输出：1
 * 示例 2：
 * <p>
 * 输入：n = 5
 * 输出：5
 *
 * @author coderpwh
 * @date 2023/9/20 16:11
 */
public class Fib2 {


    public static void main(String[] args) {

        int n = 44;
//        int n = 5;

        Fib2 fib = new Fib2();

       /* long start = System.currentTimeMillis();
        Integer result = fib.fib(n);
        long end = System.currentTimeMillis();

        System.out.println(result);
        System.out.println((end - start) / 1000);
        System.out.println("-----------------");*/

       /* Integer fibResult = fib.fib2(n);
        System.out.println(fibResult);
*/
        Integer count = fib.fib3(n);
        System.out.println(count);

    }


    /***
     * 1.动态规划
     * 2.时间复杂度为O(N)
     * @param n
     * @return
     */
    public int fib3(int n) {
        final int MOD = 1000000007;
        if (n < 2) {
            return n;
        }
        int f1 = 0, f2 = 0, fn = 1;
        for (int i = 2; i <= n; i++) {
            f1 = f2;
            f2 = fn;
            fn = (f1 + f2) % MOD;
        }
        return fn;
    }


    /***
     * 1.递归方式
     * 2.时间复杂度为O(N^2)
     * @param n
     * @return
     */
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
