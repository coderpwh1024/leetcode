package com.coderpwh.leetcode;

public class IsBalanced {

    public static void main(String[] args) {

    }








    public boolean isBalanced(TreeNodes root) {

        if (root == null) {
            return true;
        } else {

            return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }

    public int height(TreeNodes root) {

        if (root == null) {
            return 0;
        } else {
            return Math.max(height(root.left), height(root.right)) + 1;
        }

    }


}
