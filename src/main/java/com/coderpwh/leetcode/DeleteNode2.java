package com.coderpwh.leetcode;

import java.util.List;

/**
 * 剑指 Offer 18. 删除链表的节点
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * <p>
 * 返回删除后的链表的头节点。
 * <p>
 * 注意：此题对比原题有改动
 * <p>
 * 示例 1:
 * <p>
 * 输入: head = [4,5,1,9], val = 5
 * 输出: [4,1,9]
 * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 * 示例 2:
 * <p>
 * 输入: head = [4,5,1,9], val = 1
 * 输出: [4,5,9]
 * 解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
 *
 * @author coderpwh
 * @date 2023/9/18 11:22
 */
public class DeleteNode2 {

    public static void main(String[] args) {

        int val = 5;

        DeleteNode2 delete = new DeleteNode2();

        // 构建链表
        ListNode listNode = delete.createNode();
        // 打印链表
        delete.printByListNode(listNode);

        System.out.println();
        System.out.println("-------------------");
        // 删除链表
        ListNode node = delete.deleteNode(listNode, val);
        System.out.println(node);

        delete.printByListNode(node);

    }

    /***
     *  打印链表结构
     * @param listNode
     */
    public void printByListNode(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val);
            System.out.print("  ");
            listNode = listNode.next;
        }
    }

    /***
     * [4,5,1,9]
     * 构建链表结构
     * @return
     */
    public ListNode createNode() {
        ListNode node9 = new ListNode(9);

        ListNode node1 = new ListNode(1, node9);

        ListNode node5 = new ListNode(5, node1);

        ListNode node4 = new ListNode(4, node5);

        return node4;
    }


    /***
     * [4,5,1,9] val=5
     *  删除链表
     * @param head
     * @param val
     * @return
     */
    public ListNode deleteNode(ListNode head, int val) {

        if (head.val == val) {
            return head.next;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        if (cur != null) {
            pre.next = cur.next;
        }
        return head;
    }


    /***
     *
     * @param head
     * @return
     */
    public ListNode delete(ListNode head) {
        ListNode node = head;
        head.val = node.val;
        head.next = node.next;
        return head;
    }


}
