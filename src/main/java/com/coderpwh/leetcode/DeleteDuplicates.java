package com.coderpwh.leetcode;

/**
 * 83 删除排序链表中的重复元素
 * <p>
 * 82. 删除排序链表中的重复元素 II
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


        // 创建链表
        ListNode head = deleteDuplicates.create();

        // 打印链表
        deleteDuplicates.printNode(head);

        System.out.println("");

        System.out.println("删除重复元素的结点为:");

        // 删除重复结点
        ListNode result = deleteDuplicates.deleteDuplicates2(head);


        // 打印删除重复结点后的元素
        deleteDuplicates.printNode(result);


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

    public ListNode create2() {

        ListNode node3 = new ListNode(3);

        ListNode node2 = new ListNode(2, node3);

        ListNode node1 = new ListNode(1, node2);

        ListNode node11 = new ListNode(1, node1);

        ListNode node111 = new ListNode(1, node11);

        return node111;
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


    /***
     *   思路:
     *      1. 时间复杂度为O(N)
     *      2. 空间复杂度为O(1)
     *      3. 要防止头结点可能被删除，需要构建一个头结点取代之前的，否则头结点的数据难删除
     *
     *
     * @param head
     * @return
     */
    public ListNode deleteDuplicates2(ListNode head) {


        if (head == null) {
            return null;
        }

        ListNode node = new ListNode(0, head);

        ListNode cur = node;


        while (cur.next != null && cur.next.next != null) {

            if (cur.next.val == cur.next.next.val) {

                // x =1
                int x = cur.next.val;

                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }


        return node.next;
    }


}
