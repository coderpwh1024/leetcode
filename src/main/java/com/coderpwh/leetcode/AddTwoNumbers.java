package com.coderpwh.leetcode;

/***
 * 2. 两数相加
 *
 *  给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 * 示例 2：
 *
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 *
 *
 *
 */
public class AddTwoNumbers {

    public static void main(String[] args) {

        AddTwoNumbers add = new AddTwoNumbers();

        ListNode node = add.getNode1();

        ListNode node2 = add.getNode2();

        add.printNode(node);

        System.out.println();
        add.printNode(node2);

        System.out.println();

        ListNode head = add.addTwoNumbers(node, node2);

        add.printNode(head);

/*        System.out.println();


        ListNode test = add.addTwoNumbers(node, node2);

        add.printNode(test);*/

    }


    /***
     *   创建结点
     *
     * @return
     */
    public ListNode getNode1() {

        ListNode listNode4 = new ListNode(4);

        ListNode listNode6 = new ListNode(6, listNode4);

        ListNode listNode5 = new ListNode(5, listNode6);

        return listNode5;
    }


    /**
     * 创建结点
     *
     * @return
     */
    public ListNode getNode2() {

        ListNode node3 = new ListNode(3);

        ListNode node4 = new ListNode(4, node3);

        ListNode node2 = new ListNode(2, node4);

        return node2;

    }


    /***
     *   打印链表结点
     * @param head
     */
    public void printNode(ListNode head) {

        while (head != null) {
            System.out.print(head.val);
            System.out.print(" ");
            head = head.next;
        }

    }


    /***
     *   思路:
     *      1. 时间复杂度为O(N)
     *      2. 空间复杂度为O(1)
     *      3. 主要是对两个链表同时遍历，容易出错点就是进位的处理
     *
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = null, tail = null;

        // 进位
        int carry = 0;

        while (l1 != null || l2 != null) {

            int n1 = l1 != null ? l1.val : 0;

            int n2 = l2 != null ? l2.val : 0;

            int sum = n1 + n2 + carry;

            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }

            carry = sum / 10;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }

        }
        System.out.println(carry);

        if (carry > 0) {
            tail.next = new ListNode(carry);
        }


        return head;
    }


    public ListNode test(ListNode node1, ListNode node2) {

        ListNode head = null, tail = null;

        int carry = 0;

        while (node1 != null || node2 != null) {

            int n1 = node1 != null ? node1.val : 0;

            int n2 = node2 != null ? node2.val : 0;

            int sum = n1 + n2 + carry;

            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }

            carry = sum / 10;

            if (node1 != null) {
                node1 = node1.next;
            }

            if (node2 != null) {
                node2 = node2.next;
            }

        }

        if (carry > 0) {
            tail.next = new ListNode(carry);
        }


        return head;
    }


}
