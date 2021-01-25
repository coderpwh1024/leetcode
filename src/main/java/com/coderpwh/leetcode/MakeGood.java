package com.coderpwh.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class MakeGood {

    public static void main(String[] args) {

//        String str = "leEeetcode";

//        String str = "abBAcC";
        String str = "jeSsEj";

        MakeGood makeGood = new MakeGood();
//        makeGood.makeGood(str);
        makeGood.test(str);

    }


    public String test(String s) {
        StringBuilder sb = new StringBuilder();

        int index = -1;

        int length = s.length();

        for (int i = 0; i < length; i++) {

            char ch = s.charAt(i);
            if (sb.length() > 0 && Character.toLowerCase(sb.charAt(index)) == Character.toLowerCase(ch) && ch != sb.charAt(index)) {
                sb.deleteCharAt(index);
                index--;
            } else {
                sb.append(ch);
                index++;
            }

        }
        return sb.toString();
    }


    /****
     * 
     *
     *
     *
     * @param s
     * @return
     */
    public String makeGood(String s) {

        if (s.length() <= 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            deque.push(s.charAt(i));
        }

        while (!deque.isEmpty()) {

            Character ch = deque.pop();

            if (deque.peek() != null) {
                if (ch.equals(Character.toUpperCase(deque.peek())) || deque.peek().equals(Character.toUpperCase(ch))) {
                    deque.pop();
                } else {
                    sb.append(ch);
                }
            } else if (deque.peek() == null) {

                char c = sb.charAt(sb.length() - 1);
                if ((Character.toUpperCase(c) == ch) || (Character.toUpperCase(ch) == c)) {
                    sb.replace(sb.length() - 1, sb.length(), "");
                } else {
                    sb.append(ch);
                }
            }


        }
        sb.reverse();
        System.out.println(sb);
        return sb.toString();


    }


}
