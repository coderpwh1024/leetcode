package com.coderpwh.leetcode;

public class SearchBST {

    public static void main(String[] args) {

        SearchBST bst = new SearchBST();


    }


    public TreeNode searchBST(TreeNode root, int val) {


        if (root == null) {
            return root;
        }

        if (root.val.equals(val)) {
            return root;
        } else {
            TreeNode leftNode = searchBST(root.left, val);

            return leftNode == null ? searchBST(root.right, val) : leftNode;
        }
    }


}
