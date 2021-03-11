package com.coderpwh.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author coderpwh
 */
public class Calculate {


    public static void main(String[] args) {

        // 3+4=7
        String str = "3+2*2+2/2+1";

        Calculate cal = new Calculate();
        cal.calculate(str);
        System.out.println(cal.test(str));
    }


    public int test(String s) {

        Deque<Integer> deque = new LinkedList<>();
        int n = s.length();
        char seqstr = '+';
        int num = 0;

        for (int i = 0; i < n; i++) {

            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == n - 1) {
                switch (seqstr) {
                    case '+':
                        deque.push(num);
                        break;
                    case '-':
                        deque.push(-num);
                        break;
                    case '*':
                        deque.push(deque.pop() * num);
                        break;
                    case '/':
                        deque.push(deque.pop() / num);
                        break;
                }
                seqstr = s.charAt(i);
                num = 0;
            }

        }
        int ans = 0;
        while (!deque.isEmpty()) {
            ans += deque.pop();
        }
        return ans;


    }


    public int calculate(String s) {

        Deque<Integer> stack = new LinkedList<>();
        char preSign = '+';
        int num = 0;
        int n = s.length();

        for (int i = 0; i < n; ++i) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == n - 1) {

                switch (preSign) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);
                        break;
                    default:
                        stack.push(stack.pop() / num);
                }
                preSign = s.charAt(i);
                num = 0;

            }

        }
        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }

}
