package com.coderpwh.leetcode;

import java.util.*;


/***
 *113. 路径总和 II
 *
 */
public class PathSum {

    public static void main(String[] args) {


        PathSum pathSum = new PathSum();

        // 创建二叉树
        BiTrees biTrees = pathSum.create();

        // 获取根结点
        TreeNodes root = biTrees.getRoot();

        int targetSum = 22;

        pathSum.pathSum(root, targetSum);

        System.out.println();

        pathSum.pre(root);


    }


    /***
     *  构建二叉树
     * @return
     */
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

    // 主要实现
    public List<List<Integer>> pathSum(TreeNodes root, int targetSum) {

        List<List<Integer>> list = new ArrayList<>();

        Deque<Integer> queue = new LinkedList<>();

        dfs(root, targetSum, list, queue);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        return list;
    }


    /***
     *    思路:
     *      1. 时间复杂度为O(N^2)
     *      2. 空间复杂度为O(N)
     *      3. 利用队列与递归方式实现
     *
     * @param root
     * @param targetSum
     * @param list
     * @param queue
     */
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


    /***
     *  前序遍历
     *
     * @param root
     */
    public void pre(TreeNodes root) {
        if (root != null) {
            System.out.print(root.val);
            System.out.print("  ");
            pre(root.left);
            pre(root.right);
        }
    }

}
