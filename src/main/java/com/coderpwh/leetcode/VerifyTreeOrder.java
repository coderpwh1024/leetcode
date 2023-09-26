package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * LCR 152. 验证二叉搜索树的后序遍历序列
 * 请实现一个函数来判断整数数组 postorder 是否为二叉搜索树的后序遍历结果。
 * 输入: postorder = [4,9,6,9,8]
 * 输出: false
 * 解释：从上图可以看出这不是一颗二叉搜索树
 *
 * @author coderpwh
 * @date 2023/9/25 16:50
 */
public class VerifyTreeOrder {

    public static void main(String[] args) {
        VerifyTreeOrder treeOrder = new VerifyTreeOrder();

        // 创建二叉树
        TreeNode treeNode = treeOrder.createTreeNode();
        //  打印
        treeOrder.print(treeNode);
        System.out.println();
        int arr[] = {4, 9, 6, 9, 8};

        int arr2[] = {4, 6, 5, 9, 8};


        // 校验二叉树
  /*      Boolean flag = treeOrder.verifyTreeOrder(arr, treeNode);
        System.out.println(flag);*/

        System.out.println("-------------------------------");

        Boolean recountFlag = treeOrder.verifyTreeOrder(arr2);
        System.out.println(recountFlag);

    }


    /***
     * 创建二叉树
     * @return
     */
    public TreeNode createTreeNode() {
        TreeNode node4 = new TreeNode("4");
        TreeNode node9 = new TreeNode("9");

        TreeNode node6 = new TreeNode("6", node4, node9);
        TreeNode node99 = new TreeNode("9");

        TreeNode node = new TreeNode("8", node6, node99);
        return node;
    }


    /***
     * 翻转
     * @param postorder
     * @return
     */
    public boolean verifyTreeOrder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }

    public boolean recur(int[] postorder, int i, int j) {
        if (i >= j) {
            return true;
        }
        int p = i;
        while (postorder[p] < postorder[j]) {
            p++;
        }
        int m = p;
        while (postorder[p] > postorder[j]) {
            p++;
        }

        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }


    /***
     *  后置排序
     * @param postorder
     * @param treeNode
     * @return
     */
    public boolean verifyTreeOrder(int[] postorder, TreeNode treeNode) {
        List<Integer> list = new ArrayList<>();
        printByList(treeNode, list);
        if (list != null && list.size() > 0) {
            for (int i = 0, j = 0; i < postorder.length && j < list.size(); i++, j++) {
                if (postorder[i] != list.get(j)) {
                    return false;
                }
            }
        }
        return true;
    }


    public void printByList(TreeNode treeNode, List<Integer> list) {

        if (treeNode != null) {
            print(treeNode.left);
            print(treeNode.right);
            System.out.print(treeNode.val + "  ");
            list.add(Integer.valueOf(treeNode.val));
        }

    }


    /***
     *  1. 前序遍历(先根,左，右)
     *  2. 中序遍历(先左，中，右)
     *  3. 后续遍历(左，右，中)
     *  后续遍历
     * @param treeNode
     */
    public void print(TreeNode treeNode) {
        if (treeNode != null) {
            print(treeNode.left);
            print(treeNode.right);
            System.out.print(treeNode.val + "  ");
        }
    }


}
