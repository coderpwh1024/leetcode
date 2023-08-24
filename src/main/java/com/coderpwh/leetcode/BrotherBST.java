package com.coderpwh.leetcode;

/**
 * 993. 二叉树的堂兄弟节点
 * <p>
 * 在二叉树中，根节点位于深度 0 处，每个深度为 k 的节点的子节点位于深度 k+1 处。
 * <p>
 * 如果二叉树的两个节点深度相同，但 父节点不同 ，则它们是一对堂兄弟节点。
 * <p>
 * 我们给出了具有唯一值的二叉树的根节点 root ，以及树中两个不同节点的值 x 和 y 。
 * <p>
 * 只有与值 x 和 y 对应的节点是堂兄弟节点时，才返回 true 。否则，返回 false。
 *
 * @author coderpwh
 * @date 2023/8/23 15:29
 */
public class BrotherBST {

    public static void main(String[] args) {
        BrotherBST bst = new BrotherBST();
        TreeNode node = bst.createTreeNode();

        int x = 5;
        int y = 4;

 /*       Boolean flag = bst.isCousins(node, x, y);
        System.out.println(flag);*/

        int x1 = 4;
        int y1 = 3;
        TreeNode node2 = bst.creawteTreeNod2();
        Boolean flag2 = bst.isCousins(node2, x1, y1);
        System.out.println(flag2);


    }


    /***
     *
     * 创建根节点
     * @return
     */
    public TreeNode createTreeNode() {
        TreeNode node4 = new TreeNode("4");

        TreeNode node2 = new TreeNode("2", null, node4);

        TreeNode node5 = new TreeNode("5");
        TreeNode node3 = new TreeNode("3", null, node5);

        TreeNode node = new TreeNode("1", node2, node3);
        return node;
    }

    public TreeNode creawteTreeNod2() {
        TreeNode node4 = new TreeNode("4");

        TreeNode node2 = new TreeNode("2", null, node4);

        TreeNode node3 = new TreeNode("3");

        TreeNode node = new TreeNode("1", node2, node3);
        return node;
    }


    /***
     *       1
     *
     *  2        3
     *
     *    4         5
     *
     *  true
     * @param root
     * @param x
     * @param y
     * @return
     */
    public boolean isCousins(TreeNode root, int x, int y) {
        int k1 = 0;
        int k2 = 0;

        if (root != null) {
            isCousins(root.left, x, y);
            isCousins(root.right, x, y);
        }

        if (k1 == k2 && k1 != 0 && k2 != 0) {
            System.out.println(k1);
            System.out.println(k2);
            return true;
        }
        return false;
    }


}
