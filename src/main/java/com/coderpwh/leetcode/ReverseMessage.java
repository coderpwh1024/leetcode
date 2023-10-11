package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * LCR 181. 字符串中的单词反转
 * <p>
 * 你在与一位习惯从右往左阅读的朋友发消息，他发出的文字顺序都与正常相反但单词内容正确，
 * 为了和他顺利交流你决定写一个转换程序，把他所发的消息 message 转换为正常语序。
 * <p>
 * 注意：输入字符串 message 中可能会存在前导空格、尾随空格或者单词间的多个空格。
 * 返回的结果字符串中，单词间应当仅用单个空格分隔，且不包含任何额外的空格。
 * 示例 1：
 * <p>
 * 输入: message = "the sky is blue"
 * 输出: "blue is sky the"
 * 示例 2：
 * <p>
 * 输入: message = "  hello world!  "
 * 输出: "world! hello"
 * 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 示例 3：
 * <p>
 * 输入: message = "a good   example"
 * 输出: "example good a"
 * 解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 *
 * @author coderpwh
 * @date 2023/10/11 15:52
 */
public class ReverseMessage {

    public static void main(String[] args) {

        String message = " hello world! ";

//        String message = "a good   example";

//        String message = "the sky is blue";

        ReverseMessage reverse = new ReverseMessage();
        String result = reverse.reverseMessage(message);

        System.out.println(result);

    }

    public String reverseMessage(String message) {
        StringBuilder builder = new StringBuilder();

        if (message != null && message != "") {
            List<String> list = new ArrayList<>();
            message = message.trim();
            String[] arr = message.split("\\s+");
            for (String str : arr) {
                list.add(str);
            }
            for (int j = list.size() - 1; j >= 0; j--) {
                if (j == 0) {
                    builder.append(list.get(j));
                } else {
                    builder.append(list.get(j)).append(" ");
                }
            }
        }
        return builder.toString();
    }

}
