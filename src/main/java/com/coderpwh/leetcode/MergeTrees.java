package com.coderpwh.leetcode;

/**
 *617. 合并二叉树
 *
 * @author coderpwh
 */
public class MergeTrees {

    public static void main(String[] args) {

        MergeTrees trees = new MergeTrees();

        BiTrees biTreesOne = trees.createOne();

        // 获取二叉树one
        TreeNodes rootOne = biTreesOne.getRoot();

        BiTrees biTreesTwo = trees.createTwo();

        // 获取二叉树two
        TreeNodes rootTwo = biTreesTwo.getRoot();

        // 合并二叉树
        TreeNodes node = trees.mergeTrees(rootOne, rootTwo);


        trees.pre(rootOne);
        System.out.println();
        trees.pre(rootTwo);

        System.out.println();

        trees.pre(node);

    }


    /***
     * 创建二叉树
     * @return
     */
    public BiTrees createOne() {

        TreeNodes node5 = new TreeNodes(5);

        TreeNodes node3 = new TreeNodes(3, node5, null);

        TreeNodes node2 = new TreeNodes(2);

        TreeNodes node1 = new TreeNodes(1, node3, node2);

        return new BiTrees(node1);

    }


    /***
     *  创建二叉树二
     * @return
     */
    public BiTrees createTwo() {

        TreeNodes node4 = new TreeNodes(4);

        TreeNodes node1 = new TreeNodes(1, null, node4);

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node3 = new TreeNodes(3, null, node7);

        TreeNodes node2 = new TreeNodes(2, node1, node3);

        return new BiTrees(node2);
    }


    /***
     *
     *    思路:
     *      1. 时间复杂度为O(N)
     *      2. 空间复杂度为O(N)
     *      3. 递归方式，对左右根进行整合
     *
     * @param root1
     * @param root2
     * @return
     */
    public TreeNodes mergeTrees(TreeNodes root1, TreeNodes root2) {

        if (root1 == null) {
            return root2;
        }

        if (root2 == null) {
            return root1;
        }

        TreeNodes root = new TreeNodes(root1.val + root2.val);

        root.left = mergeTrees(root1.left, root2.left);

        root.right = mergeTrees(root1.right, root2.right);

        return root;
    }


    /***
     * 前序遍历
     * @param root
     */
    public void pre(TreeNodes root) {
        if (root != null) {
            System.out.print(root.val);
            System.out.print(" ");
            pre(root.left);
            pre(root.right);
        }
    }


    /***
     *  中序遍历
     * @param root
     */
    public void mid(TreeNodes root) {

        if (root != null) {
            mid(root.left);
            System.out.print(root.val);
            System.out.print(" ");
            mid(root.right);
        }
    }


}
