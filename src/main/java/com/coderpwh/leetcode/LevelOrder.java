package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {


    public static void main(String[] args) {

        LevelOrder levelOrder = new LevelOrder();


        BiTree biTree = levelOrder.createBTree();


        // 根结点
        TreeNode root = biTree.getRoot();


        levelOrder.levelOrder(root);

    }

    /***
     *
     * 创建二叉树
     *
     * @return
     */
    public BiTree createBTree() {

        TreeNode node7 = new TreeNode(5 + "");
        TreeNode node6 = new TreeNode(null);

        TreeNode node3 = new TreeNode(3 + "", null, node7);

        TreeNode node5 = new TreeNode(null);
        TreeNode node4 = new TreeNode(4 + "");

        TreeNode node2 = new TreeNode(2 + "", node4, null);

        TreeNode node1 = new TreeNode(1 + "", node2, node3);


        return new BiTree(node1);
    }

    public List<List<String>> levelOrder(TreeNode root) {

//        List<List<String>> list = new ArrayList<>();
//        level(root, list);

        List<List<String>> list = test(root);


        if (list != null && list.size() > 0) {

            for (List<String> date : list) {
                System.out.println(date);
            }
        }

        return list;
    }


    /***
     *   思路:
     *     1. 时间复杂度为O(N)
     *     2. 空间复杂度为O(N)
     *
     *
     * @param root
     * @param list
     */
    public void level(TreeNode root, List<List<String>> list) {


        if (root != null) {

            LinkedList<TreeNode> L = new LinkedList<TreeNode>();

            L.offer(root);
            List<String> rootList = new ArrayList<>();
            rootList.add(root.val);
            list.add(rootList);


            while (!L.isEmpty()) {

                root = L.poll();
                List<String> nodeList = new ArrayList<>();
                if (root.left != null) {
                    L.offer(root.left);
                    nodeList.add(root.left.val);
                }

                if (root.right != null) {
                    L.offer(root.right);
                    nodeList.add(root.right.val);
                }
                if (nodeList != null && nodeList.size() > 0) {
                    list.add(nodeList);
                }
            }
        }
    }


    /***
     *    思路
     *       1. 时间复杂度为O(N)
     *       2. 空间复杂度为O(N)
     *
     *
     * @param root
     * @return
     */
    public List<List<String>> test(TreeNode root) {
        List<List<String>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<String> level = new ArrayList<>();

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }

            }

            ret.add(level);
        }

        return ret;
    }


}
