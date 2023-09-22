package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个头节点为 head 的单链表用于记录一系列核心肌群训练编号，请将该系列训练编号 倒序 记录于链表并返回。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * 输入：head = [1,2]
 * 输出：[2,1]
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * 输入：head = []
 * 输出：[]
 *
 * @author coderpwh
 * @date 2023/9/21 14:27
 */
public class TrainningPlan {

    public static void main(String[] args) {

        TrainningPlan plan = new TrainningPlan();

        // 创建链表
        ListNode head = plan.createNode();

        // 打印链表
        plan.print(head);
        System.out.println();
        System.out.println("-----------------------------");

        // 反转链表
        ListNode node = plan.trainningPlan(head);

        // 打印反转后的链表
        plan.print(node);
    }


    /***
     * 打印链表
     * @param head
     */
    public void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }


    /***
     *创建链表
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
     * head = [1,2,3,4,5]
     *  * 输出：[5,4,3,2,1]
     * 反转链表
     * @param head
     * @return
     */
    public ListNode trainningPlan(ListNode head) {

        ListNode cur = head;
        ListNode pre = null;

        while (cur != null) {
            ListNode temp = cur.next; //  [2,3,4,5] , [3,4,5],[4,5] [5]
            cur.next = pre;     // null  , [1,2,3,4,5] [2,3,4,5]  [3,4,5]
            pre = cur;   // [1,2,3,4,5]    [2,3,4,5]  [3,4,5]  [4,5]
            cur = temp;  // [2,3,4,5]   [3,4,5]  [4,5] [5]
         }
        return pre;
    }


}
