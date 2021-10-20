package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author coderpwh
 */
public class GetAllElements {

    public static void main(String[] args) {

        GetAllElements all = new GetAllElements();

        BiTrees biTrees = all.create();

        TreeNodes node1 = biTrees.getRoot();

        BiTrees biTrees2 = all.create2();

        TreeNodes node2 = biTrees2.getRoot();

        List<Integer> list = all.getAllElements(node1, node2);

        if (list != null && list.size() >= 0) {

            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
                System.out.print(" ");
            }
        }

    }

    public BiTrees create() {

        TreeNodes node1 = new TreeNodes(1);

        TreeNodes node4 = new TreeNodes(4);

        TreeNodes node2 = new TreeNodes(2, node1, node4);

        return new BiTrees(node2);
    }


    public BiTrees create2() {

        TreeNodes node0 = new TreeNodes(0);

        TreeNodes node3 = new TreeNodes(3);

        TreeNodes node1 = new TreeNodes(1, node0, node3);

        return new BiTrees(node1);
    }


    /***
     *
     *
     * @param root1
     * @param root2
     * @return
     */
    public List<Integer> getAllElements(TreeNodes root1, TreeNodes root2) {

        List<Integer> list = new ArrayList<>();

        mid(root1, list);

        mid(root2, list);

        list.sort(Comparator.naturalOrder());

        return list;

    }


    public void mid(TreeNodes root, List<Integer> list) {

        if (root != null) {
            mid(root.left, list);
            list.add(root.val);
            mid(root.right, list);
        }
    }


}
