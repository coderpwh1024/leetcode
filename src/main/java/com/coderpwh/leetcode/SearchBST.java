package com.coderpwh.leetcode;

/***
 *  700 二叉树搜索树种的值
 *
 * 给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
 *
 * 例如，
 *
 * 给定二叉搜索树:
 *
 *         4
 *        / \
 *       2   7
 *      / \
 *     1   3
 *
 * 和值: 2
 * 你应该返回如下子树:
 *
 *       2
 *      / \
 *     1   3
 *
 *
 */
public class SearchBST {

    public static void main(String[] args) {


        String val = "2";

        SearchBST bst = new SearchBST();

        // 创建二叉树
        BiTree biTree = bst.createTree();

        // 获取根结点
        TreeNode root = biTree.getRoot();


        //  搜索二叉树上的值
        TreeNode node = bst.searchBST(root, val);

        System.out.println(node.val);

        System.out.println(node.left.val);

        System.out.println(node.right.val);


    }


    /**
     * 创建二叉树
     *
     * @return
     */
    public BiTree createTree() {


        TreeNode node1 = new TreeNode("1");
        TreeNode node3 = new TreeNode("3");

        TreeNode node2 = new TreeNode("2", node1, node3);

        TreeNode node7 = new TreeNode("7");

        TreeNode node4 = new TreeNode("4", node2, node7);

        return new BiTree(node4);


    }


    /***
     *     思路:
     *        1. 时间复杂度为O(N)
     *        2. 空间复杂度为O(1)
     *        3. 递归对左右结点进行遍历实现
     *
     *
     * @param root
     * @param val
     * @return
     */
    public TreeNode searchBST(TreeNode root, String val) {


        if (root == null) {
            return root;
        }

        if (root.val.equals(val)) {
            return root;
        } else {
            TreeNode leftNode = searchBST(root.left, val);

            return leftNode == null ? searchBST(root.right, val) : leftNode;
        }
    }


}
