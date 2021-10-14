 package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 1161. 最大层内元素和
 * <p>
 * 给你一个二叉树的根节点 root。设根节点位于二叉树的第 1 层，而根节点的子节点位于第 2 层，依此类推。
 * <p>
 * 请你找出层内元素之和 最大 的那几层（可能只有一层）的层号，并返回其中 最小 的那个。
 * <p>
 *
 * @author coderpwh
 */
public class MaxLevelSum {

    public static void main(String[] args) {

        MaxLevelSum max = new MaxLevelSum();

        // 创建二叉树
        BiTrees biTrees = max.create();

        // 获取根结点
        TreeNodes root = biTrees.getRoot();

        int maxNum = max.maxLevelSum(root);

        System.out.println(maxNum);
    }


    /**
     * 创建二叉树
     *
     * @return
     */
    public BiTrees create() {

        TreeNodes node8 = new TreeNodes(-8);
        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node77 = new TreeNodes(7, node7, node8);

        TreeNodes node0 = new TreeNodes(0);

        TreeNodes node1 = new TreeNodes(1, node77, node0);

        return new BiTrees(node1);
    }


    /***
     *  思路:
     *     1.时间复杂度为O(N^2)
     *     2.空间复杂度为O(N)
     *     3.借助队列对二叉树进行层次遍历
     * @param root
     * @return
     */
    public int maxLevelSum(TreeNodes root) {

        Deque<TreeNodes> deque = new LinkedList<>();
        deque.offer(root);

        List<Integer> list = new ArrayList<>();
        while (!deque.isEmpty()) {

            int size = deque.size();
            int sum = 0;

            for (int i = 0; i < size; i++) {
                TreeNodes node = deque.poll();
                sum += node.val;

                if (node.left != null) {
                    deque.offer(node.left);
                }

                if (node.right != null) {
                    deque.offer(node.right);
                }
            }
            list.add(sum);
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }

        return list.indexOf(max) + 1;
    }


}
