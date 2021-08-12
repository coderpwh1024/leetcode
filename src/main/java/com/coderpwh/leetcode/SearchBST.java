 package com.coderpwh.leetcode;

public class SearchBST {

    public static void main(String[] args) {

        SearchBST bst = new SearchBST();


    }


    /***
     *     思路:
     *        1. 时间复杂度为O(N)
     *        2. 空间复杂度为O(1)
     *        3. 递归对左右结点进行遍历实现
     *
     *
     * @param root
     * @param val
     * @return
     */
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
