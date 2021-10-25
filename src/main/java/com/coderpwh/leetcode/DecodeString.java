package com.coderpwh.leetcode;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;


/****
 *  394  字符串解码
 *
 *
 *  给定一个经过编码的字符串，返回它解码后的字符串。
 *
 * 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
 *
 * 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
 *
 * 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "3[a]2[bc]"
 * 输出："aaabcbc"
 * 示例 2：
 *
 * 输入：s = "3[a2[c]]"
 * 输出："accaccacc"
 * 示例 3：
 *
 * 输入：s = "2[abc]3[cd]ef"
 * 输出："abcabccdcdcdef"
 * 示例 4：
 *
 * 输入：s = "abc3[cd]xyz"
 * 输出："abccdcdcdxyz"
 *
 *
 */
public class DecodeString {

    int ptr;

    public static void main(String[] args) {

        // accaccacc
        String str = "3[a2[c]]";

//        String str = "2[abc]3[cd]ef";


        DecodeString decodeString = new DecodeString();
//        decodeString.docdeString(str);

//        System.out.println(decodeString.test(str));

        System.out.println(decodeString.test2(str));

//        System.out.println(decodeString.dfs(str, 0)[0]);

    }




    /****
     *     辅助炸的做法
     *     思路:
     *        1.时间复杂度为O(N)
     *        2.空间复杂度为O(N)
     *        3. 分别建2个栈用来存储数字和字母
     *         1）遍历字符时如果是数字，先赋值临时变量multi
     *         2)如果是是【 号，则将multi 与StringBuilder 分别入栈
     *         然后将临时变量multi与sb 分别重新赋新值
     *         3) 如果是 ] 号 则出栈，存放数字的栈知己出栈
     *            循环遍历 拼接之前的字符StringBuilder ，然后字符栈出栈拼接临时字符
     *            重新赋值给StringBuiler
     * @param s
     * @return
     */
    public String test2(String s) {
        StringBuilder sb = new StringBuilder();
        int multi = 0;

        Deque<Integer> stack_multi = new LinkedList<>();
        Deque<String> stack = new LinkedList<>();

        for (Character c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                multi = multi * 10 + Integer.valueOf(c + "");
            } else if (c == '[') {
                stack_multi.addLast(multi);
                stack.addLast(sb.toString());
                multi = 0;
                sb = new StringBuilder();
            } else if (c == ']') {
                StringBuilder temp = new StringBuilder();
                int cur_multi = stack_multi.removeLast();

                for (int i = 0; i < cur_multi; i++) {
                    temp.append(sb);
                }
                sb = new StringBuilder(stack.removeLast() + temp);
            } else {
                sb.append(c);
            }

        }
        return sb.toString();
    }


    public String test(String s) {
        LinkedList<String> stk = new LinkedList<>();

        ptr = 0;
        while (ptr < s.length()) {
            char cur = s.charAt(ptr);
            //  如果当前字符是数字则放入栈中
            if (Character.isDigit(cur)) {
                String digits = getDigits(s);
                stk.addLast(digits);
                // 如果当前字符是字母或者是左 [ 放入栈中
            } else if (Character.isLetter(cur) || cur == '[') {
                stk.addLast(String.valueOf(s.charAt(ptr++)));
            } else {
                ++ptr;
                LinkedList<String> sub = new LinkedList<>();
                while (!"[".equals(stk.peekLast())) {
                    sub.addLast(stk.removeLast());
                }
                Collections.reverse(sub);

                stk.removeLast();
                int repTime = Integer.parseInt(stk.removeLast());
                StringBuffer t = new StringBuffer();
                String o = getString(sub);

                while (repTime-- > 0) {
                    t.append(o);
                }
                stk.addLast(t.toString());
            }
        }

        return getString(stk);
    }


    /***
     *   获取字符串里的数字
     * @param s
     * @return
     */
    public String getDigits(String s) {
        StringBuilder ret = new StringBuilder();
        while (Character.isDigit(s.charAt(ptr))) {
            ret.append(s.charAt(ptr++));
        }
        return ret.toString();
    }


    /****
     *    统计字符
     * @param v
     * @return
     */
    public String getString(LinkedList<String> v) {
        StringBuilder ret = new StringBuilder();
        for (String s : v) {
            ret.append(s);
        }
        return ret.toString();
    }


    /***
     *     方法作废
     * @param s
     * @return
     */
    public String docdeString(String s) {
        Deque<String> deque = new LinkedList<>();

        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '[') {
                flag = true;
            } else if (s.charAt(i) == ']') {
                flag = false;
            }
            if (flag) {
                sb.append(s.charAt(i));
            }
        }
        return "";
    }

}
