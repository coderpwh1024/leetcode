package com.coderpwh.leetcode;

/*****
 * 67. 二进制求和
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 *
 *
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 *
 * 提示：
 *
 * 每个字符串仅由字符 '0' 或 '1' 组成。
 * 1 <= a.length, b.length <= 10^4
 * 字符串如果不是 "0" ，就都不含前导零。
 */
public class AddBinary {

    public static void main(String[] args) {
        AddBinary add = new AddBinary();
        add.addBinary("11", "1");
        System.out.println(add.addBinary("1010", "1011"));

    }


    public String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();

        int x = 0;
        int y = 0;
        int pre = 0;
        int sum = 0;

        while (a.length() != b.length()) {
            if (a.length() > b.length()) {
                b = "0" + b;
            } else {
                a = "0" + a;
            }
        }

        for (int i = a.length() - 1; i >= 0; i--) {
            x = a.charAt(i)-'0';
            y = b.charAt(i)-'0';
            x = a.charAt(i);
            y =b.charAt(i);

            sum = x + y + pre;
            if (sum >= 2) {
                pre = 1;
                sb.append(sum - 2);
            } else {
                pre = 0;
                sb.append(sum);
            }

        }

        if (pre == 1) {
            sb.append("1");
        }
        return sb.reverse().toString();
    }


}
