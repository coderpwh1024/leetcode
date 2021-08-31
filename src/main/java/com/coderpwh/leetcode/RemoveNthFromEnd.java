package com.coderpwh.leetcode;

import java.util.List;

public class RemoveNthFromEnd {


    public static void main(String[] args) {

        RemoveNthFromEnd end = new RemoveNthFromEnd();

        ListNode head = end.getNode();

        end.printNode(head);


        System.out.println();

        int n = 2;

        ListNode node = end.removeNthFromEnd(head, n);

        end.printNode(node);

    }


    public ListNode getNode() {

        ListNode node5 = new ListNode(5);

        ListNode node4 = new ListNode(4, node5);

        ListNode node3 = new ListNode(3, node4);

        ListNode node2 = new ListNode(2, node3);

        ListNode node1 = new ListNode(1, node2);

        return node1;

    }

    public void printNode(ListNode head) {

        while (head != null) {
            System.out.print(head.val);
            System.out.print("  ");
            head = head.next;
        }

    }


    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return null;
        }

        int count = 0;

        ListNode tail = head;
        while (tail != null) {
            count++;
            tail = tail.next;
        }

        System.out.println("结点个数为:" + count);


        int flag = count - n + 1;
        int num = 0;


        ListNode node = head.next;
        while (head != null) {
            num++;
            if (num == flag) {
                System.out.println("num:" + num + "  flag:" + flag);
                head = head.next.next;
                break;
            } else {
                head = head.next;
            }
        }

        System.out.println(head);
        System.out.println(node);
        return head;
    }

}
