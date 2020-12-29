package com.coderpwh.leetcode;

/**
 * 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: 5
 * 输出: 2
 * 解释: 5 的二进制表示为 101（没有前导零位），其补数为 010。所以你需要输出 2 。
 * 示例 2:
 * <p>
 * 输入: 1
 * 输出: 0
 * 解释: 1 的二进制表示为 1（没有前导零位），其补数为 0。所以你需要输出 0 。
 * <p>
 * 来源：力扣（LeetCode）
 *
 * @author coderpwh
 */
public class FindComplement {

    public static void main(String[] args) {

        FindComplement find = new FindComplement();
//        System.out.println(find.findComplement(5));

        System.out.println(find.test(5));

    }

    public int test(int num) {
        int maxBitNum = 0;
        int tmpNum = num;
        while (tmpNum > 0) {
            maxBitNum += 1;
            tmpNum >>= 1;
        }
        return num ^ ((1 << maxBitNum) - 1);

    }


    public int findComplement(int num) {

        String result = "";

        String str = Integer.toBinaryString(num);

        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i) ^ '1';
        }

        return Integer.parseInt(result, 2);
    }

}
