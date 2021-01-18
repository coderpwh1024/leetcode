package com.coderpwh.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/****
 *   1021  删除最外层的括号
 *
 *有效括号字符串为空 ("")、"(" + A + ")" 或 A + B，其中 A 和 B 都是有效的括号字符串，+ 代表字符串的连接。例如，""，"()"，"(())()" 和 "(()(()))" 都是有效的括号字符串。
 *
 * 如果有效字符串 S 非空，且不存在将其拆分为 S = A+B 的方法，我们称其为原语（primitive），其中 A 和 B 都是非空有效括号字符串。
 *
 * 给出一个非空有效字符串 S，考虑将其进行原语化分解，使得：S = P_1 + P_2 + ... + P_k，其中 P_i 是有效括号字符串原语。
 *
 * 对 S 进行原语化分解，删除分解中每个原语字符串的最外层括号，返回 S 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入："(()())(())"
 * 输出："()()()"
 * 解释：
 * 输入字符串为 "(()())(())"，原语化分解得到 "(()())" + "(())"，
 * 删除每个部分中的最外层括号后得到 "()()" + "()" = "()()()"。
 * 示例 2：
 *
 * 输入："(()())(())(()(()))"
 * 输出："()()()()(())"
 * 解释：
 * 输入字符串为 "(()())(())(()(()))"，原语化分解得到 "(()())" + "(())" + "(()(()))"，
 * 删除每个部分中的最外层括号后得到 "()()" + "()" + "()(())" = "()()()()(())"。
 * 示例 3：
 *
 * 输入："()()"
 * 输出：""
 * 解释：
 * 输入字符串为 "()()"，原语化分解得到 "()" + "()"，
 * 删除每个部分中的最外层括号后得到 "" + "" = ""。
 *
 *
 *
 *
 *
 */
public class RemoveOuterParentheses {

    public static void main(String[] args) {

        String s = "(()())(())";

        // () () () () (())
        // () () () () () ()
        String s1 = "(()())(())(()(()))";

        String s2 = "(()(()))";
        RemoveOuterParentheses removeOuterParentheses = new RemoveOuterParentheses();
        removeOuterParentheses.removeOuterParentheses(s);
        System.out.println(removeOuterParentheses.removeOuterParentheses(s2));
//        System.out.println(removeOuterParentheses.test(s2));

    }


    /****
     *      思路:
     *         1：时间复杂度为O(N)
     *         2: 空间复杂度为O(N)
     *         3: 主要是利用数组下标方式实现
     *
     *
     * @param S
     * @return
     */
    public String test(String S) {
        StringBuilder sb = new StringBuilder();
        int level = 0;
        for (char c : S.toCharArray()) {
            if (c == ')') {
                --level;
            }
            if (level >= 1) {
                sb.append(c);
            }
            if (c == '(') {
                ++level;
            }
        }
        return sb.toString();


    }


    /****
     *       思路:
     *          1：时间复杂度为O(N)
     *          2: 空间复杂度为O(N+M) 一个StringBuild与已栈Deque
     *          3: 主要用栈方式和数组遍历实现
     *
     * @param S
     * @return
     */
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        Deque<Character> deque = new LinkedList<>();

        for (Character c : S.toCharArray()) {

            if (deque.isEmpty() && c == '(') {
                deque.push(c);
            } else if (!deque.isEmpty() && c == '(') {
                deque.push(c);
                sb.append(c);
            }

            if (c == ')') {
                deque.pop();
                if (!deque.isEmpty()) {
                    sb.append(c);
                }
            }

        }


        return sb.toString();
    }


}
