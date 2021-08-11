package com.coderpwh.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class HasPathSum {


    public static void main(String[] args) {

        int count = 22;


        HasPathSum sum = new HasPathSum();


        BiTrees biTree = sum.createBTree();
        TreeNodes root = biTree.getRoot();

//         sum.hasPathSum(root, count);

        System.out.println(sum.hasPathSum(root, count));


    }

    public BiTrees createBTree() {


        TreeNodes node7 = new TreeNodes(7);
        TreeNodes node2 = new TreeNodes(2);

        TreeNodes node11 = new TreeNodes(11, node7, node2);

        TreeNodes node4 = new TreeNodes(4, node11, null);


        TreeNodes node1 = new TreeNodes(1);

        TreeNodes node4_4 = new TreeNodes(4, null, node1);


        TreeNodes node13 = new TreeNodes(13);

        TreeNodes node8 = new TreeNodes(8, node13, node4_4);


        TreeNodes node5 = new TreeNodes(5, node4, node8);


        return new BiTrees(node5);
    }


    public boolean hasPathSum(TreeNodes root, int sum) {

        if (root == null) {
            return false;
        }

        Queue<TreeNodes> queueNode = new LinkedList<TreeNodes>();
        Queue<Integer> queueVal = new LinkedList<Integer>();

        queueNode.offer(root);
        queueVal.offer(root.val);

        while (!queueNode.isEmpty()) {
            TreeNodes nodes = queueNode.poll();

            Integer temp = queueVal.poll();

            if (nodes.left == null && nodes.right == null) {

                if (temp == sum) {
                    return true;
                }
                continue;
            }

            if (nodes.left != null) {
                queueNode.offer(nodes.left);
                queueVal.offer(nodes.left.val + temp);
            }

            if (nodes.right != null) {
                queueNode.offer(nodes.right);
                queueVal.offer(nodes.right.val + temp);
            }

        }


        return false;
    }


}
