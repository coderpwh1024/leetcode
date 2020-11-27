package com.coderpwh.leetcode;

/**
 * 统计所有小于非负整数 n 的质数的数量。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 10
 * 输出：4
 * 解释：小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 * 示例 2：
 * <p>
 * 输入：n = 0
 * 输出：0
 * 示例 3：
 * <p>
 * 输入：n = 1
 * 输出：0
 *
 * @author coderpwh
 */
public class CountPrimes {

    public static void main(String[] args) {
        CountPrimes c = new CountPrimes();
//        System.out.println(c.countPrimes(499979));
        System.out.println(c.test(10));

    }


    /****
     *  厄拉多塞筛法
     *
     *  思路
     *  1: 主要是区间查找 分别找出 2，3，5，7 11 等的倍数
     *  2: boolean [] singns = new boolean[n]; 大小为n的数组 ，默认全部是false
     *  3：从2开始找出倍数，如果是2的倍数 则排除不是质数
     *  4：关键点在第二个for循环 for(int j=i+i;j<n;j+=i)
     *    j=i+i 例如 2的倍数 4，6，8 则是 2+2=4 4+2=6 8=2+2;
     *    j+=i <==> j=j+i 则是 6=4+2 8=6+2
     *    换成3的倍数也是如此
     *
     *
     *
     * @param n
     * @return
     */
    public int test(int n) {
        int count = 0;

        boolean[] signs = new boolean[n];
        for (int i = 2; i < n; i++) {
            //因为在 C# 中，布尔类型的默认值为 假。所以在此处用了逻辑非（！）操作符。
            if (!signs[i]) {
                count++;
                for (int j = i + i; j < n; j = i + j) {
                    System.out.println(j);
                    //排除不是质数的数
                    signs[j] = true;
                }
            }
        }
        return count;
    }


    /****
     *    暴力求解，时间复杂度为O(N^2) 超时
     *
     * @param n
     * @return
     */
    public int countPrimes(int n) {

        if (n <= 2) {
            return 0;
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            boolean flag = isPrime(i);
            if (flag) {
                count = count + 1;
            }
        }
        return count;
    }


    public boolean isPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
