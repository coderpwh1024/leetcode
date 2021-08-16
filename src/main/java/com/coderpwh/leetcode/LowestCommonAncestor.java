package com.coderpwh.leetcode;

public class LowestCommonAncestor {


    public static void main(String[] args) {

    }


    public BiTrees create() {

        TreeNodes node3 = new TreeNodes(3);
        TreeNodes node5 = new TreeNodes(5);

        TreeNodes node4 = new TreeNodes(4, node3, node5);

        TreeNodes node0 = new TreeNodes(0);

        TreeNodes node2 = new TreeNodes(2, node0, node4);


        TreeNodes node7 = new TreeNodes(7);
        TreeNodes node9 = new TreeNodes(9);

        TreeNodes node8 = new TreeNodes(8, node7, node9);

        TreeNodes node6 = new TreeNodes(6, node2, node8);

        return new BiTrees(node6);
    }


    public TreeNodes lowestCommonAncestor(TreeNodes root, TreeNodes p, TreeNodes q) {


        TreeNodes node = root;

        while (true) {
            if (p.val > node.val && q.val > node.val) {

                node = node.right;
            } else if (p.val < node.val && q.val < node.val) {
                node = node.left;
            } else {
                break;
            }

        }
        return node;
    }


}
