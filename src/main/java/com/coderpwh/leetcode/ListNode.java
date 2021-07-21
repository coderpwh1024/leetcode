package com.coderpwh.leetcode;

/**
 * @author coderpwh
 */
public class ListNode {

    int val;

    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    ListNode(Object obj) {
        this.val = (int) obj;
    }


    public void add(int value) {

        ListNode newNode = new ListNode(value);

        if (this.next == null) {
            this.next = newNode;
        } else {
            this.next.add(value);
        }
    }


}
