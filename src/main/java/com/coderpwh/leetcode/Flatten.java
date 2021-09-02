package com.coderpwh.leetcode;

public class Flatten {

    public static void main(String[] args) {

        Flatten flatten = new Flatten();

        TreeNodes root = flatten.createTree();


        flatten.flatten(root);

    }


    /***
     *  创建二叉树
     * @return
     */
    public TreeNodes createTree() {

        TreeNodes node3 = new TreeNodes(3);
        TreeNodes node4 = new TreeNodes(4);

        TreeNodes node2 = new TreeNodes(2, node3, node4);


        TreeNodes node6 = new TreeNodes(6);

        TreeNodes node5 = new TreeNodes(5, null, node6);

        TreeNodes node1 = new TreeNodes(1, node2, node5);


        return node1;
    }


    public void flatten(TreeNodes root) {

    }


}
