package com.coderpwh.leetcode;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

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
