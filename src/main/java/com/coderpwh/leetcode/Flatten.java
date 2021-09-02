package com.coderpwh.leetcode;


/***
 *
 *   114 二叉树展开为链表
 *
 *  给你二叉树的根结点 root ，请你将它展开为一个单链表：
 *
 * 展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
 * 展开后的单链表应该与二叉树 先序遍历 顺序相同。
 *
 *
 *
 *
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Flatten {

    public static void main(String[] args) {

        Flatten flatten = new Flatten();


        //  创建二叉树
        BiTrees biTrees = flatten.createTree();


        // 获取根结点
        TreeNodes root = biTrees.getRoot();


        //   转换二叉树
        flatten.flatten(root);


    }


    /***
     *  创建二叉树
     * @return
     */
    public BiTrees createTree() {

        TreeNodes node3 = new TreeNodes(3);
        TreeNodes node4 = new TreeNodes(4);

        TreeNodes node2 = new TreeNodes(2, node3, node4);


        TreeNodes node6 = new TreeNodes(6);

        TreeNodes node5 = new TreeNodes(5, null, node6);

        TreeNodes node1 = new TreeNodes(1, node2, node5);

        return new BiTrees(node1);
    }


    /***
     *
     *    思路:
     *       1. 时间复杂度为O(N)
     *       2. 空间复杂度为O(N)
     *       3. 主要利用前序遍历的方式实现
     *
     * @param root
     */
    public void flatten(TreeNodes root) {

        List<TreeNodes> list = new ArrayList<>();

        preNode(root, list);

        int size = list.size();


        for (int i = 1; i < size; i++) {

            TreeNodes prev = list.get(i - 1);

            TreeNodes cur = list.get(i);

            prev.left = null;
            prev.right = cur;

        }


    }


    /***
     *   前序遍历方式
     * @param root
     * @param list
     */
    public void preNode(TreeNodes root, List<TreeNodes> list) {


        if (root != null) {
            list.add(root);
            preNode(root.left, list);
            preNode(root.right, list);
        }
    }


}
