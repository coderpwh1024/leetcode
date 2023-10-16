package com.coderpwh.leetcode;

/**
 * @author coderpwh
 * @date 2023/10/16 10:37
 */
public class Partition {

    public static void main(String[] args) {

    }


    public ListNode createNode() {
        ListNode node22 = new ListNode(2);
        ListNode node5 = new ListNode(5, node22);
        ListNode node2 = new ListNode(2, node5);
        ListNode node3 = new ListNode(3, node2);

        ListNode node4 = new ListNode(4, node3);

        ListNode root = new ListNode(1, node4);

        return root;
    }


    public ListNode partition(ListNode head, int x) {

    }


}
