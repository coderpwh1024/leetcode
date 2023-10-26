package com.coderpwh.leetcode;

/**
 * 151. 反转字符串中的单词
 * <p>
 * 给你一个字符串 s ，请你反转字符串中 单词 的顺序。
 * <p>
 * 单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
 * <p>
 * 返回 单词 顺序颠倒且 单词 之间用单个空格连接的结果字符串。
 * <p>
 * 注意：输入字符串 s中可能会存在前导空格、尾随空格或者单词间的多个空格。返回的结果字符串中，单词间应当仅用单个空格分隔，且不包含任何额外的空格。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "the sky is blue"
 * 输出："blue is sky the"
 * 示例 2：
 * <p>
 * 输入：s = "  hello world  "
 * 输出："world hello"
 * 解释：反转后的字符串中不能存在前导空格和尾随空格。
 * 示例 3：
 * <p>
 * 输入：s = "a good   example"
 * 输出："example good a"
 * 解释：如果两个单词间有多余的空格，反转后的字符串需要将单词间的空格减少到仅有一个。
 *
 * @author coderpwh
 * @date 2023/10/26 15:54
 */
public class ReverseWords {

    public static void main(String[] args) {

        String str = "a good   example";

        ReverseWords reverseWords = new ReverseWords();
        String result = reverseWords.reverseWords(str);
        System.out.println(result);
    }


    /***
     * 1. 时间复杂度为O(N)
     * 2. 空间复杂度为O(1)
     *
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        if (s == null || s.length() <= 0) {
            return null;
        }

        StringBuilder builder = new StringBuilder();
        s = s.trim();
        String str[] = s.split("\\s+");
        for (int j = str.length - 1; j >= 0; j--) {
            if (j != 0) {
                builder.append(str[j]).append(" ");
            } else {
                builder.append(str[j]);
            }
        }

        return builder.toString();
    }
}
