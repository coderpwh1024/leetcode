package com.coderpwh.leetcode;

import java.util.HashSet;
import java.util.Set;

/***
 *  141 环形链表
 *
 *给定一个链表，判断链表中是否有环。
 *
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 *
 * 如果链表中存在环，则返回 true 。 否则，返回 false 。
 *
 *  
 *
 * 进阶：
 *
 * 你能用 O(1)（即，常量）内存解决此问题吗？
 *
 *  
 *
 * 示例 1：
 *
 *
 *
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 * 示例 2：
 *
 *
 *
 * 输入：head = [1,2], pos = 0
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第一个节点。
 * 示例 3：
 *
 *
 *
 * 输入：head = [1], pos = -1
 * 输出：false
 * 解释：链表中没有环。
 *
 *
 */
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


    /***
     *
     *   思路:
     *      1. 时间复杂度为O(N)
     *      2. 空间复杂度为O(1)
     *      3. 用快慢指针方式实现
     *
     *
     *
     * @param head
     * @return
     */
    public boolean test(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {

            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }


}
