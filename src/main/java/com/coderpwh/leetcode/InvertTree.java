package com.coderpwh.leetcode;

public class InvertTree {

    public static void main(String[] args) {

        InvertTree integer = new InvertTree();

        BiTree biTree = integer.createBTree();


        integer.invertTree(biTree.getRoot());


    }


    public BiTree createBTree() {

        TreeNode node7 = new TreeNode(9 + "");
        TreeNode node6 = new TreeNode("6");

        TreeNode node3 = new TreeNode(7 + "", node6, node7);

        TreeNode node5 = new TreeNode("3");
        TreeNode node4 = new TreeNode(1 + "");

        TreeNode node2 = new TreeNode(2 + "", node4, node5);

        TreeNode node1 = new TreeNode(4 + "", node2, node3);


        return new BiTree(node1);
    }


    public TreeNode invertTree(TreeNode node) {


        exchangeNode(node);

        return node;
    }


    /***
     *    思路:
     *       1. 时间复杂度为O(N)
     *       2. 空间复杂度为O(1)
     *       3. 利用递归的方式，对左右结点进行交换
     *
     *
     * @param node
     */
    public void exchangeNode(TreeNode node) {

        if (node != null) {
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            exchangeNode(node.left);
            exchangeNode(node.right);

        }

    }


}
