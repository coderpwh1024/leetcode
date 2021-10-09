package com.coderpwh.leetcode;

public class MergeTrees {

    public static void main(String[] args) {

        MergeTrees trees = new MergeTrees();

        BiTrees biTreesOne = trees.createOne();

        TreeNodes rootOne = biTreesOne.getRoot();

        BiTrees biTreesTwo = trees.createTwo();

        TreeNodes rootTwo = biTreesTwo.getRoot();

        TreeNodes node = trees.mergeTrees(rootOne, rootTwo);


        trees.pre(rootOne);
        System.out.println();
        trees.pre(rootTwo);

        System.out.println();

        trees.pre(node);

    }


    public BiTrees createOne() {

        TreeNodes node5 = new TreeNodes(5);

        TreeNodes node3 = new TreeNodes(3, node5, null);

        TreeNodes node2 = new TreeNodes(2);

        TreeNodes node1 = new TreeNodes(1, node3, node2);

        return new BiTrees(node1);

    }

    public BiTrees createTwo() {

        TreeNodes node4 = new TreeNodes(4);

        TreeNodes node1 = new TreeNodes(1, null, node4);

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node3 = new TreeNodes(3, null, node7);

        TreeNodes node2 = new TreeNodes(2, node1, node3);

        return new BiTrees(node2);
    }


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


    public void pre(TreeNodes root) {

        if (root != null) {
            System.out.print(root.val);
            System.out.print(" ");
            pre(root.left);
            pre(root.right);
        }
    }


    public void mid(TreeNodes root) {

        if (root != null) {
            mid(root.left);
            System.out.print(root.val);
            System.out.print(" ");
            mid(root.right);
        }
    }


}
