package com.coderpwh.leetcode;

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

        ListNode head = print.createNode();

        int arr[] = print.reversePrint(head);

        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }


    /***
     * [1,3,2]
     * 创建根节点
     * @return
     */
    public ListNode createNode() {
        ListNode node2 = new ListNode(2);

        ListNode node3 = new ListNode(3, node2);

        ListNode node = new ListNode(1, node3);

        return node;
    }


    public int[] reversePrint(ListNode head) {
        return null;
    }

}
