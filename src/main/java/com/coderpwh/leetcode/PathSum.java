package com.coderpwh.leetcode;


import java.util.*;

public class PathSum {

    public static void main(String[] args) {


        PathSum pathSum = new PathSum();

        BiTrees biTrees = pathSum.create();

        TreeNodes root = biTrees.getRoot();

        int targetSum = 22;

        pathSum.pathSum(root, targetSum);

        System.out.println();

        pathSum.pre(root);


    }


    public BiTrees create() {

        TreeNodes node2 = new TreeNodes(2);

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node11 = new TreeNodes(11, node7, node2);

        TreeNodes node4 = new TreeNodes(4, node11, null);


        TreeNodes node1 = new TreeNodes(1);

        TreeNodes node55 = new TreeNodes(5);

        TreeNodes node44 = new TreeNodes(4, node55, node1);

        TreeNodes nodes3 = new TreeNodes(3);

        TreeNodes node8 = new TreeNodes(8, nodes3, node44);

        TreeNodes root = new TreeNodes(5, node4, node8);

        return new BiTrees(root);

    }

    public List<List<Integer>> pathSum(TreeNodes root, int targetSum) {

        List<List<Integer>> list = new ArrayList<>();

        Deque<Integer> queue = new LinkedList<>();

        dfs(root, targetSum, list, queue);

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }


        return list;
    }

    public void dfs(TreeNodes root, int targetSum, List<List<Integer>> list, Deque<Integer> queue) {

        if (root == null) {
            return;
        }

        queue.offer(root.val);

        targetSum -= root.val;


        if (root.left == null && root.right == null && targetSum == 0) {
            list.add(new LinkedList<>(queue));
        }


        dfs(root.left, targetSum, list, queue);
        dfs(root.right, targetSum, list, queue);
        queue.pollLast();


    }


    public void pre(TreeNodes root) {

        if (root != null) {
            System.out.print(root.val);
            System.out.print("  ");
            pre(root.left);
            pre(root.right);
        }
    }

}
