package com.coderpwh.leetcode;

/**
 * 剑指 Offer 22. 链表中倒数第k个节点
 * 简单
 * 506
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 * 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。
 * <p>
 * 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 k = 2.
 * <p>
 * 返回链表 4->5.
 *
 * @author coderpwh
 * @date 2023/9/21 10:40
 */
public class GetKthFromEnd {

    public static void main(String[] args) {

        int k = 2;
        GetKthFromEnd end = new GetKthFromEnd();

        // 创建节点
        ListNode node = end.createNode();

        // 打印其节点
        end.print(node);
        System.out.println();
        System.out.println("---------------------------");

        ListNode head = end.getKthFromEnd(node, k);
        System.out.println(head);

        end.print(head);

    }


    /***
     * 打印节点
     * @param node
     */
    public void print(ListNode node) {

        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }


    /***
     * 1->2->3->4->5
     * 创建链表
     * @return
     */
    public ListNode createNode() {

        ListNode node5 = new ListNode(5);

        ListNode node4 = new ListNode(4, node5);

        ListNode node3 = new ListNode(3, node4);

        ListNode node2 = new ListNode(2, node3);

        ListNode node = new ListNode(1, node2);

        return node;
    }


    /***
     *  1->2->3->4->5, 和 k = 2.
     *  4->5
     * 获取倒数第k个节点
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd(ListNode head, int k) {

        int n = getNodeLength(head);

        for (int i = 0; i < n - k; i++) {
            head = head.next;
        }

        return head;
    }

    public int getNodeLength(ListNode head) {

        int length = 0;
        while (head != null) {
            length += 1;
            head = head.next;
        }
        return length;
    }

}
