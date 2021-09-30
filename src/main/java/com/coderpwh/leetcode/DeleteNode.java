package com.coderpwh.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 450. 删除二叉搜索树中的节点
 *
 * @author coderpwh
 */
public class DeleteNode {

    public static void main(String[] args) {

        DeleteNode node = new DeleteNode();

        // 创建二叉树
        BiTrees biTrees = node.create();

        // 获取根结点
        TreeNodes root = biTrees.getRoot();

        int key = 3;

        // 删除 结点值为key的结点
        TreeNodes rootnNode = node.deleteNode(root, key);

        // 中序遍历
        node.mid(rootnNode);

    }


    /**
     * 创建二叉树
     *
     * @return
     */
    public BiTrees create() {

        TreeNodes node2 = new TreeNodes(2);

        TreeNodes node4 = new TreeNodes(4);

        TreeNodes node3 = new TreeNodes(3, node2, node4);

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node6 = new TreeNodes(6, null, node7);

        TreeNodes node5 = new TreeNodes(5, node3, node6);

        return new BiTrees(node5);
    }


    /***
     *      思路:
     *         1.时间复杂度为O(NlogN)
     *         2.空间复杂度为O(N)
     *
     * @param root
     * @param key
     * @return
     */
    public TreeNodes deleteNode(TreeNodes root, int key) {

        if (root == null) {
            return null;
        }

        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            if (root.left == null && root.right == null) {
                root = null;
            } else if (root.right != null) {
                root.val = successor(root);
                root.right = deleteNode(root.right, root.val);
            } else {
                root.val = predecessor(root);
                root.left = deleteNode(root.left, root.val);
            }
        }

        return root;
    }


    /***
     *
     *  获取右结点的最小结点(最左结点)
     * @param root
     * @return
     */
    public int successor(TreeNodes root) {
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }


    /***
     *
     *  获取左结点的最大值(最右结点)
     *
     * @param root
     * @return
     */
    public int predecessor(TreeNodes root) {
        root = root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root.val;
    }


    /***
     *  作废
     * @param root
     * @param key
     */
    public void mid(TreeNodes root, int key) {

        Deque<TreeNodes> deque = new LinkedList<>();
        deque.offer(root);

        while (!deque.isEmpty()) {

            TreeNodes node = deque.poll();

            if (node.val.equals(key)) {
                TreeNodes temp = node.right;
                node = node.left;
                node.right = temp;
            }
        }
    }

    /**
     * 中序遍历方式
     *
     * @param root
     */
    public void mid(TreeNodes root) {
        if (root != null) {
            mid(root.left);
            System.out.print(root.val);
            System.out.print("  ");
            mid(root.right);
        }
    }
}
