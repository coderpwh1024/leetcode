package com.coderpwh.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 给出一个字符串 s（仅含有小写英文字母和括号）。
 * <p>
 * 请你按照从括号内到外的顺序，逐层反转每对匹配括号中的字符串，并返回最终的结果。
 * <p>
 * 注意，您的结果中 不应 包含任何括号。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "(abcd)"
 * 输出："dcba"
 * 示例 2：
 * <p>
 * 输入：s = "(u(love)i)"
 * 输出："iloveu"
 * 示例 3：
 * <p>
 * 输入：s = "(ed(et(oc))el)"
 * 输出："leetcode"
 * 示例 4：
 * <p>
 * 输入：s = "a(bcdefghijkl(mno)p)q"
 * 输出："apmnolkjihgfedcbq"
 *
 * @author coderpwh
 */
public class ReverseParentheses {


    public static void main(String[] args) {


        //  leetcode
//        String str = "(ed(et(oc))el)";

        String str = "(u(love)i)";


        ReverseParentheses rever = new ReverseParentheses();

        String result = rever.reverseParentheses(str);

        System.out.println(result);

    }


    /***
     *
     *    思路:
     *       1. 时间复杂度为O(N),对长度为N的字符串进行遍历
     *       2. 空间复杂度为O(N) 创建了集合
     *       3. 主要利用栈方式实现
     * @param s
     * @return
     */
    public String reverseParentheses(String s) {

        Deque<String> stack = new LinkedList<>();

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(sb.toString());
                sb.setLength(0);
            } else if (ch == ')') {
                sb.reverse();
                sb.insert(0, stack.pop());
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }


}

