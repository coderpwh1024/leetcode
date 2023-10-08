package com.coderpwh.leetcode;


import java.util.Stack;

/***
 *LCR 147. 最小栈
 *
 * 请你设计一个 最小栈 。它提供 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 *
 *
 * 实现 MinStack 类:
 *
 * MinStack() 初始化堆栈对象。
 * void push(int val) 将元素val推入堆栈。
 * void pop() 删除堆栈顶部的元素。
 * int top() 获取堆栈顶部的元素。
 * int getMin() 获取堆栈中的最小元素。
 */
public class MinStack2 {


    Stack<Integer> A;
    Stack<Integer> B;

    public MinStack2() {

        A = new Stack<>();
        B = new Stack<>();
    }


    /**
     * 推入堆栈
     * @param x
     */
    public void push(int x) {
        A.add(x);
        if(B.empty()||B.peek()>=x){
            B.add(x);
        }

    }


    /***
     * 删除栈顶元素
     */
    public void pop() {
        if(A.pop().equals(B.peek())){
            B.pop();
        }
    }


    /***
     * 获取栈顶元素
     * @return
     */
    public int top() {
      return  A.peek();
    }


    /**
     * 获取堆栈中的最小元素。
     * @return
     */
    public int getMin() {
        return  B.peek();
    }


}
