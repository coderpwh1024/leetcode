package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {


    public static void main(String[] args) {

        PreorderTraversal preorderTraversa = new PreorderTraversal();
        BiTree biTree = preorderTraversa.createBTree();

        // 根结点
        TreeNode root = biTree.getRoot();

        preorderTraversa.preorderTraversal(root);


    }


    public BiTree createBTree() {

        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node3, null);

        TreeNode node1 = new TreeNode(1, null, node2);

        return new BiTree(node1);

    }


    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        preRootTraversal(root, list);


        for (Integer count : list) {
            System.out.print(count+" ");
        }

        return list;
    }


    public void preRootTraversal(TreeNode root, List<Integer> list) {

        if (root != null) {
            list.add(root.val);
            preRootTraversal(root.left, list);
            preRootTraversal(root.right, list);
        }
    }

}
