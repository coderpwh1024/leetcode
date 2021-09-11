package com.coderpwh.leetcode;

public class IsBalanced {

    public static void main(String[] args) {

        IsBalanced isBalanced = new IsBalanced();

        BiTrees biTrees = isBalanced.create();

        TreeNodes root = biTrees.getRoot();


//        isBalanced.isBalanced(root);

        System.out.println(isBalanced.isBalanced(root));


    }


    public BiTrees create() {

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node15 = new TreeNodes(15);

        TreeNodes node20 = new TreeNodes(20, node15, node7);

        TreeNodes node9 = new TreeNodes(9);

        TreeNodes node3 = new TreeNodes(3, node9, node20);

        return new BiTrees(node3);


    }


    /***
     *   思路:
     *      1. 时间复杂度为:O(N)
     *      2.  空间复杂度为O(N)
     *      3.平衡二叉树左右结点高度差小于等1，并且左右结点都要满足这个性质
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNodes root) {
        if (root == null) {
            return true;
        } else {
            return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }


    /***
     *   求二叉树的最大高度
     * @param root
     * @return
     */
    public int height(TreeNodes root) {

        if (root == null) {
            return 0;
        } else {
            return Math.max(height(root.left), height(root.right)) + 1;
        }

    }


}
