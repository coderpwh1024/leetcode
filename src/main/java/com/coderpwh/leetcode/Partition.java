package com.coderpwh.leetcode;

/**
 * 面试题 02.04. 分割链表
 * <p>
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
 * 你不需要 保留 每个分区中各节点的初始相对位置。
 *
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,4,3,2,5,2], x = 3
 * 输出：[1,2,2,4,3,5]
 * 示例 2：
 * <p>
 * 输入：head = [2,1], x = 2
 * 输出：[1,2]
 *
 * @author coderpwh
 * @date 2023/10/16 10:37
 */
public class Partition {

    public static void main(String[] args) {

        Partition partition = new Partition();

        // 创建链表
        ListNode head = partition.createNode();
        partition.print(head);

        int x = 3;

        System.out.println();
        System.out.println("------------------------------------");
        // 分割链表
        ListNode root = partition.partition(head, x);
        partition.print(root);


    }


    /***
     * 打印链表
     * @param head
     */
    public void print(ListNode head) {
        ListNode node = head;
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }

    }


    /***
     * 创建链表
     *
     * @return
     */
    public ListNode createNode() {
        ListNode node22 = new ListNode(2);
        ListNode node5 = new ListNode(5, node22);
        ListNode node2 = new ListNode(2, node5);
        ListNode node3 = new ListNode(3, node2);

        ListNode node4 = new ListNode(4, node3);
        ListNode root = new ListNode(1, node4);
        return root;
    }


    /***
     * 删除
     * @param head
     * @param x
     * @return
     */
    public ListNode partition(ListNode head, int x) {

        ListNode small = new ListNode(0);
        ListNode smallHead = small;

        ListNode large = new ListNode(0);
        ListNode largeHead = large;

        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }

        large.next = null;
        small.next = largeHead.next;

        return smallHead.next;
    }


}
