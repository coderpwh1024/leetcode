package com.coderpwh.leetcode;

public class RemoveElements {

    public static void main(String[] args) {


        ListNode head = new ListNode();
        int val = 6;


        RemoveElements remove = new RemoveElements();
        remove.removeElements(head, val);

    }


    public ListNode removeElements(ListNode head, int val) {

        ListNode headNode = new ListNode(0);

        headNode.next=head;

        ListNode temp =headNode;

        while (temp.next!=null){

            if(temp.next.val==val){
             temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }

        return  headNode.next;
    }


}
