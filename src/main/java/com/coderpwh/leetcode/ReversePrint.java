package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 剑指 Offer 06. 从尾到头打印链表
 * <p>
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 *
 * @author coderpwh
 * @date 2023/9/20 10:45
 */
public class ReversePrint {

    public static void main(String[] args) {

        ReversePrint print = new ReversePrint();

        // 构建链表结构
        ListNode head = print.createNode();

        // 打印链表
//        print.print(head);

        System.out.println();
        System.out.println("---------------------");

        int arr[] = print.reversePrint(head);

        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }


    /***
     * [1,3,2]
     * [2,3,1]
     * 创建根节点
     * @return
     */
    public ListNode createNode() {
        ListNode node2 = new ListNode(2);

        ListNode node3 = new ListNode(3, node2);

        ListNode node = new ListNode(1, node3);

        return node;
    }


    /***
     * 正序打印
     * @param head
     */
    public void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }


    /***
     * 逆序打印
     *  1.时间复杂度为O(N)
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int arr[] = new int[list.size()];
        int size = list.size();

        for (int i = 0, j = size - 1; j >= 0 && i < size; i++, j--) {
            arr[i] = list.get(j);
        }
        return arr;
    }

}
