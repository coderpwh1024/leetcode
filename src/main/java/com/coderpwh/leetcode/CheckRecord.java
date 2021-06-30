package com.coderpwh.leetcode;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/****
 *
 *给定一个字符串来代表一个学生的出勤记录，这个记录仅包含以下三个字符：
 *
 * 'A' : Absent，缺勤
 * 'L' : Late，迟到
 * 'P' : Present，到场
 * 如果一个学生的出勤记录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。
 *
 * 你需要根据这个学生的出勤记录判断他是否会被奖赏。
 *
 * 示例 1:
 *
 * 输入: "PPALLP"
 * 输出: True
 * 示例 2:
 *
 * 输入: "PPALLL"
 * 输出: False

 */

public class CheckRecord {

    public static void main(String[] args) {


//        String str = "PPALLP";

//        String str = "PPALLL";

        String str = "LLPPPLL";

        CheckRecord check = new CheckRecord();
        check.checkRecord(str);

//        System.out.println(check.test(str));

    }


    /***
     *  A - 1个
     *
     *  LL - 2个
     *
     *
     * @param s
     * @return
     */
    public boolean checkRecord(String s) {


        Deque deque = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'A') {
                count++;
            }
            deque.push(s.charAt(i));
        }


        int sum = 1;
        while (!deque.isEmpty()) {

            char a = (char) deque.pop();

            if (deque.peek() != null && deque.peek().equals(a) && a == 'L') {
                sum++;
            }

        }

        System.out.println(count);
        System.out.println(sum);

        System.out.println(count <= 1 && sum <= 2);

        return count <= 1 && sum <= 2;
    }


    /***
     *    思路:
     *      1. 时间复杂度为O(N),
     *      2.  空间复杂度为O(1)
     *
     *
     * @param s
     * @return
     */
    public boolean test(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'A') {
                count++;
            }
        }

        return count <= 1 && s.indexOf("LLL") < 0;

    }


}
