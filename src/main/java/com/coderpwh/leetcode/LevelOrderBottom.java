package com.coderpwh.leetcode;

import java.util.*;

/***
 *
 * 给定一个二叉树，返回其节点值自底向上的层序遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其自底向上的层序遍历为：
 *
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 *
 *
 *
 */
public class LevelOrderBottom {

    public static void main(String[] args) {

        LevelOrderBottom bottom = new LevelOrderBottom();

        // 创建二叉树
        BiTrees biTrees = bottom.create();

        // 二叉树层次遍历
        List<List<Integer>> list = bottom.levelOrderBottom(biTrees.getRoot());

        if (list != null) {
            for (List<Integer> date : list) {
                System.out.println(date);
            }
        }


    }


    /***
     *  创建二叉树
     * @return
     */
    public BiTrees create() {

        TreeNodes node15 = new TreeNodes(15);

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node20 = new TreeNodes(20, node15, node7);

        TreeNodes node9 = new TreeNodes(9);

        TreeNodes node3 = new TreeNodes(3, node9, node20);

        return new BiTrees(node3);
    }


    /***
     *  思路:
     *     1.时间复杂度为O(N)
     *     2. 空间复杂度为O(N)
     *     3.主要利用队列与循环实现
     *
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderBottom(TreeNodes root) {

        List<List<Integer>> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        Queue<TreeNodes> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {

            List<Integer> date = new ArrayList<>();

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                TreeNodes node = queue.poll();
                date.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            list.add(date);

        }

        Collections.reverse(list);
        return list;
    }

}
