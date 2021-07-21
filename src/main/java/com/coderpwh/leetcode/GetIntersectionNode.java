package com.coderpwh.leetcode;

import java.util.HashSet;
import java.util.Set;

/***
 *  剑指 Offer 52. 两个链表的第一个公共节点
 *
 *输入两个链表，找出它们的第一个公共节点。
 *
 *
 * 如下面的两个链表：
 *
 *
 *
 * 在节点 c1 开始相交。
 *
 *  
 *
 * 示例 1：
 *
 *
 *
 * 输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
 * 输出：Reference of the node with value = 8
 * 输入解释：相交节点的值为 8 （注意，如果两个列表相交则不能为 0）。从各自的表头开始算起，链表 A 为 [4,1,8,4,5]，链表 B 为 [5,0,1,8,4,5]。在 A 中，相交节点前有 2 个节点；在 B 中，相交节点前有 3 个节点。
 *
 *
 */
public class GetIntersectionNode {


    public static void main(String[] args) {


//        listA = [4,1,8,4,5], listB = [5,0,1,8,4,5]


        ListNode listNode1 = new ListNode(4);
        listNode1.add(1);
        listNode1.add(8);
        listNode1.add(4);
        listNode1.add(5);

        ListNode listNode2 = new ListNode(5);
        listNode2.add(0);
        listNode2.add(1);
        listNode2.add(8);
        listNode2.add(4);
        listNode2.add(5);


        GetIntersectionNode node = new GetIntersectionNode();
//        node.getIntersectionNode(listNode1,listNode2);
        System.out.println(node.getIntersectionNode(listNode1, listNode2));


    }


    /****
     *    思路:
     *      1.时间复杂度为O(N+M)
     *      2.空间复杂度为O(N)
     *
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Set<ListNode> visited = new HashSet<ListNode>();

        ListNode temp = headA;

        while (temp != null) {
            visited.add(temp);
            temp = temp.next;
        }

        temp = headB;

        while (temp != null) {
            if (visited.contains(temp)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}

