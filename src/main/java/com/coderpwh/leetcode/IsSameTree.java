package com.coderpwh.leetcode;

public class IsSameTree {

    public static void main(String[] args) {

    }

    public boolean isSameTree(TreeNodes p, TreeNodes q) {

        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null) {

            if (isSameTree(p.left, q.left)) {
                if (p.val.equals(q.val)) {
                    if (isSameTree(p.right, q.right)) {

                        return true;
                    }
                }
            }

        }
        return false;
    }

}
