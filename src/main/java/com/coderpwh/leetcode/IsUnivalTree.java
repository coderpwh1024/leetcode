 package com.coderpwh.leetcode;

public class IsUnivalTree {

    public static void main(String[] args) {


        IsUnivalTree tree = new IsUnivalTree();

        BiTrees biTrees = tree.create();

        TreeNodes root = biTrees.getRoot();

        System.out.println(tree.isUnivalTree(root));
    }


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
