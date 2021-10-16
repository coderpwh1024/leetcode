package com.coderpwh.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author coderpwh
 */
public class FindTilt {

    public static void main(String[] args) {

        FindTilt find = new FindTilt();

        BiTrees biTrees = find.create();

        TreeNodes root = biTrees.getRoot();

        find.pre(root);

    }


    public BiTrees create() {

        TreeNodes node3 = new TreeNodes(3);

        TreeNodes node5 = new TreeNodes(5);

        TreeNodes node2 = new TreeNodes(2, node3, node5);

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node9 = new TreeNodes(9, null, node7);

        TreeNodes node4 = new TreeNodes(4, node2, node9);

        return new BiTrees(node4);
    }


    public int findTilt(TreeNodes root) {

        if (root == null) {
            return 0;
        }

        Deque<TreeNodes> deque = new LinkedList<>();
        deque.offer(root);

        while (!deque.isEmpty()) {

            int size = deque.size();

            for (int i = 0; i < size; i++) {
                TreeNodes node = deque.poll();
            }

        }


        return 0;
    }


    public void pre(TreeNodes root) {

        if (root != null) {
            System.out.print(root.val);
            System.out.print(" ");
            pre(root.left);
            pre(root.right);

        }
    }

}
