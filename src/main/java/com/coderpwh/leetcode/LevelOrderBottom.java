package com.coderpwh.leetcode;

import java.util.*;

public class LevelOrderBottom {

    public static void main(String[] args) {


    }


    public List<List<Integer>> levelOrderBottom(TreeNodes root) {

        List<List<Integer>> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        Queue<TreeNodes> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {

            List<Integer> date = new ArrayList<>();

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                TreeNodes node = queue.poll();
                date.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            list.add(date);

        }

        Collections.reverse(list);
        return list;
    }

}
