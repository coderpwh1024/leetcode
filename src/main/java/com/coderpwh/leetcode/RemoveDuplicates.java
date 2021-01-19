 package com.coderpwh.leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class RemoveDuplicates {

    public static void main(String[] args) {

//        String str = "abbaca";
//        String str = "azxxzy";  // ay

//        String str = "abbbabaaa";
        String str = "aaaaaaaa";

        RemoveDuplicates remove = new RemoveDuplicates();
        remove.removeDuplicates(str);
        System.out.println(remove.removeDuplicates(str));

    }


    /*****
     *     思路:
     *       1：时间复杂度O(N) 主要遍历字符串S的长度
     *       2: 空间复杂度为O(N) 创建StringBuilder来拼接
     *       3: 利用栈的方式来实现
     * @param S
     * @return
     */
    public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();

        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < S.length(); i++) {
            if ((!deque.isEmpty()) && deque.peek().equals(S.charAt(i))) {
                deque.pop();
            } else {
                deque.push(S.charAt(i));
            }
        }

        System.out.println(deque.size());
        while (!deque.isEmpty()) {
            sb.append(deque.pop());
        }
        return sb.reverse().toString();
    }

}

