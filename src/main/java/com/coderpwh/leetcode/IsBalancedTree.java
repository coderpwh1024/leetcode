package com.coderpwh.leetcode;

/**
 * LCR 176. 判断是否为平衡二叉树
 * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
 * 示例 1:
 * <p>
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：true
 * 解释：如下图
 *
 * @author coderpwh
 * @date 2023/10/10 10:12
 */
public class IsBalancedTree {

    public static void main(String[] args) {

        IsBalancedTree tree = new IsBalancedTree();

        // 创建二叉树
        TreeNode root = tree.createNode();

        // 判断是否平衡二叉树
        Boolean flag = tree.isBalanced(root);

        System.out.println(flag);

    }


    /***
     * 创建二叉树
     * @return
     */
    public TreeNode createNode() {
        TreeNode node15 = new TreeNode("15");
        TreeNode node7 = new TreeNode("7");

        TreeNode node20 = new TreeNode("20", node15, node7);
        TreeNode node9 = new TreeNode("9");

        TreeNode root = new TreeNode("3", node9, node20);
        return root;
    }


    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return Math.abs(getMaxDepth(root.left) - getMaxDepth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }




    public int getMaxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(getMaxDepth(root.left), getMaxDepth(root.right)) + 1;
        }
    }


}
