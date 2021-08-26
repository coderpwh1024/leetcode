 package com.coderpwh.leetcode;


public class SortedArrayToBST {

    public static void main(String[] args) {


        int[] nums = {-10, -3, 0, 5, 9};

        SortedArrayToBST bst = new SortedArrayToBST();
        bst.sortedArrayToBST(nums);

    }


    public TreeNodes sortedArrayToBST(int[] nums) {


        TreeNodes root = help(nums, 0, nums.length - 1);

        prePrint(root);

        return root;


    }

    /***
     *    思路:
     *      1. 时间复杂度为O(N)
     *      2. 空间复杂度为O(1)
     *
     *
     * @param nums
     * @param left
     * @param right
     * @return
     */
    public TreeNodes help(int[] nums, int left, int right) {

        if (left > right) {
            return null;
        }

        int mid = (left + right) / 2;

        TreeNodes root = new TreeNodes(nums[mid]);

        root.left = help(nums, left, mid - 1);

        root.right = help(nums, mid + 1, right);

        return root;
    }


    /**
     * 前根方式进行遍历
     *
     * @param root
     */
    public void prePrint(TreeNodes root) {

        if (root != null) {
            System.out.print(root.val + " ");
            prePrint(root.left);
            prePrint(root.right);
        }

    }


}
