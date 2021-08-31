 package com.coderpwh.leetcode;

import java.util.List;

public class RemoveNthFromEnd {


    public static void main(String[] args) {

        RemoveNthFromEnd end = new RemoveNthFromEnd();

        ListNode head = end.getNode();

        end.printNode(head);


        System.out.println();

        int n = 2;

    /*    ListNode node = end.removeNthFromEnd(head, n);

        end.printNode(node);*/

        System.out.println();
        ListNode testNode = end.test(head, 2);

        end.printNode(testNode);

    }


    /***
     *   获取其链表
     * @return
     */
    public ListNode getNode() {

        ListNode node5 = new ListNode(5);

        ListNode node4 = new ListNode(4, node5);

        ListNode node3 = new ListNode(3, node4);

        ListNode node2 = new ListNode(2, node3);

        ListNode node1 = new ListNode(1, node2);

        return node1;

    }


    /***
     * 打印链表
     * @param head
     */
    public void printNode(ListNode head) {

        while (head != null) {
            System.out.print(head.val);
            System.out.print("  ");
            head = head.next;
        }

    }


    /***
     *
     *   思路:
     *      1. 时间复杂度为O(N)
     *      2. 空间复杂度为O(1)
     *      3. 测试用例未完全通过
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int length = getLength(head);

        ListNode node = head;

        for (int i = 1; i < length - n; i++) {
            node = node.next;
        }
        node.next = node.next.next;

        return head;

    }


    /***
     *
     *       思路:
     *         1. 时间复杂度为O(N)
     *         2. 空间复杂度为O(1)
     *         3. 计算器其链表的长度，找到链表中的位置，删除其对应的结点
     *
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode test(ListNode head, int n) {


        int length = getLength(head);

        ListNode node = new ListNode(0, head);


        ListNode cur = node;

        for (int i = 1; i < length - n + 1; i++) {
            cur = cur.next;
        }

        cur.next = cur.next.next;

        ListNode ans = node.next;

        return ans;
    }


    /***
     *   获取链表的长度
     * @param head
     * @return
     */
    public int getLength(ListNode head) {

        int length = 0;

        while (head != null) {
            length++;
            head = head.next;
        }

        return length;
    }


}
