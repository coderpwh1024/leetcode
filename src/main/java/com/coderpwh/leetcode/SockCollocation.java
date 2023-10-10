package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * LCR 177. 撞色搭配
 * <p>
 * 整数数组 sockets 记录了一个袜子礼盒的颜色分布情况，其中 sockets[i] 表示该袜子的颜色编号。
 * 礼盒中除了一款撞色搭配的袜子，每种颜色的袜子均有两只。
 * 请设计一个程序，在时间复杂度 O(n)，
 * 空间复杂度O(1) 内找到这双撞色搭配袜子的两个颜色编号。
 * <p>
 * 示例 1：
 * <p>
 * 输入：sockets = [4, 5, 2, 4, 6, 6]
 * 输出：[2,5] 或 [5,2]
 * 示例 2：
 * <p>
 * 输入：sockets = [1, 2, 4, 1, 4, 3, 12, 3]
 * 输出：[2,12] 或 [12,2]
 *
 * @author coderpwh
 * @date 2023/10/10 14:43
 */
public class SockCollocation {

    public static void main(String[] args) {

//        int[] sockets = {4, 5, 2, 4, 6, 6};

        int[] sockets = {1, 2, 4, 1, 4, 3, 12, 3};

        SockCollocation ation = new SockCollocation();
        int[] arr = ation.sockCollocation(sockets);

        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    }

    public int[] sockCollocation(int[] sockets) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < sockets.length; i++) {
            if (map.containsKey(sockets[i])) {
                Integer count = map.get(sockets[i]) + 1;
                map.put(sockets[i], count);
            } else {
                map.put(sockets[i], 1);
            }
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) <= 1) {
                list.add(key);
            }
        }

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }


}
