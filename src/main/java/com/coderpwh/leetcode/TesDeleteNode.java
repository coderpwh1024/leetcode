package com.coderpwh.leetcode;

public class TesDeleteNode {

    public static void main(String[] args) {

        TesDeleteNode tesDeleteNode = new TesDeleteNode();

        BiTrees biTrees = tesDeleteNode.create();

        TreeNodes root = biTrees.getRoot();

        int key = 3;

        TreeNodes node = tesDeleteNode.delete(root, key);

        tesDeleteNode.mid(node);
    }


    public BiTrees create() {

        TreeNodes node2 = new TreeNodes(2);

        TreeNodes node4 = new TreeNodes(4);

        TreeNodes node3 = new TreeNodes(3, node2, node4);

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node6 = new TreeNodes(6, null, node7);

        TreeNodes node5 = new TreeNodes(5, node3, node6);

        return new BiTrees(node5);
    }


    public int getLeftMax(TreeNodes root) {

        root = root.left;

        while (root.right != null) {
            root = root.right;
        }

        return root.val;
    }

    public int getRightMin(TreeNodes root) {

        root = root.right;

        while (root.left != null) {
            root = root.left;
        }

        return root.val;
    }


    public TreeNodes delete(TreeNodes root, int key) {

        if (key > root.val) {
            root.right = delete(root.right, key);
        } else if (key < root.val) {
            root.left = delete(root.left, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.right != null) {
                root.val = getRightMin(root);
                root.right = delete(root.right, root.val);
            } else {
                root.val = getLeftMax(root);
                root.left = delete(root.left, root.val);
            }
        }

        return root;
    }

    public void mid(TreeNodes root) {

        if (root != null) {
            mid(root.left);
            System.out.print(root.val + "  ");
            mid(root.right);
        }

    }


}
