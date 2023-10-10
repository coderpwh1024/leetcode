package com.coderpwh.leetcode;

import java.util.HashMap;

/**
 * LCR 178. 训练计划 VI
 * 教学过程中，教练示范一次，学员跟做三次。该过程被混乱剪辑后，记录于数组 actions，
 * 其中 actions[i] 表示做出该动作的人员编号。请返回教练的编号。
 * 示例 1：
 * <p>
 * 输入：actions = [5, 7, 5, 5]
 * 输出：7
 * 示例 2：
 * <p>
 * 输入：actions = [12, 1, 6, 12, 6, 12, 6]
 * 输出：1
 *
 * @author coderpwh
 * @date 2023/10/10 10:38
 */

public class TrainingPlanFour {

    public static void main(String[] args) {

//        int actions[] = {12, 1, 6, 12, 6, 12, 6};

        int actions[] = {5, 7, 5, 5};

        TrainingPlanFour plan = new TrainingPlanFour();
        Integer result = plan.trainingPlan(actions);
        System.out.println(result);
    }


    public int trainingPlan(int[] actions) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < actions.length; i++) {
            if (map.containsKey(actions[i])) {
                Integer count = map.get(actions[i]) + 1;
                map.put(actions[i], count);
            } else {
                map.put(actions[i], 1);
            }
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) <= 1) {
                return key;
            }
        }
        return -1;
    }

}
