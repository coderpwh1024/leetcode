package com.coderpwh.leetcode;

/**
 * LCR 194. 二叉树的最近公共祖先
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 * <p>
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，
 * 满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 * <p>
 * 例如，给定如下二叉树:  root = [3,5,1,6,2,0,8,null,null,7,4]
 *
 * @author coderpwh
 * @date 2023/10/12 9:57
 */
public class LowestCommonAncestorTwo {

    public static void main(String[] args) {

        LowestCommonAncestorTwo common = new LowestCommonAncestorTwo();

    }


    /***
     * 创建二叉树
     * @return
     */
    public TreeNode createTreeNode() {
        TreeNode node7 = new TreeNode("7");
        TreeNode node4 = new TreeNode("4");

        TreeNode node2 = new TreeNode("2", node7, node4);

        TreeNode node6 = new TreeNode("6");

        TreeNode node5 = new TreeNode("5", node6, node2);

        TreeNode node8 = new TreeNode("8");
        TreeNode node0 = new TreeNode("0");

        TreeNode node1 = new TreeNode("1", node0, node8);

        TreeNode root = new TreeNode("3", node5, node1);

        return root;
    }


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return null;
    }

}
