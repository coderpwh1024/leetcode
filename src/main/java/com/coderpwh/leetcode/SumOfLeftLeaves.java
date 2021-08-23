package com.coderpwh.leetcode;

/**
 * @author coderpwh
 */
public class SumOfLeftLeaves {

    public static void main(String[] args) {


        SumOfLeftLeaves sum = new SumOfLeftLeaves();

        BiTrees biTrees = sum.create();

        TreeNodes root = biTrees.getRoot();

//        sum.sumOfLeftLeaves(root);
        System.out.println(sum.sumOfLeftLeaves(root));


    }


    public BiTrees create() {

        TreeNodes node15 = new TreeNodes(15);

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes nodes20 = new TreeNodes(20, node15, node7);

        TreeNodes nodes9 = new TreeNodes(9);

        TreeNodes nodes3 = new TreeNodes(3, nodes9, nodes20);

        return new BiTrees(nodes3);
    }


    public int sumOfLeftLeaves(TreeNodes root) {

        int count = 0;

        if (root == null) {
            return count;
        }

        if (root.left != null && root.left.left == null && root.left.right == null) {
            count = root.left.val;
        }

        return count + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);

    }




}
