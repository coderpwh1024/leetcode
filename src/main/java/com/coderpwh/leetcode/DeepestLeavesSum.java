package com.coderpwh.leetcode;

import java.util.*;

/**
 * 1302
 *
 * @author coderpwh
 */
public class DeepestLeavesSum {

    public static void main(String[] args) {

        DeepestLeavesSum sum = new DeepestLeavesSum();

        BiTrees biTrees = sum.create();

        TreeNodes root = biTrees.getRoot();

        sum.pre(root);

        System.out.println();
        Integer count = sum.deepestLeavesSum(root);

        System.out.println("结果为:" + count);


    }


    public BiTrees create() {

        TreeNodes node7 = new TreeNodes(7);
        TreeNodes node4 = new TreeNodes(4, node7, null);

        TreeNodes node5 = new TreeNodes(5);

        TreeNodes node2 = new TreeNodes(2, node4, node5);

        TreeNodes node8 = new TreeNodes(8);

        TreeNodes node6 = new TreeNodes(6, null, node8);

        TreeNodes node3 = new TreeNodes(3, null, node6);

        TreeNodes root = new TreeNodes(1, node2, node3);

        return new BiTrees(root);
    }


    public int deepestLeavesSum(TreeNodes root) {

        int sum = 0;

        if (root == null) {
            return sum;
        }

        Deque<TreeNodes> deque = new LinkedList<>();
        deque.offer(root);

        List<List<Integer>> date = new ArrayList<>();

        while (!deque.isEmpty()) {

            int size = deque.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNodes node = deque.poll();
                if (node.left != null) {
                    deque.offer(node.left);
                }
                if (node.right != null) {
                    deque.offer(node.right);
                }
                list.add(node.val);
            }
            date.add(list);
        }

        if (!Objects.isNull(date)) {
            for (Integer count : date.get(date.size() - 1)) {
                sum += count;
            }
        }


        return sum;
    }


    public void pre(TreeNodes root) {
        if (root != null) {
            System.out.print(root.val);
            System.out.print(" ");
            pre(root.left);
            pre(root.right);
        }
    }


}
