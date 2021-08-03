package com.coderpwh.leetcode;

public class MaxDepth {


    public static void main(String[] args) {

        MaxDepth maxDepth = new MaxDepth();


    }


    public int maxDepth(TreeNode root) {

        if (root != null) {

            int lDepth = maxDepth(root.left);

            int rDepth = maxDepth(root.right);

            return 1 + (lDepth > rDepth ? lDepth : rDepth);
        }

        return 0;

    }


}
