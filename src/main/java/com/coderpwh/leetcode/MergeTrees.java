package com.coderpwh.leetcode;

import javax.management.BadBinaryOpValueExpException;

public class MergeTrees {

    public static void main(String[] args) {

        MergeTrees trees = new MergeTrees();

        BiTrees biTreesOne = trees.createOne();

        TreeNodes rootOne = biTreesOne.getRoot();

        BiTrees biTreesTwo = trees.createTwo();

        TreeNodes rootTwo = biTreesTwo.getRoot();

        trees.mergeTrees(rootOne, rootTwo);
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



        return null;
    }


}
