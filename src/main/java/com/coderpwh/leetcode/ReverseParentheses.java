package com.coderpwh.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author coderpwh
 */
public class ReverseParentheses {


    public static void main(String[] args) {


        //  leetcode
        String str = "(ed(et(oc))el)";

        ReverseParentheses rever = new ReverseParentheses();

        String result = rever.reverseParentheses(str);

        System.out.println(result);

    }


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
