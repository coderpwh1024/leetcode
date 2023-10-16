package com.coderpwh.leetcode;

/**
 * 面试题 02.06. 回文链表
 * <p>
 * 编写一个函数，检查输入的链表是否是回文的。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入： 1->2
 * 输出： false
 * 示例 2：
 * <p>
 * 输入： 1->2->2->1
 * 输出： true
 * <p>
 * <p>
 * 进阶：
 *
 * @author coderpwh
 * @date 2023/10/16 10:07
 */
public class IsPalindromeTwo {

    public static void main(String[] args) {

    }


    /***
     * 创建节点
     * @return
     */
    public ListNode createNode() {
        ListNode node1 = new ListNode(1);
        ListNode node22 = new ListNode(2, node1);
        ListNode node2 = new ListNode(2, node22);
        ListNode root = new ListNode(1, node2);

        return root;
    }


    public boolean isPalindrome(ListNode head) {

        return false;
    }


}
