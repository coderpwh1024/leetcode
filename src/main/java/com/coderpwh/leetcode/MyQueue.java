package com.coderpwh.leetcode;

import java.util.LinkedList;

public class MyQueue {


    private LinkedList<Integer> in;

    private LinkedList<Integer> out;


    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        in = new LinkedList<>();
        out = new LinkedList<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {

        in.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (out.isEmpty()) {
            in2out();
        }
        return out.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (out.isEmpty()) {
            in2out();
        }
        return out.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }

    private void in2out() {
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
    }

}
