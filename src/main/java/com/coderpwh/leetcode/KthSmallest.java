 package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KthSmallest {


    public static void main(String[] args) {

        KthSmallest kthSmallest = new KthSmallest();

        BiTrees biTrees = kthSmallest.create();

        TreeNodes root = biTrees.getRoot();


        int k = 3;

//        kthSmallest.kthSmallest(root,k);

        System.out.println(kthSmallest.kthSmallest(root, k));

    }


    /***
     *
     *  创建二叉树
     *
     * @return
     */
    public BiTrees create() {

        TreeNodes node1 = new TreeNodes(1);

        TreeNodes node2 = new TreeNodes(2, node1, null);

        TreeNodes node4 = new TreeNodes(4);

        TreeNodes node3 = new TreeNodes(3, node2, node4);

        TreeNodes node6 = new TreeNodes(6);

        TreeNodes node5 = new TreeNodes(5, node3, node6);

        return new BiTrees(node5);
    }


    /***
     *    思路:
     *       1. 时间复杂度为O(N)
     *       2. 空间复杂度为O(N)
     *       3. 采用中序遍历方式
     *
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest(TreeNodes root, int k) {

        List<Integer> list = new ArrayList<>();
        mid(root, list);

        if (list != null) {
            return list.get(k - 1);
        }

        return 0;
    }


    /***
     *   中序遍历方式
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
