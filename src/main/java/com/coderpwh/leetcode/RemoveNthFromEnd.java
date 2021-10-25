package com.coderpwh.leetcode;


/***
 *
 *   19. 删除链表的倒数第N个结点
 *
 *
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 *
 * 进阶：你能尝试使用一趟扫描实现吗？
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * 示例 2：
 *
 * 输入：head = [1], n = 1
 * 输出：[]
 * 示例 3：
 *
 * 输入：head = [1,2], n = 1
 * 输出：[1]
 *
 *
 */
public class RemoveNthFromEnd {


    public static void main(String[] args) {

        RemoveNthFromEnd end = new RemoveNthFromEnd();

        ListNode head = end.getNode();

        end.printNode(head);


        System.out.println();


        ListNode node1 = end.getNodeOne();

        ListNode node = end.removeNthFromEnd(head, 2);


        System.out.println("删除结点后的值为");
        end.printNode(node);

      /*  System.out.println();
        ListNode testNode = end.test(head, 2);

        end.printNode(testNode);*/

    }


    /***
     *   获取其链表
     * @return
     */
    public ListNode getNode() {

        ListNode node5 = new ListNode(5);

        ListNode node4 = new ListNode(4, node5);

        ListNode node3 = new ListNode(3, node4);

        ListNode node2 = new ListNode(2, node3);

        ListNode node1 = new ListNode(1, node2);

        return node1;

    }

    public ListNode getNodeOne() {

        ListNode node1 = new ListNode(1);

        return node1;
    }


    /***
     * 打印链表
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
     *
     *   思路:
     *      1. 时间复杂度为O(N)
     *      2. 空间复杂度为O(1)
     *      3. 并未完全通过测试用例
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int length = getLength(head);

        int i = length - n;

        int j = 0;

        ListNode p = head;

        while (p.next != null && j < i - 1) {
            p = p.next;
            j++;
        }


        if (p.next == null) {
            return head.next;
        }

        p.next = p.next.next;
        return head;
    }


    /***
     *
     *       思路:
     *         1. 时间复杂度为O(N)
     *         2. 空间复杂度为O(1)
     *         3. 计算器其链表的长度，找到链表中的位置，删除其对应的结点
     *
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode test(ListNode head, int n) {


        int length = getLength(head);

        ListNode node = new ListNode(0, head);


        ListNode cur = node;

        for (int i = 1; i < length - n + 1; i++) {
            cur = cur.next;
        }

        cur.next = cur.next.next;

        ListNode ans = node.next;

        return ans;
    }


    /***
     *   获取链表的长度
     * @param head
     * @return
     */
    public int getLength(ListNode head) {

        int length = 0;

        while (head != null) {
            length++;
            head = head.next;
        }

        return length;
    }


}
