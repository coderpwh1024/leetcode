package com.coderpwh.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 227 基本计算器 ||
 * 给你一个字符串表达式 s ，请你实现一个基本计算器来计算并返回它的值。
 * <p>
 * 整数除法仅保留整数部分。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "3+2*2"
 * 输出：7
 * 示例 2：
 * <p>
 * 输入：s = " 3/2 "
 * 输出：1
 * 示例 3：
 * <p>
 * 输入：s = " 3+5 / 2 "
 * 输出：5
 *  
 *
 * @author coderpwh
 */
public class Calculate {


    public static void main(String[] args) {

        // 3+4=7
        String str = "3+2*2+2/2+1";

        Calculate cal = new Calculate();
        cal.calculate(str);
    }


    /***
     *     思路:
     *        1:时间复杂度为O(n)
     *        2：空间复杂度为O(N) 创建Deque 集合
     *        3：注意用到了栈，重点是把 +,-,*,/ 分割开来计算
     *
     *
     * @param s
     * @return
     */
    public int calculate(String s) {

        Deque<Integer> stack = new LinkedList<>();
        char preSign = '+';
        int num = 0;
        int n = s.length();

        for (int i = 0; i < n; ++i) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == n - 1) {

                switch (preSign) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);
                        break;
                    default:
                        stack.push(stack.pop() / num);
                }
                preSign = s.charAt(i);
                num = 0;

            }

        }
        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }

}

