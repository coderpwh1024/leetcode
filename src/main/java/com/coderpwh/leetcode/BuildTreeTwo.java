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


        System.out.println("前序遍历:");
        preNode(root);
        System.out.println();


        System.out.println("中序遍历:");
        inNode(root);
        System.out.println();

        System.out.println("后序遍历:");
        postNode(root);
        System.out.println();


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


    /***
     *
     *  前序遍历
     * @param root
     */
    public void preNode(TreeNodes root) {

        if (root != null) {
            System.out.print(root.val);
            System.out.print("  ");
            preNode(root.left);
            preNode(root.right);
        }

    }


    /***
     * 中序遍历
     * @param root
     */
    public void inNode(TreeNodes root) {

        if (root != null) {
            inNode(root.left);
            System.out.print(root.val);
            System.out.print("  ");
            inNode(root.right);
        }
    }


    /***
     * 后序遍历
     * @param root
     */
    public void postNode(TreeNodes root) {

        if (root != null) {

            postNode(root.left);
            postNode(root.right);

            System.out.print(root.val);
            System.out.print("  ");
        }

    }


}
