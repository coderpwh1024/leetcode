package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author coderpwh
 */
public class ConvertBST {

    private int sum;

    public static void main(String[] args) {

        ConvertBST bst = new ConvertBST();

        BiTrees biTrees = bst.create();

        TreeNodes root = biTrees.getRoot();

        bst.convertBST(root);

        List<Integer> list = new ArrayList<>();
        bst.mid(root, list);


        System.out.println();
        Integer sum = list.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);


    }

    public BiTrees create() {

        TreeNodes node8 = new TreeNodes(8);

        TreeNodes node7 = new TreeNodes(7, null, node8);

        TreeNodes node5 = new TreeNodes(5);

        TreeNodes node6 = new TreeNodes(6, node5, node7);

        TreeNodes node3 = new TreeNodes(3);

        TreeNodes node2 = new TreeNodes(2, null, node3);

        TreeNodes node0 = new TreeNodes(0);

        TreeNodes node1 = new TreeNodes(1, node0, node2);

        TreeNodes node4 = new TreeNodes(4, node1, node6);

        return new BiTrees(node4);
    }


    public TreeNodes convertBST(TreeNodes root) {

        int sum = 0;

        convertValue(root);

        return root;
    }

    public void convertValue(TreeNodes root) {
        if (root == null) {
            return;
        }
        convertValue(root.right);
        sum += root.val;
        root.val = sum;
        convertValue(root.left);
    }


    public void mid(TreeNodes root, List<Integer> list) {

        if (root != null) {
            mid(root.left, list);
            System.out.print(root.val);
            System.out.print(" ");
            list.add(root.val);
            mid(root.right, list);
        }
    }


}
