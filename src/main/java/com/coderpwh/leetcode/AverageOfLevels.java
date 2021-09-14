package com.coderpwh.leetcode;

import java.util.*;

public class AverageOfLevels {

    public static void main(String[] args) {

        AverageOfLevels average = new AverageOfLevels();

        BiTrees biTrees = average.create();

        TreeNodes root = biTrees.getRoot();

        average.averageOfLevels(root);

        average.test(root);


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


        List<List<Double>> date = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();

        Queue<TreeNodes> link = new LinkedList<>();


        if (root != null) {
            TreeNodes node = root;

            link.offer(node);

            List<Double> datelist = new ArrayList<>();
            datelist.add(1.0 * node.val);
            date.add(datelist);
            while (!link.isEmpty()) {
                List<Double> list = new ArrayList<>();

                root = link.poll();

                if (root.left != null) {
                    list.add(1.0 * root.left.val);
                    link.offer(root.left);
                }

                if (root.right != null) {
                    list.add(1.0 * root.right.val);
                    link.offer(root.right);
                }

                if (list != null && list.size() > 0) {
                    date.add(list);
                }

            }
        }


        for (int i = 0; i < date.size(); i++) {

            int sum = 0;
            for (int j = 0; j < date.get(i).size(); j++) {
                sum += date.get(i).get(j);
            }
            double range = (double) sum / date.get(i).size();
            System.out.println(range);
            doubleList.add(range);
        }

        return doubleList;
    }


    /***
     *
     *    思路:
     *      1. 时间复杂度为O(N)
     *      2. 空间复杂度为O(N)
     *      3. 利用队列对二叉树层次遍历并计算其平均值
     *
     *
     * @param root
     * @return
     */
    public List<Double> test(TreeNodes root) {

        List<Double> doubleList = new ArrayList<>();

        Queue<TreeNodes> link = new LinkedList<>();


        link.offer(root);
        while (!link.isEmpty()) {


            int size = link.size();

            double sum = 0;
            for (int i = 0; i < size; i++) {


                root = link.poll();

                sum += root.val;

                if (root.left != null) {
                    link.offer(root.left);
                }

                if (root.right != null) {
                    link.offer(root.right);
                }
            }
            doubleList.add(sum / size);
        }
        return doubleList;
    }


}
