package com.coderpwh.leetcode;


/*****
 *
 *  692. 前K个高频单词
 *
 * 给一非空的单词列表，返回前 k 个出现次数最多的单词。
 *
 * 返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。
 *
 * 示例 1：
 *
 * 输入: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
 * 输出: ["i", "love"]
 * 解析: "i" 和 "love" 为出现次数最多的两个单词，均为2次。
 *     注意，按字母顺序 "i" 在 "love" 之前。
 *  
 *
 * 示例 2：
 *
 * 输入: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
 * 输出: ["the", "is", "sunny", "day"]
 * 解析: "the", "is", "sunny" 和 "day" 是出现次数最多的四个单词，
 *     出现次数依次为 4, 3, 2 和 1 次。
 *
 *
 */

import java.util.*;

public class TopKFrequent {

    public static void main(String[] args) {


//        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};

        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};

        int k = 4;

        TopKFrequent topKFrequent = new TopKFrequent();
//        topKFrequent.topKFrequent(words, 2);
        List<String> list = topKFrequent.test(words, k);

        for (String str : list) {
            System.out.println(str);
        }


    }


    public List<String> topKFrequent(String[] words, int k) {

        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                map.put(words[i], map.get(words[i]) + 1);
            } else {
                map.put(words[i], 1);
            }
        }


        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));
        for (String str : result.keySet()) {
            System.out.println(str + " " + map.get(str));
            if (result.get(str) >= k) {
                list.add(str);
            }
        }

//        Collections.sort(list, (a, z) -> a.compareTo(z));

        for (String str : list) {
            System.out.println(str);
        }

        return list;
    }


    /***
     *    思路:
     *       1. 时间复杂度为O(l*n+l*mlogm)
     *       2. 空间复杂度为O(l*m)
     *       3。 利用哈希排序实现
     *
     * @param words
     * @param k
     * @return
     */
    public List<String> test(String[] words, int k) {

        Map<String, Integer> cnt = new HashMap<>();

        for (String word : words) {
            cnt.put(word, cnt.getOrDefault(word, 0) + 1);
        }

        List<String> rec = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : cnt.entrySet()) {
            rec.add(entry.getKey());
        }

        Collections.sort(rec, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return cnt.get(o1).equals(cnt.get(o2)) ? o1.compareTo(o2) : cnt.get(o2) - cnt.get(o1);
            }
        });

        return rec.subList(0, k);
    }


}

