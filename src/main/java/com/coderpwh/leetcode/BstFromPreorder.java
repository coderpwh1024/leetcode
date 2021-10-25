package com.coderpwh.leetcode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/***
 * 1008
 */
public class BstFromPreorder {

    public static void main(String[] args) {

        BstFromPreorder bst = new BstFromPreorder();

        int[] preorder = {8, 5, 1, 7, 10, 12};

        TreeNodes root = bst.bstFromPreorder(preorder);


        bst.pre(root);

//        BiTrees biTrees = bst.create();

//        bst.pre(biTrees.getRoot());

    }

    public BiTrees create() {

        TreeNodes node1 = new TreeNodes(1);

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node5 = new TreeNodes(5, node1, node7);

        TreeNodes node12 = new TreeNodes(12);

        TreeNodes node10 = new TreeNodes(10, null, node12);

        TreeNodes node8 = new TreeNodes(8, node5, node10);

        return new BiTrees(node8);


    }


    public TreeNodes bstFromPreorder(int[] preorder) {

        // 原数组 (前序)
        int arr[] = preorder.clone();

        // 排序后 （中序）
        Arrays.sort(preorder);

        return dfs(arr, preorder, 0, 0, preorder.length);
    }


    public TreeNodes dfs(int[] pre, int[] mid, int preIndex, int midIndex, int count) {


        if (count > 0) {
            int nodeVal = pre[preIndex];

            int i = 0;

            for (; i < count; i++) {
                if (mid[i + midIndex] == nodeVal) {
                    break;
                }
            }
            TreeNodes root = new TreeNodes(nodeVal);

            root.left = dfs(pre, mid, preIndex + 1, midIndex, i);

            root.right = dfs(pre, mid, preIndex + i + 1, midIndex + 1 + i, count - 1 - i);

            return root;
        }

        return null;

    }


    public void pre(TreeNodes root) {
        if (root != null) {
            System.out.print(root.val);
            System.out.print(" ");
            pre(root.left);
            pre(root.right);
        }
    }



}
