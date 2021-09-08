package com.coderpwh.leetcode;

public class BuildTree {

    public static void main(String[] args) {


        int[] preorder = {3, 9, 20, 15, 7};

        int[] inorder = {9, 3, 15, 20, 7};

        BuildTree tree = new BuildTree();
        tree.buildTree(preorder, inorder);


    }


    public TreeNodes buildTree(int[] preorder, int[] inorder) {


        TreeNodes root = build(preorder, inorder, 0, 0, preorder.length);

        printNode(root);


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

    public void printNode(TreeNodes root) {

        if (root != null) {
            printNode(root.left);
            printNode(root.right);
            System.out.print(root.val);
            System.out.print(" ");
        }

    }


}
