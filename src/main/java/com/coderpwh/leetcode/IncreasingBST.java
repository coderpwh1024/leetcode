 package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author coderpwh
 */
public class IncreasingBST {


    public static void main(String[] args) {

        IncreasingBST bst = new IncreasingBST();


        // 创建二叉树
        BiTrees biTrees = bst.create();

        // 获取根结点
        TreeNodes root = biTrees.getRoot();


        // 遍历并构建二叉树
        bst.increasingBST(root);


    }


    /***
     *  创建二叉树
     * @return
     */
    public BiTrees create() {

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node9 = new TreeNodes(9);

        TreeNodes node8 = new TreeNodes(8, node7, node9);

        TreeNodes node6 = new TreeNodes(6, null, node8);

        TreeNodes node1 = new TreeNodes(1);

        TreeNodes node2 = new TreeNodes(2, node1, null);

        TreeNodes node4 = new TreeNodes(4);

        TreeNodes node3 = new TreeNodes(3, node2, node4);

        TreeNodes node5 = new TreeNodes(5, node3, node6);

        return new BiTrees(node5);
    }


    /***
     *    思路:
     *      1. 时间复杂度为O(N)
     *      2. 空间复杂度为O(N)
     *      3.中序遍历获取了从小到大的集合，主要构建二叉树
     *
     * @param root
     * @return
     */
    public TreeNodes increasingBST(TreeNodes root) {

        List<Integer> list = new ArrayList<>();

        midPrint(root, list);


        if (list != null && list.size() > 0) {

            TreeNodes node = new TreeNodes(-1);

            TreeNodes cur = node;

            for (int i = 0; i < list.size(); i++) {

                cur.right = new TreeNodes(list.get(i));
                cur = cur.right;
            }

            return node.right;
        }
        return null;
    }


    /**
     * 前序遍历方式
     *
     * @param root
     */
    public void prePrint(TreeNodes root) {

        if (root != null) {
            System.out.print(root.val);
            System.out.print("  ");
            prePrint(root.left);
            prePrint(root.right);
        }

    }


    /**
     * 中序遍历
     *
     * @param root
     * @param list
     */
    public void midPrint(TreeNodes root, List<Integer> list) {

        if (root != null) {
            midPrint(root.left, list);
            list.add(root.val);
            System.out.print(root.val);
            System.out.print("  ");
            midPrint(root.right, list);

        }
    }

}
