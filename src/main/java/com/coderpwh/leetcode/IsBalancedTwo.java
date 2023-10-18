package com.coderpwh.leetcode;

import sun.reflect.generics.tree.Tree;

/**
 * 面试题 04.04. 检查平衡性
 * <p>
 * 实现一个函数，检查二叉树是否平衡。在这个问题中，平衡树的定义如下：任意一个节点，其两棵子树的高度差不超过 1。
 * <p>
 * <p>
 * 示例 1:
 * 给定二叉树 [3,9,20,null,null,15,7]
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回 true 。
 * 示例 2:
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 * 1
 * / \
 * 2   2
 * / \
 * 3   3
 * / \
 * 4   4
 * 返回 false 。
 *
 * @author coderpwh
 * @date 2023/10/18 9:55
 */
public class IsBalancedTwo {

    public static void main(String[] args) {

        IsBalancedTwo balanced = new IsBalancedTwo();

        // 创建二叉树
        TreeNode node = balanced.createNode();

        // 平衡数判断
        Boolean result = balanced.isBalanced(node);
        System.out.println(result);

    }


    /***
     * 创建二叉树
     * @return
     */
    public TreeNode createNode() {

        TreeNode node15 = new TreeNode("15");

        TreeNode node9 = new TreeNode("9", node15, null);

        TreeNode node7 = new TreeNode("7");

        TreeNode node20 = new TreeNode("20", null, node7);

        TreeNode root = new TreeNode("3", node9, node20);

        return root;
    }


    /***
     * 是否是平衡树
     *
     * 1. 时间复杂度为O(N)
     * 2. 空间复杂度为O(1)
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return Math.abs(getMaxDepth(root.left) - getMaxDepth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }


    /***
     * 获取其最大深度
     * @param node
     * @return
     */
    public int getMaxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return Math.max(getMaxDepth(node.left), getMaxDepth(node.right)) + 1;
        }

    }


}
