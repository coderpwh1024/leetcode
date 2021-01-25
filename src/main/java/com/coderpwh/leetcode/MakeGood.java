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


    /**** 
     *      思路:  
     *        1. 时间复杂度为O(N)
     *        2. 空间复杂度为O(N)
     *        3. 新建临时变量 index 来统计StringBuilder里面拼接字符的位置
     *        4. 不满足的条件则删除该字符的位置等，满足条件的则拼接起来
     *
     *
     * @param s
     * @return
     */
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
     *    思路: 
     *      1:时间复杂度为O(N^2)
     *      2. 空间复杂度为O(N)
     *      3. 利用栈实现未通过测试用例,未考虑到过滤出来的字符串StringBuild 里面的字符
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
