package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SumNumbers {

    public static void main(String[] args) {

        SumNumbers sum = new SumNumbers();

        BiTrees biTrees = sum.create();

        TreeNodes root = biTrees.getRoot();

        sum.sumNumbers(root);

        System.out.println(sum.sumNumbers(root));


    }


    public BiTrees create() {

        TreeNodes node2 = new TreeNodes(2);

        TreeNodes node3 = new TreeNodes(3);

        TreeNodes node1 = new TreeNodes(1, node2, node3);

        return new BiTrees(node1);
    }


    public int sumNumbers(TreeNodes root) {

        List<Integer> list = new ArrayList<>();

        preNode(root, list);

        int sum = 0;

        if (list != null && list.size() > 0) {

            for (int i = 1; i < list.size(); i++) {

                Integer number = list.get(0) * 10 + list.get(i);
                sum += number;

            }
        }

        return sum;


    }


    public void preNode(TreeNodes root, List<Integer> list) {

        if (root != null) {
            list.add(root.val);
            preNode(root.left, list);
            preNode(root.right, list);
        }

    }

}
