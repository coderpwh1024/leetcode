package com.coderpwh.leetcode;

public class MaxDepth {


    public static void main(String[] args) {

        MaxDepth maxDepth = new MaxDepth();

        // 创建二叉树
        BiTree biTree = maxDepth.createBTree();

        // 获取根
        TreeNode root = biTree.getRoot();

        int count = maxDepth.maxDepth(root);

        System.out.println("二叉树的最大深度为:" + count);

    }


    /***
     * 创建二叉树
     *
     * @return
     */
    public BiTree createBTree() {
/*
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node3, null);

        TreeNode node1 = new TreeNode(1, null, node2);*/

        TreeNode node7 = new TreeNode(7);
        TreeNode node6 = new TreeNode(6);

        TreeNode node3 = new TreeNode(3, node6, node7);

        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);

        TreeNode node2 = new TreeNode(2, node4, node5);

        TreeNode node1 = new TreeNode(1, node2, node3);


        return new BiTree(node1);

    }


    public int maxDepth(TreeNode root) {

        if (root != null) {

            int lDepth = maxDepth(root.left);

            int rDepth = maxDepth(root.right);

            return 1 + (lDepth > rDepth ? lDepth : rDepth);
        }

        return 0;

    }


}
