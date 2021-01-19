package com.coderpwh.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/***
 * 1047. 删除字符串中的所有相邻重复项
 *给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 *
 * 在 S 上反复执行重复项删除操作，直到无法继续删除。
 *
 * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
 *
 *  
 *
 * 示例：
 *
 * 输入："abbaca"
 * 输出："ca"
 * 解释：
 * 例如，在 "abbaca" 中，我们可以删除 "bb" 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。之后我们得到字符串 "aaca"，其中又只有 "aa" 可以执行重复项删除操作，所以最后的字符串为 "ca"。
 *
 * 
 *
 *
 *
 */
public class RemoveDuplicates {

    public static void main(String[] args) {

//        String str = "abbaca";
//        String str = "azxxzy";  // ay

//        String str = "abbbabaaa";
        String str = "aaaaaaaa";

        RemoveDuplicates remove = new RemoveDuplicates();
        remove.removeDuplicates(str);
        System.out.println(remove.removeDuplicates(str));

    }


    /*****
     *     思路:
     *       1：时间复杂度O(N) 主要遍历字符串S的长度
     *       2: 空间复杂度为O(N) 创建StringBuilder来拼接
     *       3: 利用栈的方式来实现
     * @param S
     * @return
     */
    public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();

        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < S.length(); i++) {
            if ((!deque.isEmpty()) && deque.peek().equals(S.charAt(i))) {
                deque.pop();
            } else {
                deque.push(S.charAt(i));
            }
        }

        System.out.println(deque.size());
        while (!deque.isEmpty()) {
            sb.append(deque.pop());
        }
        return sb.reverse().toString();
    }

}


