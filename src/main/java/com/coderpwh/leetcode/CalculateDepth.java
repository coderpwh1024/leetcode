package com.coderpwh.leetcode;

/**
 * LCR 175. 计算二叉树的深度
 *
 * @author coderpwh
 * @date 2023/10/9 10:00
 */
public class CalculateDepth {

    public static void main(String[] args) {

        CalculateDepth depth = new CalculateDepth();

        TreeNode root = depth.createNode();

    }


    /***
     * 创建二叉树
     * @return
     */
    public TreeNode createNode() {

        TreeNode nodeLeft4 = new TreeNode("4");

        TreeNode nodeLeft3 = new TreeNode("3", nodeLeft4, null);

        TreeNode nodeLeft2 = new TreeNode("2", nodeLeft3, null);


        TreeNode nodeRight4 = new TreeNode("4");
        TreeNode nodeRight5 = new TreeNode("5", null, nodeRight4);

        TreeNode nodeRight2 = new TreeNode("2", null, nodeRight5);

        TreeNode root = new TreeNode("1", nodeLeft2, nodeRight2);

        return root;
    }


    /***
     * 计算二叉树深度
     * @param root
     * @return
     */
    public int calculateDepth(TreeNode root) {

        return -1;
    }


}
