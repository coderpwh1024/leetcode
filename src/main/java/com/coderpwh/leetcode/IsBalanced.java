package com.coderpwh.leetcode;


/**
 * 110. 平衡二叉树
 * <p>
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * <p>
 * 本题中，一棵高度平衡二叉树定义为：
 * <p>
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 */
public class IsBalanced {

    public static void main(String[] args) {

        IsBalanced isBalanced = new IsBalanced();

        // 创建二叉树
        BiTrees biTrees = isBalanced.create();

        // 获取二叉树根结点
        TreeNodes root = biTrees.getRoot();


//        isBalanced.isBalanced(root);

        System.out.println(isBalanced.isBalanced(root));


    }


    /***
     * 创建二叉树
     * @return
     */
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
