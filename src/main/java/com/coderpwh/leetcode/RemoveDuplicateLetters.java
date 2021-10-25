package com.coderpwh.leetcode;

/**
 * 316 除去重复字母
 * <p>
 * 给你一个字符串 s ，请你去除字符串中重复的字母，使得每个字母只出现一次。需保证 返回结果的字典序最小（要求不能打乱其他字符的相对位置）。
 * <p>
 * 注意：该题与 1081 https://leetcode-cn.com/problems/smallest-subsequence-of-distinct-characters 相同
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "bcabc"
 * 输出："abc"
 * 示例 2：
 * <p>
 * 输入：s = "cbacdcbc"
 * 输出："acdb"
 *
 * @author coderpwh
 */
public class RemoveDuplicateLetters {

    public static void main(String[] args) {

        //  abc
        String str = "bcabc";


        RemoveDuplicateLetters remove = new RemoveDuplicateLetters();
        remove.removeDuplicateLetters(str);

//        System.out.println(remove.removeDuplicateLetters(str));

        remove.test(str);


    }

    /****
     *     思路:
     *       1：时间复杂度为O(N) 主要是对长度为s的字符串进行遍历
     *          内循环则是对StringBuild的操作
     *       2. 空间复杂度为O(M) 存储字符个数
     *       3. 先是对 字符串S里面的字符个进行统计
     *       4. StringBuild 用来存储字符
     *       5. 遍历字符S，对当前的字符与栈顶（StringBuilder）元素对比。删除多余的拼接的字符
     *
     *
     *
     *
     * @param s
     * @return
     */
    public String test(String s) {

        boolean vis[] = new boolean[26];

        int[] num = new int[26];


        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!vis[ch - 'a']) {
                while (sb.length() > 0 && sb.charAt(sb.length() - 1) > ch) {
                    if (num[sb.charAt(sb.length() - 1) - 'a'] > 0) {
                        vis[sb.charAt(sb.length() - 1) - 'a'] = false;
                        sb.deleteCharAt(sb.length() - 1);
                    } else {
                        break;
                    }
                }
                vis[ch - 'a'] = true;
                sb.append(ch);

            }
            num[ch - 'a'] -= 1;

        }

        System.out.println(sb.toString());
        return sb.toString();

    }


    public String removeDuplicateLetters(String s) {

        boolean[] vis = new boolean[26];

        int[] num = new int[26];

        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!vis[ch - 'a']) {
                while (sb.length() > 0 && sb.charAt(sb.length() - 1) > ch) {
                    if (num[sb.charAt(sb.length() - 1) - 'a'] > 0) {
                        vis[sb.charAt(sb.length() - 1) - 'a'] = false;
                        sb.deleteCharAt(sb.length() - 1);
                    } else {
                        break;
                    }
                }
                vis[ch - 'a'] = true;
                sb.append(ch);
            }
            num[ch - 'a'] -= 1;
        }

        return sb.toString();
    }


}
