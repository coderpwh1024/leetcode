package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题 02.02. 返回倒数第 k 个节点
 * <p>
 * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
 * <p>
 * 注意：本题相对原题稍作改动
 * <p>
 * 示例：
 * <p>
 * 输入： 1->2->3->4->5 和 k = 2
 * 输出： 4
 * 说明：
 * <p>
 * 给定的 k 保证是有效的。
 *
 * @author coderpwh
 * @date 2023/10/16 13:57
 */
public class KthToLast {


    public static void main(String[] args) {

        int k = 2;
        KthToLast toLast = new KthToLast();
        // 创建节点
        ListNode node = toLast.createNode();

        Integer result = toLast.kthToLast(node, k);
        System.out.println(result);

    }


    /***
     * 创建节点
     * @return
     */
    public ListNode createNode() {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode root = new ListNode(1, node2);

        return root;
    }


    /***
     * 1. 时间复杂度为O(N)
     * 2. 空间复杂度为O(1)
     * @param head
     * @param k
     * @return
     */
    public int kthToLast(ListNode head, int k) {

        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        return list.get(list.size() - k);
    }
}
