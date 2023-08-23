package com.coderpwh.leetcode;


import java.util.List;

/****
 *  701 二叉搜索树中的插入操作
 *
 * 给定二叉搜索树（BST）的根节点和要插入树中的值，将值插入二叉搜索树。 返回插入后二叉搜索树的根节点。 输入数据 保证 ，新值和原始二叉搜索树中的任意节点值都不同。
 *
 * 注意，可能存在多种有效的插入方式，只要树在插入后仍保持为二叉搜索树即可。 你可以返回 任意有效的结果 。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：root = [4,2,7,1,3], val = 5
 * 输出：[4,2,7,1,3,5]
 * 解释：另一个满足题目要求可以通过的树是：
 *
 * 示例 2：
 *
 * 输入：root = [40,20,60,10,30,50,70], val = 25
 * 输出：[40,20,60,10,30,50,70,null,null,25]
 * 示例 3：
 *
 * 输入：root = [4,2,7,1,3,null,null,null,null,null,null], val = 5
 * 输出：[4,2,7,1,3,5]
 *
 *
 *
 */
public class InsertIntoBST {

    public static void main(String[] args) {

        int val = 5;

        InsertIntoBST insertIntoBST = new InsertIntoBST();

        // 创建二叉树
        BiTrees biTrees = insertIntoBST.create();


        // 插入对应的值
//        insertIntoBST.insertIntoBST(biTrees.getRoot(), val);


        // 前根遍历(42137)
//        insertIntoBST.preNode(biTrees.getRoot());


        // 中根遍历(21347)
//        insertIntoBST.midNode(biTrees.getRoot());


        // 后根遍历(21374)
        insertIntoBST.afterNode(biTrees.getRoot());


    }


    /***
     *
     *   创建二叉树
     *
     * @return
     */
    public BiTrees create() {

        TreeNodes node1 = new TreeNodes(1);

        TreeNodes node3 = new TreeNodes(3);

        TreeNodes node2 = new TreeNodes(2, node1, node3);

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node4 = new TreeNodes(4, node2, node7);

        return new BiTrees(node4);


    }


    /***
     *    思路:
     *      1. 时间复杂度为O(N)
     *      2. 空间复杂度为O(1)
     *
     * @param root
     * @param val
     * @return
     */
    public TreeNodes insertIntoBST(TreeNodes root, int val) {

        if (root == null) {
            return new TreeNodes(val);
        }

        TreeNodes node = root;

        while (node != null) {

            if (val < node.val) {

                if (node.left == null) {
                    node.left = new TreeNodes(val);
                    break;
                } else {
                    node = node.left;
                }
            } else {

                if (node.right == null) {
                    node.right = new TreeNodes(val);
                    break;
                } else {
                    node = node.right;
                }
            }
        }
        return root;
    }


    /***
     * 前序遍历(根-->左-->右)
     * @param node
     */
    public void preNode(TreeNodes node) {
        if (node != null) {
            System.out.println(node.val);
            preNode(node.left);
            preNode(node.right);
        }
    }


    /***
     * 中序遍历(左-->根-->右)
     * @param node
     */
    public void midNode(TreeNodes node) {
        if (node != null) {
            preNode(node.left);
            System.out.println(node.val);
            preNode(node.right);
        }
    }


    /***
     * 后序遍历（左-->右-->根）
     * @param node
     */
    public void afterNode(TreeNodes node) {
        if (node != null) {
            preNode(node.left);
            preNode(node.right);
            System.out.println(node.val);
        }
    }


}
