package com.coderpwh.leetcode;

import java.util.Stack;

/***
 *
 *
 */
public class CalPoints {

    public static void main(String[] args) {


//        String[] str = {"5", "2", "C", "D", "+"};

        String[] str = {"5","-2","4","C","D","9","+","+"};

        CalPoints calPoints = new CalPoints();

        calPoints.calPoints(str);
    }


    public int calPoints(String[] ops) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("C") && !stack.isEmpty()) {
                stack.pop();
            } else if (ops[i].equals("D") && !stack.isEmpty()) {
                Integer count = stack.peek() * 2;
                stack.push(count);
            } else if (ops[i].equals("+") && !stack.isEmpty()) {
                Integer a = stack.peek();
                stack.pop();
                Integer b = stack.peek();
                stack.push(a);
                stack.push(a + b);
            } else {
                stack.push(Integer.valueOf(ops[i]));
            }

        }

        Integer count = 0;
        for (Integer a : stack) {
            count += a;
        }

        System.out.println(count);

        return count;
    }

}
