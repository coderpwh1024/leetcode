package com.coderpwh.leetcode;

public class InsertIntoBST {

    public static void main(String[] args) {

    }


    public TreeNodes insertIntoBST(TreeNodes root, int val) {

        if (root == null) {
            return new TreeNodes(val);
        }

        TreeNodes node = root;

        while (node != null) {

            if (val < node.val) {

                if (node.left == null) {
                    node.left = new TreeNodes(val);
                    break;
                } else {
                    node = node.left;
                }
            } else {

                if (node.right == null) {
                    node.right = new TreeNodes(val);
                    break;
                } else {
                    node = node.right;
                }
            }
        }
        return root;
    }


}
