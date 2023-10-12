package com.coderpwh.leetcode;

/**
 * LCR 194. 二叉树的最近公共祖先
 * <p>
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 * <p>
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，
 * 满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 * <p>
 * 例如，给定如下二叉树:  root = [3,5,1,6,2,0,8,null,null,7,4]
 *
 * @author coderpwh
 * @date 2023/10/12 9:57
 */
public class LowestCommonAncestorTwo {

    public static void main(String[] args) {

        LowestCommonAncestorTwo common = new LowestCommonAncestorTwo();

        // 创建二叉树
        TreeNode root = common.createTreeNode();

        int p = 5;
        int q = 1;

         // 构建节点
        TreeNode pNode = common.getTreeNodeB(p);
        TreeNode qNode = common.getTreeNodeB(q);

        TreeNode node = common.lowestCommonAncestor(root, pNode, qNode);

        TreeNode treeNode = common.lowestCommonAncestors(root, pNode, qNode);

        System.out.println(node.val);

        System.out.println(treeNode.val);

    }


    /***
     *  获取二叉树
     * @param n
     * @return
     */
    public TreeNode getTreeNodeB(int n) {
        TreeNode node = new TreeNode(n + "");
        return node;
    }


    /***
     * 创建二叉树
     * @return
     */
    public TreeNode createTreeNode() {
        TreeNode node7 = new TreeNode("7");
        TreeNode node4 = new TreeNode("4");

        TreeNode node2 = new TreeNode("2", node7, node4);

        TreeNode node6 = new TreeNode("6");

        TreeNode node5 = new TreeNode("5", node6, node2);

        TreeNode node8 = new TreeNode("8");
        TreeNode node0 = new TreeNode("0");

        TreeNode node1 = new TreeNode("1", node0, node8);

        TreeNode root = new TreeNode("3", node5, node1);

        return root;
    }


    /***
     * 最近公共祖先
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode node = root;

        while (true) {
            if (Integer.valueOf(p.val) > Integer.valueOf(node.val) && Integer.valueOf(q.val) > Integer.valueOf(node.val)) {
                node = node.right;
            } else if (Integer.valueOf(p.val) < Integer.valueOf(node.val) && Integer.valueOf(q.val) < Integer.valueOf(node.val)) {
                node = node.left;
            } else {
                break;
            }

        }

        return node;
    }


    /***
     *  1. 时间复杂度为O(N)
     *  2. 空间复杂度为O(1)
     *  3. 递归方式
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestors(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null || p == root || q == root) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        return left == null ? right : (right == null ? left : root);
    }
}
