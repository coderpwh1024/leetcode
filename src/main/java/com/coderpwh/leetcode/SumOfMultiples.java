package com.coderpwh.leetcode;

/**
 * 2652. 倍数求和
 * <p>
 * 给你一个正整数 n ，请你计算在 [1，n] 范围内能被 3、5、7 整除的所有整数之和。
 * <p>
 * 返回一个整数，用于表示给定范围内所有满足约束条件的数字之和。
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 7
 * 输出：21
 * 解释：在 [1, 7] 范围内能被 3、5、7 整除的所有整数分别是 3、5、6、7 。数字之和为 21 。
 * 示例 2：
 * <p>
 * 输入：n = 10
 * 输出：40
 * 解释：在 [1, 10] 范围内能被 3、5、7 整除的所有整数分别是 3、5、6、7、9、10 。数字之和为 40 。
 * 示例 3：
 * <p>
 * 输入：n = 9
 * 输出：30
 * 解释：在 [1, 9] 范围内能被 3、5、7 整除的所有整数分别是 3、5、6、7、9 。数字之和为 30 。
 *
 * @author coderpwh
 * @date 2023/10/17 10:19
 */
public class SumOfMultiples {

    public static void main(String[] args) {

        SumOfMultiples sum = new SumOfMultiples();

        int n = 7;

        Integer result = sum.sumOfMultiples(n);
        System.out.println(result);

    }

    public int sumOfMultiples(int n) {

        Integer sum = 0;
        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0) {
                sum += i;
            } else if (i % 5 == 0) {
                sum += i;
            } else if (i % 7 == 0) {
                sum += i;
            }
        }
        return sum;
    }


}
