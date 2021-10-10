 package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author coderpwh
 */
public class LargestValues {

    public static void main(String[] args) {

        LargestValues values = new LargestValues();

        BiTrees biTrees = values.create();

        TreeNodes root = biTrees.getRoot();

        values.largestValues(root);

    }


    public BiTrees create() {

        TreeNodes node5 = new TreeNodes(5);

        TreeNodes node3 = new TreeNodes(3);

        TreeNodes node33 = new TreeNodes(3, node5, node3);

        TreeNodes node9 = new TreeNodes(9);

        TreeNodes node2 = new TreeNodes(2, null, node9);

        TreeNodes root = new TreeNodes(1, node33, node2);

        return new BiTrees(root);
    }


    /***
     *   思路:
     *       1.时间复杂度为O(N^2)
     *       2. 空间复杂度为O(N)
     *       3. 借助队列方式实现二叉树的层次遍历
     *
     *
     * @param root
     * @return
     */
    public List<Integer> largestValues(TreeNodes root) {

        if (root == null) {
            return null;
        }


        Deque<TreeNodes> deque = new LinkedList<>();
        deque.offer(root);
        List<Integer> list = new ArrayList<>();

        while (!deque.isEmpty()) {
            int size = deque.size();

            int max = Integer.MIN_VALUE;

            for (int i = 0; i < size; i++) {
                TreeNodes node = deque.poll();

                max = Math.max(max, node.val);
                if (node.left != null) {
                    deque.offer(node.left);
                }

                if (node.right != null) {
                    deque.offer(node.right);
                }
            }
            list.add(max);
        }
        return list;
    }
    
    
    
    
    
    


}
