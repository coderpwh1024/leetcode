package com.coderpwh.leetcode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class IsValid {

    public static void main(String[] args) {

        IsValid isValid = new IsValid();
        System.out.println(isValid.isValid("{[]}"));
        System.out.println(isValid.isValid("{]}"));

    }

    /*****
     *    思路:
     *      1：时间复杂度为O(N),对长度为N的字符串进行遍历
     *      2：空间复杂度为O(N+6) N为字符串的长度
     *      3: 左右括号最终要闭环才能有效，把全部的左括号全部放入栈中
     *         然后遍历栈，对栈顶元素进行匹配，匹配成功就是有效，不成功就是无效的
     *         用map建立对应的key-value 关系
     *
     * @param s
     * @return
     */
    public boolean isValid(String s) {

        int n = s.length();

        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');


        Deque<Character> deque = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                if (deque.isEmpty() || !deque.peek().equals(map.get(ch))) {
                    return false;
                }
                deque.pop();
            } else {
                deque.push(ch);
            }

        }
        return deque.isEmpty();


    }

}
