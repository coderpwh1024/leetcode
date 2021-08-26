package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

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
