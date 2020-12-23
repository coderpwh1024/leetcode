package com.coderpwh.leetcode;

import javax.swing.plaf.IconUIResource;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/****
 *
 *  387.字符串中的第一个唯一字符
 *
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 *  
 *
 * 示例：
 *
 * s = "leetcode"
 * 返回 0
 *
 * s = "loveleetcode"
 * 返回 2
 *
 *  
 *
 */
public class FirstUniqChar {

    public static void main(String[] args) {


//        String s = "loveleetcode";

        String s = "leetcode";

//        String s = "eletcode";

        FirstUniqChar first = new FirstUniqChar();

//        System.out.println(first.firstUniqChar(s));

        System.out.println(first.test(s));
        System.out.println(first.test2(s));
    }




     public int  test2(String s){

       Map<Character,Integer> map = new HashMap<>();

       for(int i=0;i<s.length();i++){
           char ch =  s.charAt(i);
           map.put(ch,map.getOrDefault(ch,0)+1);
       }

       for(int i=0;i<s.length();i++){

           if(map.get(s.charAt(i))==1){
               return i;
           }
       }

       return -1;


     }



    /****
     *    思路:
     *      1：结果虽通过，算法效率不够高,不是高效解法
     *      2: 时间复杂度为O(2N)
     *      3：空间复杂度为O(1),单独创建了一个map集合
     *
     *
     * @param s
     * @return
     */
    public int test(String s) {
        LinkedHashMap<Object, Integer> map = new LinkedHashMap<>();
        int count = -1;

        for (int i = 0; i < s.length(); i++) {

            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), -1);
            } else {
                map.put(s.charAt(i), i);
            }
        }

        for (Object obj : map.keySet()) {
            if (map.get(obj) >= 0) {
                return map.get(obj);
            }
        }

        return count;
    }


    /*****
     *     思路:
     *        1：结果严重超时
     *        2: 时间复杂度为O(N^2)
     *        3：空间复杂度为:O(1)  创建了一个字符数组
     *
     *
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    flag = false;
                    continue;
                }
            }
            if (flag) {
                return i;
            }

        }
        return -1;
    }

}
