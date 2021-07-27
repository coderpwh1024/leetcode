package com.coderpwh.leetcode;

import java.util.HashSet;
import java.util.Set;

public class HasCycle {


    public static void main(String[] args) {

        ListNode head = new ListNode();

        head.add(3);
        head.add(2);
        head.add(0);
        head.add(-4);


        HasCycle hasCycle = new HasCycle();
//        hasCycle.hasCycle(head);
        System.out.println(hasCycle.hasCycle(head));

    }


    public boolean hasCycle(ListNode head) {

        Set<ListNode> set = new HashSet<>();

        while (head!=null){

            if(!set.add(head)){
                return true;
            }
            head = head.next;
        }

        return false;
    }


}
