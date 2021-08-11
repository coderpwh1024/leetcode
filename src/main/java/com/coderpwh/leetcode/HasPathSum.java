package com.coderpwh.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/***
 *
 * 112 路径总和
 *给你二叉树的根节点 root 和一个表示目标和的整数 targetSum ，判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。
 *
 * 叶子节点 是指没有子节点的节点。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
 * 输出：true
 * 示例 2：
 *
 *
 * 输入：root = [1,2,3], targetSum = 5
 * 输出：false
 * 示例 3：
 *
 * 输入：root = [1,2], targetSum = 0
 * 输出：false
 */
public class HasPathSum {


    public static void main(String[] args) {

        int count = 22;


        HasPathSum sum = new HasPathSum();


        BiTrees biTree = sum.createBTree();
        TreeNodes root = biTree.getRoot();

//         sum.hasPathSum(root, count);

        System.out.println(sum.hasPathSum(root, count));

        System.out.println(sum.test(root,count));


    }


    /***
     *    创建二叉树
     *
     *
     * @return
     */
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


    /***
     *    思路:
     *       1. 时间复杂度为O(N)
     *       2. 空间复杂度为O(N)
     *       3. 主要利用队列方式实现
     *
     *
     *
     * @param root
     * @param sum
     * @return
     */
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

    public boolean test(TreeNodes root, int sum) {

        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {

            return sum == root.val;
        }


        return test(root.left, sum - root.val) || test(root.right, sum - root.val);

    }


}
