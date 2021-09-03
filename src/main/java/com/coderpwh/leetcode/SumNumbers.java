package com.coderpwh.leetcode;

/***
 *
 *  129. 求根节点到叶节点数字之和
 *
 * 给你一个二叉树的根节点 root ，树中每个节点都存放有一个 0 到 9 之间的数字。
 * 每条从根节点到叶节点的路径都代表一个数字：
 *
 * 例如，从根节点到叶节点的路径 1 -> 2 -> 3 表示数字 123 。
 * 计算从根节点到叶节点生成的 所有数字之和 。
 *
 * 叶节点 是指没有子节点的节点。
 *
 *
 *
 *
 */
public class SumNumbers {

    public static void main(String[] args) {

        SumNumbers sum = new SumNumbers();

        // 创建二叉树
        BiTrees biTrees = sum.create();

        // 获取二叉树根结点
        TreeNodes root = biTrees.getRoot();

        sum.sumNumbers(root);

        System.out.println(sum.sumNumbers(root));


    }


    /**
     * 创建二叉树
     *
     * @return
     */
    public BiTrees create() {

        TreeNodes node2 = new TreeNodes(2);

        TreeNodes node3 = new TreeNodes(3);

        TreeNodes node1 = new TreeNodes(1, node2, node3);

        return new BiTrees(node1);
    }


    public int sumNumbers(TreeNodes root) {

        return preNode(root, 0);
    }


    /***
     *   思路:
     *      1. 时间复杂度为O(N)
     *      2. 空间复杂度为O(N)
     *      3. 利用递归方式实现，树如果是三层，则会产生三位数，这个地方易出错
     *
     *
     * @param root
     * @param presum
     * @return
     */
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
