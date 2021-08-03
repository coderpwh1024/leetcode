package com.coderpwh.leetcode;

public class IsSymmetric {

    public static void main(String[] args) {


        IsSymmetric isSymmetric = new IsSymmetric();
        BiTree root = isSymmetric.createBTree();

//        isSymmetric.isSymmetric(root.getRoot());

        System.out.println(isSymmetric.isSymmetric(root.getRoot()));


    }


    public BiTree createBTree() {

        TreeNode node7 = new TreeNode(3);
        TreeNode node6 = new TreeNode(4);

        TreeNode node3 = new TreeNode(2, node6, node7);

        TreeNode node5 = new TreeNode(4);
        TreeNode node4 = new TreeNode(3);

        TreeNode node2 = new TreeNode(2, node4, node5);

        TreeNode node1 = new TreeNode(1, node2, node3);


        return new BiTree(node1);

    }

    public boolean isSymmetric(TreeNode root) {


        boolean flag = check(root, root);


        return flag;
    }


    /***
     *   思路:
     *       1.时间复杂度为O(N)
     *       2.空间复杂度为O(N)
     *       3.利用递归方式
     * @param p
     * @param q
     * @return
     */
    public boolean check(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }


}
