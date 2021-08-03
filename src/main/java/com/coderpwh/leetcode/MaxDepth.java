package com.coderpwh.leetcode;

/****
 *
 * 104. 二叉树的最大深度
 *
 *给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */
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


    /***
     *     思路:
     *       1.时间复杂度为O(N)
     *       2.空间复杂度为O(1)
     *       3.主要利用递归方式，最大深度，分别求出左右树深度并比较，然后加上根节点即可
     *
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {

        if (root != null) {

            int lDepth = maxDepth(root.left);

            int rDepth = maxDepth(root.right);

            return 1 + (lDepth > rDepth ? lDepth : rDepth);
        }

        return 0;

    }


}
