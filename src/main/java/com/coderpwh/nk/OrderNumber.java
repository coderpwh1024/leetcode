package com.coderpwh.nk;


import java.util.ArrayList;
import java.util.List;

/***
 描述
 给定一个正整数
 n
 n ，请将
 n
 n 按从小到大的顺序分解为若干个质因数并输出。输出的质因数乘积必须恰好等于
 n
 n 。

 【名词解释】
 ∙

 ∙ 质因数：若正整数
 p
 p 仅能被
 1
 1 与自身整除，则称
 p
 p 为质数；若质数
 p
 p 能整除
 n
 n ，则称
 p
 p 为
 n
 n 的质因数。
 输入描述：
 在一行上输入一个整数
 n
 (
 2
 ≦
 n
 ≦
 1
 0
 12
 )
 n(2≦n≦10^12) ，代表需要进行分解的数。
 输出描述：
 在一行上输出若干个整数，表示按照从小到大顺序排列的
 n
 n 的所有质因数。若某个质因数在分解中出现多次，则需重复输出对应的次数。相邻两个整数之间以单个空格分隔，行尾不得有多余空格。
 输入：
 18
 输出：
 2 3 3
 说明：
 18=2×3×3


 60=2×2×3×5
 */
public class OrderNumber {

    public static void main(String[] args) {
        int a = 18;
        print(a);
    }


    /***
     * 1.时间复杂度为O(N^2)
     *
     * 2.空间复杂度O(N) list
     * @param n
     */
    public static void print(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                list.add(i);
                n = n / i;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }


}
