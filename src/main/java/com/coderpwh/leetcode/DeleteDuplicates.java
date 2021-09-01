package com.coderpwh.leetcode;

import org.omg.CORBA.NO_IMPLEMENT;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 83 删除排序链表中的重复元素
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 * <p>
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 *
 * @author coderpwh
 */
public class DeleteDuplicates {


    public static void main(String[] args) {

        DeleteDuplicates deleteDuplicates = new DeleteDuplicates();

        ListNode head = deleteDuplicates.create();

        deleteDuplicates.printNode(head);

    }


   /***
     *    创建链表
     *
     * @return
     */
    public ListNode create() {

        ListNode node5 = new ListNode(5);

        ListNode node4 = new ListNode(4, node5);

        ListNode node44 = new ListNode(4, node4);

        ListNode node3 = new ListNode(3, node44);

        ListNode node32 = new ListNode(3, node3);

        ListNode node2 = new ListNode(2, node32);

        ListNode node1 = new ListNode(1, node2);

        return node1;

    }


    /***
     *  打印链表
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
     *    思路:
     *      1. 时间复杂度为O(N)
     *      2. 空间复杂度为O(1)
     *
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {


        if (head == null) {
            return head;
        }

        ListNode cur = head;

        while (cur.next != null) {

            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }

        }
        return head;
    }


}
