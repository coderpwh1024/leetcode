package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

/***
 * 
 * 二叉树的前序遍历
 * 
 */
public class PreorderTraversal {


    public static void main(String[] args) {

        PreorderTraversal preorderTraversa = new PreorderTraversal();
        BiTree biTree = preorderTraversa.createBTree();

        // 根结点
        TreeNode root = biTree.getRoot();

        preorderTraversa.preorderTraversal(root);


    }


    /***
     * 创建二叉树
     *
     * @return
     */
    public BiTree createBTree() {
/*
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node3, null);

        TreeNode node1 = new TreeNode(1, null, node2);*/

        TreeNode node7 = new TreeNode(7);
        TreeNode node6 = new TreeNode(6);

        TreeNode node3 = new TreeNode(3, node6, node7);

        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);

        TreeNode node2 = new TreeNode(2, node4, node5);

        TreeNode node1 = new TreeNode(1, node2, node3);


        return new BiTree(node1);

    }


    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        preRootTraversal(root, list);


        for (Integer count : list) {
            System.out.print(count + " ");
        }

        return list;
    }


    /***
     *     思路:
     *         1. 递归方式实现二叉树的先根遍历
     *         2. 时间复杂度为O(N)
     *         3. 空间复杂度为O(N)
     * @param root
     * @param list
     */
    public void preRootTraversal(TreeNode root, List<Integer> list) {

        if (root != null) {
            list.add(root.val);
            preRootTraversal(root.left, list);
            preRootTraversal(root.right, list);
        }
    }

}

