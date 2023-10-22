package com.coderpwh.leetcode;


/***
 * 面试题 10.05. 稀疏数组搜索
 * 提示
 * 简单
 * 84
 * 相关企业
 * 稀疏数组搜索。有个排好序的字符串数组，其中散布着一些空字符串，编写一种方法，找出给定字符串的位置。
 *
 * 示例1:
 *
 *  输入: words = ["at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""], s = "ta"
 *  输出：-1
 *  说明: 不存在返回-1。
 * 示例2:
 *
 *  输入：words = ["at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""], s = "ball"
 *  输出：4
 * 提示:
 *
 * words的长度在[1, 1000000]之间
 */
public class FindString {
    public static void main(String[] args) {

        String arr[] = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
        String str = "ball";


        FindString findString = new FindString();

         int count = findString.findString(arr,str);
        System.out.println(count);

    }

    public int findString(String[] words, String s) {


        if(words==null||words.length<=0){
            return  -1;
        }

        for(int i=0;i<words.length;i++){
            if(s.equals(words[i])){
                return  i;
            }
        }
        return -1;
    }
}
