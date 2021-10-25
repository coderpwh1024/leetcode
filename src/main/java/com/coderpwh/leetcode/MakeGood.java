package com.coderpwh.leetcode;

import java.util.Deque;
import java.util.LinkedList;


/*****
 *   1544 整理字符串
 *
 *  给你一个由大小写英文字母组成的字符串 s 。
 *
 * 一个整理好的字符串中，两个相邻字符 s[i] 和 s[i+1]，其中 0<= i <= s.length-2 ，要满足如下条件:
 *
 * 若 s[i] 是小写字符，则 s[i+1] 不可以是相同的大写字符。
 * 若 s[i] 是大写字符，则 s[i+1] 不可以是相同的小写字符。
 * 请你将字符串整理好，每次你都可以从字符串中选出满足上述条件的 两个相邻 字符并删除，直到字符串整理好为止。
 *
 * 请返回整理好的 字符串 。题目保证在给出的约束条件下，测试样例对应的答案是唯一的。
 *
 * 注意：空字符串也属于整理好的字符串，尽管其中没有任何字符。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "leEeetcode"
 * 输出："leetcode"
 * 解释：无论你第一次选的是 i = 1 还是 i = 2，都会使 "leEeetcode" 缩减为 "leetcode" 。
 * 示例 2：
 *
 * 输入：s = "abBAcC"
 * 输出：""
 * 解释：存在多种不同情况，但所有的情况都会导致相同的结果。例如：
 * "abBAcC" --> "aAcC" --> "cC" --> ""
 * "abBAcC" --> "abBA" --> "aA" --> ""
 * 示例 3：
 *
 * 输入：s = "s"
 * 输出："s"
 *
 */

public class MakeGood {

    public static void main(String[] args) {

//        String str = "leEeetcode";

//        String str = "abBAcC";
        String str = "jeSsEj";

        MakeGood makeGood = new MakeGood();
//        makeGood.makeGood(str);
        makeGood.test(str);

    }


    /****
     *      思路:
     *        1. 时间复杂度为O(N)
     *        2. 空间复杂度为O(N)
     *        3. 新建临时变量 index 来统计StringBuilder里面拼接字符的位置
     *        4. 不满足的条件则删除该字符的位置等，满足条件的则拼接起来
     *
     *
     * @param s
     * @return
     */
    public String test(String s) {
        StringBuilder sb = new StringBuilder();

        int index = -1;

        int length = s.length();

        for (int i = 0; i < length; i++) {

            char ch = s.charAt(i);
            if (sb.length() > 0 && Character.toLowerCase(sb.charAt(index)) == Character.toLowerCase(ch) && ch != sb.charAt(index)) {
                sb.deleteCharAt(index);
                index--;
            } else {
                sb.append(ch);
                index++;
            }

        }
        return sb.toString();
    }


    /****
     *    思路:
     *      1:时间复杂度为O(N^2)
     *      2. 空间复杂度为O(N)
     *      3. 利用栈实现未通过测试用例,未考虑到过滤出来的字符串StringBuild 里面的字符
     *
     * @param s
     * @return
     */
    public String makeGood(String s) {

        if (s.length() <= 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            deque.push(s.charAt(i));
        }

        while (!deque.isEmpty()) {

            Character ch = deque.pop();

            if (deque.peek() != null) {
                if (ch.equals(Character.toUpperCase(deque.peek())) || deque.peek().equals(Character.toUpperCase(ch))) {
                    deque.pop();
                } else {
                    sb.append(ch);
                }
            } else if (deque.peek() == null) {

                char c = sb.charAt(sb.length() - 1);
                if ((Character.toUpperCase(c) == ch) || (Character.toUpperCase(ch) == c)) {
                    sb.replace(sb.length() - 1, sb.length(), "");
                } else {
                    sb.append(ch);
                }
            }


        }
        sb.reverse();
        System.out.println(sb);
        return sb.toString();


    }


}
