package com.coderpwh.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/****
 *
 *  大餐 是指 恰好包含两道不同餐品 的一餐，其美味程度之和等于 2 的幂。
 *
 * 你可以搭配 任意 两道餐品做一顿大餐。
 *
 * 给你一个整数数组 deliciousness ，其中 deliciousness[i] 是第 i​​​​​​​​​​​​​​ 道餐品的美味程度，返回你可以用数组中的餐品做出的不同 大餐 的数量。结果需要对 109 + 7 取余。
 *
 * 注意，只要餐品下标不同，就可以认为是不同的餐品，即便它们的美味程度相同。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：deliciousness = [1,3,5,7,9]
 * 输出：4
 * 解释：大餐的美味程度组合为 (1,3) 、(1,7) 、(3,5) 和 (7,9) 。
 * 它们各自的美味程度之和分别为 4 、8 、8 和 16 ，都是 2 的幂。
 * 示例 2：
 *
 * 输入：deliciousness = [1,1,1,3,3,3,7]
 * 输出：15
 * 解释：大餐的美味程度组合为 3 种 (1,1) ，9 种 (1,3) ，和 3 种 (1,7) 。
 *
 *
 *
 *
 */
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


    /****
     *
     *   思路:
     *     1. 时间复杂度为O(NlogN)
     *     2. 空间复杂度为O(N)
     *     3.利用哈希表方式解决
     *
     *
     *
     *
     * @param deliciousness
     * @return
     */
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


