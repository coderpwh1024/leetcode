package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author coderpwh
 */
public class MaxLevelSum {

    public static void main(String[] args) {

        MaxLevelSum max = new MaxLevelSum();

        BiTrees biTrees = max.create();

        TreeNodes root = biTrees.getRoot();

        int maxNum = max.maxLevelSum(root);

        System.out.println(maxNum);

    }


    public BiTrees create() {

        TreeNodes node8 = new TreeNodes(-8);
        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node77 = new TreeNodes(7, node7, node8);

        TreeNodes node0 = new TreeNodes(0);

        TreeNodes node1 = new TreeNodes(1, node77, node0);

        return new BiTrees(node1);
    }


    public int maxLevelSum(TreeNodes root) {

        Deque<TreeNodes> deque = new LinkedList<>();
        deque.offer(root);

        List<Integer> list = new ArrayList<>();
        while (!deque.isEmpty()) {

            int size = deque.size();
            int sum = 0;

            for (int i = 0; i < size; i++) {

                TreeNodes node = deque.poll();
                sum += node.val;

                if (node.left != null) {
                    deque.offer(node.left);
                }

                if (node.right != null) {
                    deque.offer(node.right);
                }
            }
            list.add(sum);
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }

        return list.indexOf(max) + 1;
    }


}
