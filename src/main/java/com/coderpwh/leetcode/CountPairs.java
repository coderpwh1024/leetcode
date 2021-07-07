package com.coderpwh.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountPairs {

    public static void main(String[] args) {


        int deliciousness[] = {1, 3, 5, 7, 9};

        CountPairs count = new CountPairs();
//        count.countPairs(deliciousness);

        count.test(deliciousness);

        System.out.println(count.test(deliciousness));

    }


    /***
     *
     *     思路:
     *       1. 时间复杂度为O(N^2)
     *       2. 空间复杂度为O(N)
     *       3. 利用map遍历，未通过测试用例
     *
     *
     *
     * @param deliciousness
     * @return
     */
    public int countPairs(int[] deliciousness) {


        int count = 0;


        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < deliciousness.length; i++) {

            for (int j = 0; j < deliciousness.length; j++) {

                if (i != j) {
                    Integer sum = deliciousness[i] + deliciousness[j];
                    boolean flag = isPowerOfTwo(sum);
                    if (flag) {
                        if (map.get(j) != null && i != map.get(j)) {
                            count++;
                            map.put(i, j);
                        }
                        if (map.get(j) == null) {
                            count++;
                            map.put(i, j);
                        }

                    }

                }
            }

        }

        for (Integer a : map.keySet()) {
            System.out.println("key:" + a + "  , value:" + map.get(a));
        }


        System.out.println(count);
        return 0;
    }


    /**
     * 判断是否是2的N次幂
     *
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }


    public int test(int[] deliciousness) {

        final int MOD = 1000000007;

        int maxVal = 0;

        for (int val : deliciousness) {
            maxVal = Math.max(maxVal, val);
        }


        int maxSum = maxVal * 2;

        int pairs = 0;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int n = deliciousness.length;

        for (int i = 0; i < n; i++) {
            int val = deliciousness[i];

            for (int sum = 1; sum <= maxSum; sum <<= 1) {
                int count = map.getOrDefault(sum - val, 0);
                pairs = (pairs + count) % MOD;
            }
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        return pairs;
    }


}

