package com.coderpwh.leetcode;


/**
 * @author pengwenhao
 * @date 2022/1/7
 */
public class StringMaxDepth {


    public static void main(String[] args) {

        // 3
        String str = "(1)+((2))+(((3)))";

        StringMaxDepth stringMaxDepth = new StringMaxDepth();
        Integer count = stringMaxDepth.maxDepth(str);

        System.out.println(count);

    }

    public int maxDepth(String s) {

        int ans = 0;
        int size = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                ++size;
                ans = Math.max(ans, size);
            } else if (ch == ')') {
                --size;
            }
        }

        return ans;
    }

}
