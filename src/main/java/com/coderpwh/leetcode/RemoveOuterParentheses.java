package com.coderpwh.leetcode;

import java.util.Deque;
import java.util.LinkedList;

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
