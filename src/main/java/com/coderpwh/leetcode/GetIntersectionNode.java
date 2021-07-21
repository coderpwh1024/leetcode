package com.coderpwh.leetcode;

import java.util.HashSet;
import java.util.Set;

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

