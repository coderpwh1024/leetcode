package com.coderpwh.leetcode;

public class BuildTreeTwo {

    public static void main(String[] args) {


        int[] inOrder = {9, 3, 15, 20, 7};
        int[] postOrder = {9, 15, 7, 20, 3};

        BuildTreeTwo tree = new BuildTreeTwo();

        tree.buildTree(inOrder, postOrder);

    }


    public TreeNodes buildTree(int[] inorder, int[] postorder) {


        TreeNodes root = tree(inorder, postorder, inorder.length - 1, postorder.length - 1, postorder.length);


        return root;
    }


    /***
     *    思路:
     *       1.时间复杂度为O(N)
     *       2.空间复杂度为O(N)
     * @param inOrder
     * @param postOrder
     * @param inIndex
     * @param postIndex
     * @param count
     * @return
     */
    public TreeNodes tree(int[] inOrder, int[] postOrder, int inIndex, int postIndex, int count) {


        if (count > 0) {

            int number = postOrder[postIndex];

            int i = 0;

            for (; i < count; i++) {

                if (number == inOrder[inIndex - i]) {
                    break;
                }
            }

            TreeNodes root = new TreeNodes(number);

            root.left = tree(inOrder, postOrder, inIndex - i - 1, postIndex - i - 1, count - i - 1);

            root.right = tree(inOrder, postOrder, inIndex, postIndex - 1, i);

            return root;

        }
        
        return null;

    }


}
