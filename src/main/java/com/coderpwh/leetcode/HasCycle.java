package com.coderpwh.leetcode;

import java.util.HashSet;
import java.util.Set;

public class HasCycle {


    public static void main(String[] args) {

        ListNode head = new ListNode();

        head.add(3);
        head.add(2);
        head.add(0);
        head.add(-4);


        HasCycle hasCycle = new HasCycle();
//        hasCycle.hasCycle(head);
        System.out.println(hasCycle.hasCycle(head));

    }


    /***
     *    思路:
     *       1. 时间复杂度为O(N)
     *       2. 空间复杂度为O(N)
     *       3. 利用哈希方式遍历实现
     *
     *
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {

        Set<ListNode> set = new HashSet<>();

        while (head != null) {

            if (!set.add(head)) {
                return true;
            }
            head = head.next;
        }

        return false;
    }


}

