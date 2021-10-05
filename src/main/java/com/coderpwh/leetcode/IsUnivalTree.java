    package com.coderpwh.leetcode;

/****
 *965. 单值二叉树
 *
 如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。

 只有给定的树是单值二叉树时，才返回 true；否则返回 false
 *
 *
 *
 */
public class IsUnivalTree {

    public static void main(String[] args) {


        IsUnivalTree tree = new IsUnivalTree();

        // 创建二叉树
        BiTrees biTrees = tree.create();

        // 获取根结点
        TreeNodes root = biTrees.getRoot();

        System.out.println(tree.isUnivalTree(root));
    }


    /**
     * 创建二叉树
     *
     * @return
     */
    public BiTrees create() {

        TreeNodes nodes1 = new TreeNodes(2);

        TreeNodes nodes11 = new TreeNodes(1);

        TreeNodes nodes111 = new TreeNodes(1, nodes1, nodes11);

        TreeNodes nodes1111 = new TreeNodes(1);

        TreeNodes nodes11111 = new TreeNodes(1, null, nodes1111);

        TreeNodes root = new TreeNodes(1, nodes111, nodes11111);


        return new BiTrees(root);

    }


    /***
     *  思路:
     *      1.时间复杂度为O(N)
     *      2.空间复杂度为O(N)
     * @param root
     * @return
     */
    public boolean isUnivalTree(TreeNodes root) {

        boolean left = (root.left == null || (root.val.equals(root.left.val) && isUnivalTree(root.left)));

        boolean right = (root.right == null || (root.val.equals(root.right.val) && isUnivalTree(root.right)));

        return left && right;

    }
}
