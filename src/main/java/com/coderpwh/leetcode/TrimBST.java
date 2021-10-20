package com.coderpwh.leetcode;

import java.util.List;

/**
 * 669
 *
 * @author coderpwh
 */
public class TrimBST {

    public static void main(String[] args) {

        int low = 1;

        int high = 3;

        TrimBST bst = new TrimBST();

        BiTrees biTrees = bst.create();

        TreeNodes root = biTrees.getRoot();

        TreeNodes node = bst.trimBST(root, low, high);

        System.out.println("中序遍历方式打印:");
        System.out.println("==============================");
        bst.midOrder(node);

    }


    public BiTrees create() {

        TreeNodes node1 = new TreeNodes(1);
        TreeNodes node2 = new TreeNodes(2, node1, null);

        TreeNodes node0 = new TreeNodes(0, null, node2);

        TreeNodes node4 = new TreeNodes(4);

        TreeNodes node3 = new TreeNodes(3, node0, node4);

        return new BiTrees(node3);
    }


    public TreeNodes trimBST(TreeNodes root, int low, int high) {

        if (root == null) {
            return null;
        }

        if (root.val > high) {
            return trimBST(root.left, low, high);
        }

        if (root.val < low) {
            return trimBST(root.right, low, high);
        }

        root.left = trimBST(root.left, low, high);

        root.right = trimBST(root.right, low, high);

        return root;
    }

    public void mid(TreeNodes root, List<Integer> list, int low, int high) {

        if (root != null) {
            mid(root.left, list, low, high);
            if (root.val >= low && root.val <= high) {
                list.add(root.val);
            }
            mid(root.right, list, low, high);
        }

    }


    public void midOrder(TreeNodes root) {

        if (root != null) {
            midOrder(root.left);
            System.out.print(root.val);
            System.out.print(" ");
            midOrder(root.right);
        }
    }


}
