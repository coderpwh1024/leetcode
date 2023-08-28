package com.coderpwh.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 「力扣挑战赛」开幕式开始了，空中绽放了一颗二叉树形的巨型焰火。
 * 给定一棵二叉树 root 代表焰火，节点值表示巨型焰火这一位置的颜色种类。
 * 请帮小扣计算巨型焰火有多少种不同的颜色。
 *
 * @author coderpwh
 * @date 2023/8/25 17:10
 */
public class OpenFileBST {

    public static void main(String[] args) {
        OpenFileBST bst = new OpenFileBST();
        // 创建二叉树
        TreeNode node = bst.createTreeNode();

        Integer result = bst.numColor(node);
        System.out.println(result);
    }


    /***
     * 创建二叉树
     * @return
     */
    public TreeNode createTreeNode() {
        TreeNode node31 = new TreeNode("1");
        TreeNode node21 = new TreeNode("1");

        TreeNode node3 = new TreeNode("3", node31, null);

        TreeNode node2 = new TreeNode("2", node21, null);

        TreeNode node1 = new TreeNode("1", node3, node2);
        return node1;
    }


    /***
     *
     * @param root
     * @return
     */
    public int numColor(TreeNode root) {
        Set<Integer> set = new HashSet<>();
        Integer result = getNum(root, set);
        return result;
    }


    public int getNum(TreeNode root, Set<Integer> set) {
        if (root != null) {
            set.add(Integer.valueOf(root.val));
            getNum(root.left, set);
            getNum(root.right, set);
        }
        return set.size();
    }

}
