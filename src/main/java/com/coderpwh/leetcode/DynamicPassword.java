package com.coderpwh.leetcode;

/**
 * LCR 182. 动态口令
 * <p>
 * 某公司门禁密码使用动态口令技术。初始密码为字符串 password，密码更新均遵循以下步骤：
 * <p>
 * 设定一个正整数目标值 target
 * 将 password 前 target 个字符按原顺序移动至字符串末尾
 * 请返回更新后的密码字符串。
 * <p>
 * 示例 1：
 * <p>
 * 输入: password = "s3cur1tyC0d3", target = 4
 * 输出: "r1tyC0d3s3cu"
 * 示例 2：
 * <p>
 * 输入: password = "lrloseumgh", target = 6
 * 输出: "umghlrlose"
 *
 * @author coderpwh
 * @date 2023/10/11 16:29
 */
public class DynamicPassword {


    public static void main(String[] args) {

        /*String str = "s3cur1tyC0d3";
        int target = 4;*/

        String str = "lrloseumgh";
        int target = 6;

        DynamicPassword password = new DynamicPassword();
        String result = password.dynamicPassword(str, target);
        System.out.println(result);

    }


    public String dynamicPassword(String password, int target) {
        StringBuilder builder = new StringBuilder();
        String start = password.substring(0, target);
        String end = password.substring(target, password.length());
        builder.append(end).append(start);

        return builder.toString();
    }

}
