package com.coderpwh.leetcode;

/**
 * @author coderpwh
 * @date 2023/10/8 11:10
 */
public class TreeNodePrint {

    public static void main(String[] args) {

        TreeNodePrint print = new TreeNodePrint();

        // 创建二叉树
        TreeNode root = print.creatNode();

        // 递归前序遍历方式
        print.pre(root);


    }


    /***
     * 创建二叉树
     * @return
     */
    public TreeNode creatNode() {
        TreeNode node1 = new TreeNode("1");
        TreeNode node3 = new TreeNode("3");

        TreeNode node2 = new TreeNode("2", node1, node3);

        TreeNode node7 = new TreeNode("7");

        TreeNode root = new TreeNode("4", node2, node7);

        return root;
    }

    /***
     * 递归方式前序遍历
     * @param root
     */
    public void pre(TreeNode root) {

        if (root != null) {
            System.out.print(root.val + " ");
            pre(root.left);
            pre(root.right);
        }
    }


}
