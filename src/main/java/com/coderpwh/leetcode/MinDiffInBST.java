package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MinDiffInBST {

    public static void main(String[] args) {

        MinDiffInBST min = new MinDiffInBST();

        BiTrees biTrees = min.create();

        TreeNodes root = biTrees.getRoot();

        min.minDiffInBST(root);

        System.out.println(min.minDiffInBST(root));


    }


    public BiTrees create() {

        TreeNodes node1 = new TreeNodes(1);

        TreeNodes node3 = new TreeNodes(3);

        TreeNodes node2 = new TreeNodes(2, node1, node3);

        TreeNodes node6 = new TreeNodes(6);

        TreeNodes node4 = new TreeNodes(4, node2, node6);

        return new BiTrees(node4);


    }


    public int minDiffInBST(TreeNodes root) {


        List<Integer> list = new ArrayList<>();

        midPrint(root, list);

        Integer min = Integer.MAX_VALUE;

        if (list != null) {


            for (int i = 0; i < list.size() - 1; i++) {

                min = Math.min(min, Math.abs(list.get(i) - list.get(i + 1)));
            }
        }

        return min;


    }

    public void midPrint(TreeNodes root, List<Integer> list) {

        if (root != null) {
            midPrint(root.left, list);
            list.add(root.val);
            midPrint(root.right, list);

        }
    }


}
