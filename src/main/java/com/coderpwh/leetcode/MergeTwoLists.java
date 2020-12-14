package com.coderpwh.leetcode;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * @author coderpwh
 */
public class MergeTwoLists {

    public static void main(String[] args) throws Exception {


        ListNode  node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);

        MergeTwoLists m = new MergeTwoLists();
        ListNode list =  m.mergeTwoLists(node1,node2);

        while (list!=null){
            System.out.print(list.val+" ");
            list=list.next;
        }
    }



    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }


        prev.next = l1 == null ? l2 : l1;

        return prehead.next;


    }


}
