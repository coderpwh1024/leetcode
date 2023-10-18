package com.coderpwh.juc;

/**
 * 面试题 16.01. 交换数字
 * 提示
 * 中等
 * 96
 * 相关企业
 * 编写一个函数，不用临时变量，直接交换numbers = [a, b]中a与b的值。
 * <p>
 * 示例：
 * <p>
 * 输入: numbers = [1,2]
 * 输出: [2,1]
 * 提示：
 * <p>
 * numbers.length == 2
 * -2147483647 <= numbers[i] <= 2147483647
 *
 * @author coderpwh
 * @date 2023/10/18 16:52
 */
public class SwapNumbers {


    public static void main(String[] args) {

        SwapNumbers numbers = new SwapNumbers();

        int[] arr = {1, 2};
        int[] result = numbers.swapNumbers(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }

    public int[] swapNumbers(int[] numbers) {

    }
}
