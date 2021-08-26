package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

/***
 *  109 有序链表转换二叉搜索树
 *  
 *给定一个单链表，其中的元素按升序排序，将其转换为高度平衡的二叉搜索树。
 *
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 *
 * 示例:
 *
 * 给定的有序链表： [-10, -3, 0, 5, 9],
 *
 * 一个可能的答案是：[0, -3, 9, -10, null, 5], 它可以表示下面这个高度平衡二叉搜索树：
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 *
 *
 */
public class SortedListToBST {

    public static void main(String[] args) {

        SortedListToBST bst = new SortedListToBST();

        ListNode listNode = bst.getListNode();

        bst.printNode(listNode);


    }


    public TreeNodes sortedListToBST(ListNode head) {

        List<Integer> list = printNode(head);

        return help(list, 0, list.size() - 1);
    }


    /***
     *     思路:
     *        1. 时间复杂度为O(N)
     *        2. 空间复杂度为O(N)
     *
     *
     * @param list
     * @param left
     * @param right
     * @return
     */
    public TreeNodes help(List<Integer> list, int left, int right) {

        if (left > right) {
            return null;
        }

        int mid = (left + right) / 2;

        TreeNodes root = new TreeNodes(list.get(mid));

        root.left = help(list, left, mid - 1);

        root.right = help(list, mid + 1, right);

        return root;

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


    /**
     * 遍历链表
     *
     * @param listNode
     * @return
     */
    public List<Integer> printNode(ListNode listNode) {

        List<Integer> list = new ArrayList<>();
        while (listNode != null) {
            System.out.print(listNode.val);
            System.out.print("  ");
            list.add(listNode.val);
            listNode = listNode.next;
        }
        return list;
    }

}
 
