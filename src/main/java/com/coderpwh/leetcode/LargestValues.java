 package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 515. 在每个树行中找最大值
 * <p>
 * 给定一棵二叉树的根节点 root ，请找出该二叉树中每一层的最大值
 *
 * @author coderpwh
 */
public class LargestValues {

    public static void main(String[] args) {

        LargestValues values = new LargestValues();

        // 创建二叉树
        BiTrees biTrees = values.create();

        // 获取根结点
        TreeNodes root = biTrees.getRoot();

        //  层次遍历比较获取每层次的最大值
        values.largestValues(root);

        // 二叉树的层次遍历
        values.test(root);

    }


    /**
     * 创建二叉树
     *
     * @return
     */
    public BiTrees create() {

        TreeNodes node5 = new TreeNodes(5);

        TreeNodes node3 = new TreeNodes(3);

        TreeNodes node33 = new TreeNodes(3, node5, node3);

        TreeNodes node9 = new TreeNodes(9);

        TreeNodes node2 = new TreeNodes(2, null, node9);

        TreeNodes root = new TreeNodes(1, node33, node2);

        return new BiTrees(root);
    }


    /***
     *   思路:
     *       1.时间复杂度为O(N^2)
     *       2. 空间复杂度为O(N)
     *       3. 借助队列方式实现二叉树的层次遍历
     *
     *
     * @param root
     * @return
     */
    public List<Integer> largestValues(TreeNodes root) {

        if (root == null) {
            return null;
        }


        Deque<TreeNodes> deque = new LinkedList<>();
        deque.offer(root);
        List<Integer> list = new ArrayList<>();

        while (!deque.isEmpty()) {
            int size = deque.size();

            int max = Integer.MIN_VALUE;

            for (int i = 0; i < size; i++) {
                TreeNodes node = deque.poll();

                max = Math.max(max, node.val);
                if (node.left != null) {
                    deque.offer(node.left);
                }

                if (node.right != null) {
                    deque.offer(node.right);
                }
            }
            list.add(max);
        }
        return list;
    }


    /***
     *
     *   思路:
     *       1.时间复杂度为为O(N^2)
     *       2.空间复杂度为O(N)
     *       3.主要是层次遍历，打印每个层次的值
     * @param root
     */
    public void test(TreeNodes root) {

        if (root == null) {
            return;
        }

        List<List<Integer>> date = new ArrayList<>();

        Deque<TreeNodes> deque = new LinkedList<>();

        deque.offer(root);

        while (!deque.isEmpty()) {

            int size = deque.size();


            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {

                TreeNodes node = deque.poll();
                list.add(node.val);

                if (node.left != null) {
                    deque.offer(node.left);
                }

                if (node.right != null) {
                    deque.offer(node.right);
                }
            }
            date.add(list);

        }

        System.out.println(date.size());


        for (List<Integer> li : date) {
            System.out.println(li);
        }


    }


}
