package com.coderpwh.leetcode;

public class IsValidBST {

    public static void main(String[] args) {

        IsValidBST bst = new IsValidBST();

        BiTrees biTrees = bst.create();

        TreeNodes root = biTrees.getRoot();

//        bst.isValiBST();

        System.out.println(bst.isValiBST(root));

    }


    public BiTrees create() {

        TreeNodes node1 = new TreeNodes(1);
        TreeNodes node2 = new TreeNodes(3);

        TreeNodes node3 = new TreeNodes(2, node1, node2);

        return new BiTrees(node3);
    }


    public boolean isValiBST(TreeNodes root) {


        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }


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
