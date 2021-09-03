package com.coderpwh.leetcode;


public class SumNumbers {

    public static void main(String[] args) {

        SumNumbers sum = new SumNumbers();

        BiTrees biTrees = sum.create();

        TreeNodes root = biTrees.getRoot();

        sum.sumNumbers(root);

        System.out.println(sum.sumNumbers(root));


    }


    public BiTrees create() {

        TreeNodes node2 = new TreeNodes(2);

        TreeNodes node3 = new TreeNodes(3);

        TreeNodes node1 = new TreeNodes(1, node2, node3);

        return new BiTrees(node1);
    }


    public int sumNumbers(TreeNodes root) {

        return preNode(root, 0);
    }


    public int preNode(TreeNodes root, int presum) {

        if (root == null) {
            return 0;
        }

        int sum = presum * 10 + root.val;

        if (root.left == null && root.right == null) {
            return sum;
        } else {
            return preNode(root.left, sum) + preNode(root.right, sum);
        }

    }

}
