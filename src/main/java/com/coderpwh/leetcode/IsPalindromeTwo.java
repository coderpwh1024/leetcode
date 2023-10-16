package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

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

        IsPalindromeTwo palindrome = new IsPalindromeTwo();

        // 创建节点
        ListNode root = palindrome.createNode();

        boolean result = palindrome.isPalindrome(root);
        System.out.println(result);
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


    /***
     * 回文链表
     * 1. 时间复杂度为O(N)
     * 2. 空间复杂度为O(N)
     *
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            if (!list.get(i).equals(list.get(j))) {
                return false;
            }
        }

        return true;
    }


}
