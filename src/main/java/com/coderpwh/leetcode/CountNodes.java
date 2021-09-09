package com.coderpwh.leetcode;

public class CountNodes {


    public static void main(String[] args) {

        CountNodes countNodes = new CountNodes();


        BiTrees biTrees = countNodes.create();

        TreeNodes root = biTrees.getRoot();


        countNodes.countNodes(root);

    }

    public int countNodes(TreeNodes root) {


        int count =   getCount(root);

        System.out.println(count);

        return count;
    }


    public BiTrees create() {


        TreeNodes node4 = new TreeNodes(4);

        TreeNodes node5 = new TreeNodes(5);

        TreeNodes node2 = new TreeNodes(2, node4, node5);

        TreeNodes node6 = new TreeNodes(6);

        TreeNodes node3 = new TreeNodes(3, node6, null);

        TreeNodes node1 = new TreeNodes(1, node2, node3);

        return new BiTrees(node1);

    }


    public int getCount(TreeNodes root) {

        int count = 0;

        if (root == null) {
            return 0;
        } else {
            count = 1 + getCount(root.left) + getCount(root.right);
        }

        return count;

    }


}
