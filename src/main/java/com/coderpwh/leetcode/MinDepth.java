 package com.coderpwh.leetcode;

public class MinDepth {

    public static void main(String[] args) {


        MinDepth depth = new MinDepth();

        BiTrees biTrees = depth.create();

        TreeNodes root = biTrees.getRoot();

        System.out.println(depth.minDepth(root));


    }


    public BiTrees create() {

        TreeNodes node9 = new TreeNodes(9);

        TreeNodes node15 = new TreeNodes(15);

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node20 = new TreeNodes(20, node15, node7);

        TreeNodes nodes3 = new TreeNodes(3, node9, node20);

        return new BiTrees(nodes3);
    }


    /***
     *      思路:
     *        1. 时间复杂度为O(N)
     *        2. 空间复杂度为O(H),H为二叉树的深度
     *        3. 利用递归的方式实现
     *
     * @param root
     * @return
     */
    public int minDepth(TreeNodes root) {


        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int min_depth = Integer.MAX_VALUE;


        if (root.left != null) {
            min_depth = Math.min(minDepth(root.left), min_depth);
        }

        if (root.right != null) {
            min_depth = Math.min(minDepth(root.right), min_depth);
        }


        return min_depth + 1;
    }

}
