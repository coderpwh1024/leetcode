package com.coderpwh.leetcode;


/***
 * 剑指 Offer 05. 替换空格
 *请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 *
 */
public class ReplaceSpace {

    public static void main(String[] args) {

        String s ="We are happy.";

        ReplaceSpace space = new ReplaceSpace();
         String result = space.replaceSpace(s);
        System.out.println(result);

    }

    public String replaceSpace(String s) {
        if(s==null||s.length()<=0){
            return  s;
        }
       return    s.replace(" ","%20");
    }

}
