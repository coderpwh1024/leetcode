package com.coderpwh.leetcode;


/***
 *
 * 203 移除链表元素
 *
 *给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 *  
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,2,6,3,4,5,6], val = 6
 * 输出：[1,2,3,4,5]
 * 示例 2：
 *
 * 输入：head = [], val = 1
 * 输出：[]
 * 示例 3：
 *
 * 输入：head = [7,7,7,7], val = 7
 * 输出：[]
 *
 *
 *
 */
public class RemoveElements {

    public static void main(String[] args) {


        ListNode head = new ListNode();
        int val = 6;


        RemoveElements remove = new RemoveElements();
        remove.removeElements(head, val);

    }


    /***
     *      思路:
     *         1. 时间复杂度为O(N)
     *         2. 空间复杂度为O(1)
     *         3. 通过迭代方式实现
     *
     *
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {

        ListNode headNode = new ListNode(0);

        headNode.next = head;

        ListNode temp = headNode;

        while (temp.next != null) {

            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return headNode.next;
    }


}
