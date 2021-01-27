package com.coderpwh.leetcode;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class DecodeString {

    int ptr;

    public static void main(String[] args) {

        // accaccacc
//        String str = "3[a2[c]]";

        String str = "2[abc]3[cd]ef";


        DecodeString decodeString = new DecodeString();
        decodeString.docdeString(str);

        System.out.println(decodeString.test(str));

    }


    public String test(String s) {
        LinkedList<String> stk = new LinkedList<>();

        ptr = 0;
        while (ptr < s.length()) {
            char cur = s.charAt(ptr);

            if (Character.isDigit(cur)) {
                String digits = getDigits(s);
                stk.addLast(digits);
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
