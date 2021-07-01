package com.coderpwh.leetcode;


import java.util.*;

/**
 * 49. 字母异位词分组
 * <p>
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * <p>
 * 示例:
 * <p>
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出:
 * [
 * ["ate","eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 * 说明：
 * <p>
 * 所有输入均为小写字母。
 * 不考虑答案输出的顺序。
 *
 * @author coderpwh
 */
public class GroupAnagrams {


    public static void main(String[] args) {

        String str[] = {"eat", "tea", "tan", "ate", "nat", "bat"};

//        String str[] = {"", ""};

        GroupAnagrams group = new GroupAnagrams();
//        group.groupAnagrams(str);

//        System.out.println(group.strFlag("eat", "ate"));

        System.out.println(group.test(str));

    }


    /***
     *    思路:
     *       1：时间复杂度为O(nklogk) ,k 为数组长度
     *         排序时间为klogk,遍历为n
     *      2: 空间复杂度为O(1) 构建了map集合
     *
     *
     *
     *
     * @param strs
     * @return
     */
    public List<List<String>> test(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }


    /****
     *    暴力求解暂无通过
     *
     *
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagrams(String[] strs) {


        List<List<String>> list = new ArrayList<>();

        int i = 0;

        while (i < strs.length) {

            if (list.size() > 0 && list != null) {
                boolean flag = false;
                for (int m = 0; m < list.size(); m++) {
                    flag = list.get(m).contains(strs[i]);
                    if (flag) {
                        break;
                    }
                }
                if (flag) {
                    i++;
                    continue;
                }
            }

            List<String> date = new ArrayList<>();
            date.add(strs[i]);
            for (int j = 0; j < strs.length; j++) {
                if (i != j) {
                    boolean flag = strFlag(strs[i], strs[j]);
                    if (flag) {
                        date.add(strs[j]);
                    }
                }
            }
            i++;
            list.add(date);
        }


        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }


        return list;

    }

    public boolean strFlag(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        boolean flag = false;
        for (int i = 0; i < str1.length(); i++) {
            flag = str2.contains(str1.charAt(i) + "");
            if (!flag) {
                return false;
            }
        }
        if (flag) {
            return true;
        }
        return false;

    }


}
