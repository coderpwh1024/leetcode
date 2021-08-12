package com.coderpwh.leetcode;

public class InsertIntoBST {

    public static void main(String[] args) {

        int val = 5;

        InsertIntoBST insertIntoBST = new InsertIntoBST();

        // 创建二叉树
        BiTrees biTrees = insertIntoBST.create();


        // 插入对应的值
        insertIntoBST.insertIntoBST(biTrees.getRoot(), val);


        // 前根遍历
        insertIntoBST.preNode(biTrees.getRoot());


    }


    /***
     *
     *   创建二叉树
     *
     * @return
     */
    public BiTrees create() {

        TreeNodes node1 = new TreeNodes(1);

        TreeNodes node3 = new TreeNodes(3);

        TreeNodes node2 = new TreeNodes(2, node1, node3);

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node4 = new TreeNodes(4, node2, node7);

        return new BiTrees(node4);


    }


    /***
     *    思路:
     *      1. 时间复杂度为O(N)
     *      2. 空间复杂度为O(1)
     *
     * @param root
     * @param val
     * @return
     */
    public TreeNodes insertIntoBST(TreeNodes root, int val) {

        if (root == null) {
            return new TreeNodes(val);
        }

        TreeNodes node = root;

        while (node != null) {

            if (val < node.val) {

                if (node.left == null) {
                    node.left = new TreeNodes(val);
                    break;
                } else {
                    node = node.left;
                }
            } else {

                if (node.right == null) {
                    node.right = new TreeNodes(val);
                    break;
                } else {
                    node = node.right;
                }
            }
        }
        return root;
    }


    /***
     *  前根遍历
     *
     *
     * @param node
     */
    public void preNode(TreeNodes node) {

        if (node != null) {
            System.out.println(node.val);
            preNode(node.left);
            preNode(node.right);
        }


    }


}
