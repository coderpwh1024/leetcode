package com.coderpwh.leetcode;

import javax.transaction.TransactionRequiredException;
import java.util.HashSet;
import java.util.Set;

public class FindTarget {

    public static void main(String[] args) {


        int k = 9;

        FindTarget find = new FindTarget();

        BiTrees biTrees = find.create();

        TreeNodes root = biTrees.getRoot();

        System.out.println(find.findTarget(root, k));


    }


    public BiTrees create() {

        TreeNodes node4 = new TreeNodes(4);
        TreeNodes node2 = new TreeNodes(2);

        TreeNodes node3 = new TreeNodes(3, node2, node4);

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node6 = new TreeNodes(6, null, node7);

        TreeNodes node5 = new TreeNodes(5, node3, node6);

        return new BiTrees(node5);

    }


    public boolean findTarget(TreeNodes root, int k) {

        if (root == null) {
            return false;
        }

        Set<Integer> set = new HashSet<>();


        return pre(root, set, k);
    }


    public boolean pre(TreeNodes root, Set<Integer> set, int k) {

        if (root == null) {
            return false;
        }


        if (set.contains(k - root.val)) {
            return true;
        }

        set.add(root.val);

        return pre(root.left, set, k) || pre(root.right, set, k);
    }


}
