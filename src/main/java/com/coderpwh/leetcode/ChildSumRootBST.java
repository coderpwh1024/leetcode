package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 2236
 * 给你一个 二叉树 的根结点 root，该二叉树由恰好 3 个结点组成：根结点、左子结点和右子结点。
 * 如果根结点值等于两个子结点值之和，返回 true ，否则返回 false 。
 * 输入：root = [10,4,6]
 * 输出：true
 * 解释：根结点、左子结点和右子结点的值分别是 10 、4 和 6 。
 *
 * @author coderpwh
 * @date 2023/8/24 16:24
 */
public class ChildSumRootBST {

    public static void main(String[] args) {

        ChildSumRootBST bst = new ChildSumRootBST();
        TreeNode node = bst.createTreeNode();

        Boolean flag = bst.checkTree(node);
        System.out.println(flag);
    }


    public TreeNode createTreeNode() {
        TreeNode node4 = new TreeNode("4");

        TreeNode node6 = new TreeNode("6");

        TreeNode node10 = new TreeNode("11", node4, node6);

        return node10;
    }


    public boolean checkTree(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        pre(root, list);
        if (list != null && list.size() > 0) {
            Integer index = list.get(0);
            Integer total = 0;
            for (int i = 0; i <= list.size() - 1; i++) {
                total += list.get(i);
            }
            if (total - index == index) {
                return true;
            }
        }
        return false;
    }

    public void pre(TreeNode root, List<Integer> list) {

        if (root != null) {
            list.add(Integer.valueOf(root.val));
            pre(root.left, list);
            pre(root.right, list);
        }
    }

}
