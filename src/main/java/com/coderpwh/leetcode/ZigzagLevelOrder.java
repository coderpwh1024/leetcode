package com.coderpwh.leetcode;

import java.util.*;

public class ZigzagLevelOrder {


    public static void main(String[] args) {

        ZigzagLevelOrder order = new ZigzagLevelOrder();

        BiTrees biTrees = order.create();

        TreeNodes root = biTrees.getRoot();

        order.zigzagLevelOrder(root);

    }


    public BiTrees create() {

        TreeNodes node15 = new TreeNodes(15);

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node20 = new TreeNodes(20, node15, node7);

        TreeNodes node9 = new TreeNodes(9);

        TreeNodes node3 = new TreeNodes(3, node9, node20);

        return new BiTrees(node3);
    }


    public List<List<Integer>> zigzagLevelOrder(TreeNodes root) {


        List<List<Integer>> date = new ArrayList<>();
        if (root != null) {

            Queue<TreeNodes> queue = new LinkedList<>();
            queue.offer(root);
            boolean flag = false;
            while (!queue.isEmpty()) {

                int size = queue.size();
                List<Integer> list = new ArrayList<>();

                for (int i = 0; i < size; i++) {
                    root = queue.poll();

                    if (root.left != null) {
                        queue.offer(root.left);
                    }

                    if (root.right != null) {
                        queue.offer(root.right);
                    }
                    list.add(root.val);
                }
                if (flag) {
                    Collections.reverse(list);
                    flag = false;
                    date.add(list);
                } else {
                    date.add(list);
                    flag = true;
                }
            }
        }


        for (List<Integer> d : date) {
            System.out.println(d);
        }


        return date;
    }

}
