package com.coderpwh.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 面试题 02.01. 移除重复节点
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 * <p>
 * 示例1:
 * <p>
 * 输入：[1, 2, 3, 3, 2, 1]
 * 输出：[1, 2, 3]
 * 示例2:
 * <p>
 * 输入：[1, 1, 1, 1, 2]
 * 输出：[1, 2]
 * 提示：
 * <p>
 * 链表长度在[0, 20000]范围内。
 * 链表元素在[0, 20000]范围内。
 *
 * @author coderpwh
 * @date 2023/10/13 9:50
 */
public class RemoveDuplicateNodes {

    public static void main(String[] args) {

        RemoveDuplicateNodes remove = new RemoveDuplicateNodes();

        // 创建二叉树
        ListNode listNode = remove.createNode();

        remove.print(listNode);


        // 删除重复节点
        ListNode root = remove.removeDuplicateNodes(listNode);
        System.out.println();

        remove.print(root);

    }


    /***
     * 打印链表
     * @param root
     */
    public void print(ListNode root) {
        ListNode node = root;

        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }


    /***
     * 创建链表
     * @return
     */
    public ListNode createNode() {

        ListNode node11 = new ListNode(1);

        ListNode node22 = new ListNode(2, node11);

        ListNode node33 = new ListNode(3, node22);

        ListNode node3 = new ListNode(3, node33);

        ListNode node2 = new ListNode(2, node3);

        ListNode root = new ListNode(1, node2);

        return root;
    }


    /***
     * 1.时间复杂度为O(N)
     * 2.空间复杂度为O(1)
     *
     * 删除重复节点值
     * @param head
     * @return
     */
    public ListNode removeDuplicateNodes(ListNode head) {

        if (head == null) {
            return head;
        }

        Set<Integer> set = new HashSet<>();
        set.add(head.val);

        ListNode root = head;

        while (root.next != null) {
            ListNode cur = root.next;
            if (set.add(cur.val)) {
                root = root.next;
            } else {
                root.next = root.next.next;
            }
        }
        return head;
    }


}
