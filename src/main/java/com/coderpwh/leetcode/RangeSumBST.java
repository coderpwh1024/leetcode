 package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author coderpwh
 */
public class RangeSumBST {

    public static void main(String[] args) {

        RangeSumBST bst = new RangeSumBST();


        // 获取二叉树
        BiTrees biTree = bst.create();

        // 获取二叉树根结点
        TreeNodes root = biTree.getRoot();

        bst.rangeSumBST(root, 7, 15);

        System.out.println(bst.rangeSumBST(root, 7, 15));


    }


    /***
     *  创建二叉树
     * @return
     */
    public BiTrees create() {

        TreeNodes node3 = new TreeNodes(3);

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node5 = new TreeNodes(5, node3, node7);

        TreeNodes node18 = new TreeNodes(18);

        TreeNodes node15 = new TreeNodes(15, null, node18);

        TreeNodes node10 = new TreeNodes(10, node5, node15);

        return new BiTrees(node10);

    }


    /***
     *    思路:
     *       1. 时间复杂度为O(N)
     *       2. 空间复杂度为O(N)
     *       3. 先中序遍历，后通过数组遍历
     * @param root
     * @param low
     * @param high
     * @return
     */
    public int rangeSumBST(TreeNodes root, int low, int high) {

        List<Integer> list = new ArrayList<>();

        int sum = 0;
        mid(root, list);
        if (list != null && list.size() > 0) {

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) >= low && list.get(i) <= high) {
                    sum += list.get(i);
                }
            }
        }
        return sum;
    }


    /***
     *
     *   中序遍历
     *
     * @param root
     * @param list
     */
    public void mid(TreeNodes root, List<Integer> list) {
        if (root != null) {
            mid(root.left, list);
            list.add(root.val);
            mid(root.right, list);
        }
    }


}
