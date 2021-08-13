 package com.coderpwh.leetcode;

public class IsValidBST {

    public static void main(String[] args) {

        IsValidBST bst = new IsValidBST();

        BiTrees biTrees = bst.create2();

        TreeNodes root = biTrees.getRoot();

//        bst.isValiBST();

        System.out.println(bst.isValiBST(root));

    }


    /***
     *   创建二叉树
     *
     * @return
     */
    public BiTrees create() {

        TreeNodes node1 = new TreeNodes(1);
        TreeNodes node2 = new TreeNodes(3);

        TreeNodes node3 = new TreeNodes(2, node1, node2);

        return new BiTrees(node3);
    }


    /***
     *
     *  创建二叉树
     *
     * @return
     */
    public BiTrees create2() {

        TreeNodes node3 = new TreeNodes(3);
        TreeNodes node6 = new TreeNodes(6);

        TreeNodes node4 = new TreeNodes(4, node3, node6);

        TreeNodes node1 = new TreeNodes(1);


        TreeNodes node5 = new TreeNodes(5, node1, node4);

        return new BiTrees(node5);


    }


    public boolean isValiBST(TreeNodes root) {

        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }


    /***
     *
     *    思路:
     *       1.时间复杂度为O(N)
     *       2. 空间复杂度为O(N)
     *       3. 递归方式实现，分别用long 类型的最大值与最小值来判断
     *          左子树上的结点必须小于根结点，遍历左子时，最大值是root.val
     *          同理遍历右子树时，最小值是root.val
     *
     *
     * @param root
     * @param lower
     * @param upper
     * @return
     */
    public boolean check(TreeNodes root, long lower, long upper) {

        if (root == null) {
            return true;
        }

        if (root.val <= lower || root.val >= upper) {
            return false;
        }

        return check(root.left, lower, root.val) && check(root.right, root.val, upper);

    }


}
