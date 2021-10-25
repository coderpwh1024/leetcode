package com.coderpwh.leetcode;

public class ListNodeTest {


    public static void main(String[] args) {

        ListNodeTest nodeTest = new ListNodeTest();

        ListNode node = nodeTest.getListNode();

        System.out.println("打印结点为:");

        nodeTest.test(node);

        System.out.println();
        ListNode midNode = nodeTest.getMidNode(node);
        System.out.println("中间结点为:" + midNode.val);

    }


    /***
     *   构建链表
     * @return
     */
    public ListNode getListNode() {


        ListNode node9 = new ListNode(9);

        ListNode node5 = new ListNode(5, node9);

        ListNode node0 = new ListNode(0, node5);

        ListNode node3 = new ListNode(-3, node0);

        ListNode node10 = new ListNode(-10, node3);

        return node10;
    }


    public void test(ListNode head) {

        while (head != null) {
            System.out.print(head.val);
            System.out.print(" ");
            head = head.next;
        }
    }

    public ListNode getMidNode(ListNode left) {

        ListNode fast = left;

        ListNode slow = left;

        while (fast != null && fast.next != null) {
            fast = fast.next;
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }


}
