package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * LCR 142. 训练计划 IV
 * <p>
 * 给定两个以 有序链表 形式记录的训练计划 l1、l2，分别记录了两套核心肌群训练项目编号，
 * 请合并这两个训练计划，按训练项目编号 升序 记录于链表并返回。
 * <p>
 * 注意：新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 * 示例 2：
 * <p>
 * 输入：l1 = [], l2 = []
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：l1 = [], l2 = [0]
 * 输出：[0]
 *
 * @author coderpwh
 * @date 2023/9/22 15:46
 */
public class TrainningPlanFour {


    public static void main(String[] args) {

        TrainningPlanFour plan = new TrainningPlanFour();

        // 创建节点
        ListNode node1 = plan.createNodeOne();
        ListNode node2 = plan.createNodeTwo();

        plan.print(node1);

        System.out.println();
        System.out.println("----------------------");
        plan.print(node2);


        // 合并链表
        ListNode head = plan.trainningPlan(node1, node2);

        System.out.println();
        System.out.println("----------------------");

        // 打印
        plan.print(head);


    }


    /***
     * 创建节点
     * @return
     */
    public ListNode createNodeOne() {
        ListNode node4 = new ListNode(4);
        ListNode node2 = new ListNode(2, node4);
        ListNode node = new ListNode(1, node2);
        return node;
    }


    /***
     *创建节点
     * @return
     */
    public ListNode createNodeTwo() {
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node = new ListNode(1, node3);
        return node;
    }

    public void print(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }


    /***
     * 转换
     *   l1 = [1,2,4],
     *   l2 = [1,3,4]
     *
     *  [1,1,2,3,4,4]
     *
     *  1.递归方式
     *  2.时间复杂度为O(N+M)
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode trainningPlan(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = trainningPlan(l1.next, l2);
            return l1;
        } else {
            l2.next = trainningPlan(l2.next, l1);
            return l2;
        }
    }







}
