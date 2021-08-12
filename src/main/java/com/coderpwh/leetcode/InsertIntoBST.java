 package com.coderpwh.leetcode;

public class InsertIntoBST {

    public static void main(String[] args) {

        int val = 5;

        InsertIntoBST insertIntoBST = new InsertIntoBST();

        BiTrees biTrees = insertIntoBST.create();


        insertIntoBST.insertIntoBST(biTrees.getRoot(),val);

        insertIntoBST.preNode(biTrees.getRoot());


    }


    public BiTrees create() {

        TreeNodes node1 = new TreeNodes(1);

        TreeNodes node3 = new TreeNodes(3);

        TreeNodes node2 = new TreeNodes(2, node1, node3);

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node4 = new TreeNodes(4, node2, node7);

        return new BiTrees(node4);


    }


    public TreeNodes insertIntoBST(TreeNodes root, int val) {

        if (root == null) {
            return new TreeNodes(val);
        }

        TreeNodes node = root;

        while (node != null) {

            if (val < node.val) {

                if (node.left == null) {
                    node.left = new TreeNodes(val);
                    break;
                } else {
                    node = node.left;
                }
            } else {

                if (node.right == null) {
                    node.right = new TreeNodes(val);
                    break;
                } else {
                    node = node.right;
                }
            }
        }
        return root;
    }


    public void preNode(TreeNodes node) {

        if (node != null) {
            System.out.println(node.val);
            preNode(node.left);
            preNode(node.right);
        }


    }


}
