package com.coderpwh.leetcode;

import java.util.*;

public class AverageOfLevels {

    public static void main(String[] args) {

        AverageOfLevels average = new AverageOfLevels();

        BiTrees biTrees = average.create();

        TreeNodes root = biTrees.getRoot();

        average.averageOfLevels(root);


    }


    public BiTrees create() {

        TreeNodes node15 = new TreeNodes(15);

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node20 = new TreeNodes(20, node15, node7);

        TreeNodes node9 = new TreeNodes(9);

        TreeNodes node3 = new TreeNodes(3, node9, node20);

        return new BiTrees(node3);
    }


    public List<Double> averageOfLevels(TreeNodes root) {


        List<List<Integer>> date = new ArrayList<>();


        Queue<TreeNodes> link = new LinkedList<>();


        if (root != null) {
            TreeNodes node = root;

            link.offer(node);

            List<Integer> datelist = new ArrayList<>();
            datelist.add(node.val);
            date.add(datelist);
            while (!link.isEmpty()) {
                List<Integer> list = new ArrayList<>();

                root = link.poll();

                if (root.left != null) {
                    list.add(root.left.val);
                    link.offer(root.left);
                }

                if (root.right != null) {
                    list.add(root.right.val);
                    link.offer(root.right);
                }

                if (list != null && list.size() > 0) {
                    date.add(list);
                }

            }
        }

      /*  for (List<Integer> list : date) {
            System.out.println(list);

        }*/

        List<Double> doubleList = new ArrayList<>();


        for (int i = 0; i < date.size(); i++) {

             int sum = 0;
            for (int j = 0; j < date.get(i).size(); j++) {
                sum+=date.get(i).get(j);
            }
            double range = (double) sum/date.get(i).size();
            System.out.println(range);
            doubleList.add(range);
        }




        return doubleList;
    }


}
