 package com.coderpwh.leetcode;

/**
 * @author coderpwh
 */
public class SumOfLeftLeaves {

    public static void main(String[] args) {


        SumOfLeftLeaves sum = new SumOfLeftLeaves();

        // 创建二叉树
        BiTrees biTrees = sum.create();

        // 获取根结点
        TreeNodes root = biTrees.getRoot();

//        sum.sumOfLeftLeaves(root);
        System.out.println(sum.sumOfLeftLeaves(root));


    }


    /***
     *  创建二叉树
     *
     * @return
     */
    public BiTrees create() {

        TreeNodes node15 = new TreeNodes(15);

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes nodes20 = new TreeNodes(20, node15, node7);

        TreeNodes nodes9 = new TreeNodes(9);

        TreeNodes nodes3 = new TreeNodes(3, nodes9, nodes20);

        return new BiTrees(nodes3);
    }


    /***
     *   思路:
     *     1. 时间复杂度为O(N)
     *     2. 空间复杂度为O(1)
     *     3. 利用递归方式实现
     *
     *
     * @param root
     * @return
     */
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
