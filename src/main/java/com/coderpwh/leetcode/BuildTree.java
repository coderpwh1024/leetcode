package com.coderpwh.leetcode;


/***
 *
 * 105. 从前序与中序遍历序列构造二叉树
 * 给定一棵树的前序遍历 preorder 与中序遍历  inorder。请构造二叉树并返回其根节点。
 *
 *  
 *
 * 示例 1:
 *
 *
 * Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
 * Output: [3,9,20,null,null,15,7]
 * 示例 2:
 *
 * Input: preorder = [-1], inorder = [-1]
 * Output: [-1]
 *
 *
 */
public class BuildTree {

    public static void main(String[] args) {


        int[] preorder = {3, 9, 20, 15, 7};

        int[] inorder = {9, 3, 15, 20, 7};

        BuildTree tree = new BuildTree();

        tree.buildTree(preorder, inorder);


    }


    public TreeNodes buildTree(int[] preorder, int[] inorder) {


        TreeNodes root = build(preorder, inorder, 0, 0, preorder.length);

        System.out.println("前序打印:");
        // 前序打印
        preNode(root);
        System.out.println();


        System.out.println("中序遍历:");
        // 中序打印
        inNode(root);
        System.out.println();


        System.out.println("后序遍历:");
        // 后序打印
        postNode(root);
        System.out.println();


        return root;

    }


    /***
     *     思路:
     *        1.时间复杂度为O(N)
     *        2.空间复杂度为O(N)
     *        3.利用递归方式实现
     *
     * @param preOrder
     * @param inOrder
     * @param preIndex
     * @param inIndex
     * @param count
     * @return
     */
    public TreeNodes build(int[] preOrder, int[] inOrder, int preIndex, int inIndex, int count) {


        if (count > 0) {

            int number = preOrder[preIndex];

            int i = 0;
            for (; i < count; i++) {
                if (number == inOrder[inIndex + i]) {
                    break;
                }
            }

            TreeNodes root = new TreeNodes(number);

            root.left = build(preOrder, inOrder, preIndex + 1, inIndex, i);

            root.right = build(preOrder, inOrder, preIndex + i + 1, inIndex + i + 1, count - 1 - i);


            return root;
        }


        return null;
    }


    /***
     * 后序遍历打印
     * @param root
     */
    public void preNode(TreeNodes root) {
        if (root != null) {
            System.out.print(root.val);
            System.out.print(" ");
            preNode(root.left);
            preNode(root.right);
        }
    }


    /***
     * 中序遍历打印
     * @param root
     */
    public void inNode(TreeNodes root) {

        if (root != null) {
            inNode(root.left);
            System.out.print(root.val);
            System.out.print(" ");
            inNode(root.right);
        }
    }


    /**
     * 后序遍历打印
     *
     * @param root
     */
    public void postNode(TreeNodes root) {

        if (root != null) {
            postNode(root.left);
            postNode(root.right);
            System.out.print(root.val);
            System.out.print(" ");
        }

    }


}
