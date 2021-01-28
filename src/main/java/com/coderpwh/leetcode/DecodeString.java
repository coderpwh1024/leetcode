package com.coderpwh.leetcode;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class DecodeString {

    int ptr;

    public static void main(String[] args) {

        // accaccacc
        String str = "3[a2[c]]";

//        String str = "2[abc]3[cd]ef";


        DecodeString decodeString = new DecodeString();
//        decodeString.docdeString(str);

        System.out.println(decodeString.test(str));

        System.out.println(decodeString.test2(str));

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

