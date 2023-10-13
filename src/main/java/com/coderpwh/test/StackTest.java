package com.coderpwh.test;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

/**
 * @author coderpwh
 * @date 2023/10/13 15:58
 */
public class StackTest {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("c");
        stack.push("f");
        stack.push("e");
        stack.push("d");
        stack.push("b");
        stack.push("a");


        while (stack.peek() != null && stack.peek() != "") {
            System.out.print(stack.pop() + " ");
        }


    }
}
