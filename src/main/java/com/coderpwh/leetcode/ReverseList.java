package com.coderpwh.leetcode;

public class ReverseList {

    public static void main(String[] args) {


    }


    public ListNode reverseList(ListNode head) {

        ListNode prev = null;

        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;

        }
        return prev;
    }


    /***
     *  反转链表
     *
     *   1-->2-->3-->4-->5
     *
     *   5-->4-->3-->2-->1
     *
     *
     * @param head
     * @return
     */
    public ListNode test(ListNode head) {

        ListNode prev = null;

        ListNode curr = head;

        while (curr != null) {

            //  临时结点
            ListNode nextTemp = curr.next;

            curr.next = prev;

            prev = curr;

            curr = nextTemp;


        }

        return prev;


    }


}
