package com.coderpwh.leetcode;

/**
 * 面试题 02.05. 链表求和
 * <p>
 * 给定两个用链表表示的整数，每个节点包含一个数位。
 * <p>
 * 这些数位是反向存放的，也就是个位排在链表首部。
 * <p>
 * 编写函数对这两个整数求和，并用链表形式返回结果。
 * 示例：
 * <p>
 * 输入：(6 -> 1 -> 7) + (2 -> 9 -> 5)，即617 + 295
 * 输出：9 -> 1 -> 2，即912
 *
 * @author coderpwh
 * @date 2023/10/13 13:50
 */
public class AddTwoNumbersTwo {

    public static void main(String[] args) {

        AddTwoNumbersTwo numbers = new AddTwoNumbersTwo();

        // 获取其节点
        ListNode one = numbers.getListNodeOne();
        ListNode two = numbers.getListNodeTwo();

        numbers.print(one);
        System.out.println();
        numbers.print(two);

        ListNode root = numbers.add(one, two);

        System.out.println();
        numbers.print(root);


    }


    /**
     * 打印
     *
     * @param root
     */
    public void print(ListNode root) {
        ListNode head = root;
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }


    // 构建链表
    public ListNode getListNodeOne() {
        ListNode node7 = new ListNode(7);
        ListNode node1 = new ListNode(1, node7);
        ListNode root = new ListNode(6, node1);

        return root;
    }

    public ListNode getListNodeTwo() {
        ListNode node5 = new ListNode(5);
        ListNode node9 = new ListNode(9, node5);
        ListNode node2 = new ListNode(2, node9);
        return node2;
    }


    /***
     * 链表求和
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = null;
        ListNode tail = null;

        int carry = 0;

        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;

            int n2 = l2 != null ? l2.val : 0;

            int sum = n1 + n2 + carry;

            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }

            carry = sum / 10;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }


    /***
     * 链表正向添加
     * @param l1
     * @param l2
     * @return
     */
    public ListNode add(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }


}
