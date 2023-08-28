package com.coderpwh.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * 95. 不同的二叉搜索树 II
 *
 * @author coderpwh
 * @date 2023/8/28 14:21
 */
public class SerarchTree {


    public static void main(String[] args) {

        int n = 1;

        SerarchTree tree = new SerarchTree();
        List<TreeNode> list = tree.generateTrees(n);

        if (list != null && list.size() > 0) {
            for (TreeNode node : list) {
                tree.mid(node);
                System.out.println("-------------------------");
            }
        }

    }


    /***
     * 二叉搜索树特点(左<根<右)
     * 中序遍历按从小到大排序
     *
     * @param
     * @return
     */
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new LinkedList<TreeNode>();
        }
        List<TreeNode> list = getTrees(1, n);
        System.out.println(list.size());
        return list;
    }

    public List<TreeNode> getTrees(int start, int end) {
        List<TreeNode> list = new LinkedList<>();
        if (start > end) {
            list.add(null);
            return list;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> leftNode = getTrees(start, i - 1);
            List<TreeNode> rightNode = getTrees(i + 1, end);
            for (TreeNode leftRoot : leftNode) {
                for (TreeNode rightRoot : rightNode) {
                    TreeNode node = new TreeNode(i + "");
                    node.left = leftRoot;
                    node.right = rightRoot;
                    list.add(node);
                }
            }
        }
        return list;
    }


    /***
     * 中序遍历
     * @param root
     */
    public void mid(TreeNode root) {
        if (root != null) {
            mid(root.left);
            System.out.println(root.val);
            mid(root.right);
        }
    }
}
