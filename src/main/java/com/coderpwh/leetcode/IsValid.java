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
