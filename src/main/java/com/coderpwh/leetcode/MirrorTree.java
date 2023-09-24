package com.coderpwh.leetcode;


/***
 * LCR 144. 翻转二叉树
 *
 *给定一棵二叉树的根节点 root，请左右翻转这棵二叉树，并返回其根节点。
 *
 * 输入：root = [5,7,9,8,3,2,4]
 * 输出：[5,9,7,4,2,3,8]
 */
public class MirrorTree {

    public static void main(String[] args) {

        MirrorTree tree = new MirrorTree();


        // 创建二叉树
        TreeNode node = tree.createTreeNode();

        // 遍历
        tree.pre(node);

        System.out.println();
        System.out.println("----------------------");
        TreeNode head = tree.mirrorTree(node);

        // 打印
        tree.pre(head);

    }


    /**
     * 前序遍历法
     *
     * @param node
     */
    public void pre(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            pre(node.left);
            pre(node.right);
        }

    }


    /***
     * 创建二叉树
     * @return
     */
    public TreeNode createTreeNode() {

        TreeNode node3 = new TreeNode("3");
        TreeNode node8 = new TreeNode("8");

        TreeNode node7 = new TreeNode("7", node8, node3);

        TreeNode node4 = new TreeNode("4");
        TreeNode node2 = new TreeNode("2");
        TreeNode node9 = new TreeNode("9", node2, node4);

        TreeNode node = new TreeNode("5", node7, node9);
        return node;
    }


    /***
     * 翻转二叉树
     * @param root
     * @return
     */
    public TreeNode mirrorTree(TreeNode root) {

        if (root != null) {
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;
            mirrorTree(root.left);
            mirrorTree(root.right);

        }
        return root;
    }


}
