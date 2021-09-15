package com.coderpwh.leetcode;

import java.util.*;


/***
 * 103. 二叉树的锯齿形层序遍历
 *
 * 给定一个二叉树，返回其节点值的锯齿形层序遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回锯齿形层序遍历如下：
 *
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 *
 *
 *
 */
public class ZigzagLevelOrder {


    public static void main(String[] args) {

        ZigzagLevelOrder order = new ZigzagLevelOrder();


        // 创建二叉树
        BiTrees biTrees = order.create();

        // 获取根结点
        TreeNodes root = biTrees.getRoot();

        //进行层次遍历打印
        order.zigzagLevelOrder(root);
    }


    /***
     *
     *  创建二叉树
     *
     * @return
     */
    public BiTrees create() {

        TreeNodes node15 = new TreeNodes(15);

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node20 = new TreeNodes(20, node15, node7);

        TreeNodes node9 = new TreeNodes(9);

        TreeNodes node3 = new TreeNodes(3, node9, node20);

        return new BiTrees(node3);
    }


    /***
     *     思路:
     *       1. 时间复杂度为O(N)
     *       2. 空间复杂度为O(N)
     *       3. 主要是利用队列方式实现
     *
     *
     * @param root
     * @return
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNodes root) {


        List<List<Integer>> date = new ArrayList<>();
        if (root != null) {

            Queue<TreeNodes> queue = new LinkedList<>();
            queue.offer(root);
            boolean flag = false;
            while (!queue.isEmpty()) {

                int size = queue.size();
                List<Integer> list = new ArrayList<>();

                for (int i = 0; i < size; i++) {
                    root = queue.poll();

                    if (root.left != null) {
                        queue.offer(root.left);
                    }

                    if (root.right != null) {
                        queue.offer(root.right);
                    }
                    list.add(root.val);
                }
                if (flag) {
                    Collections.reverse(list);
                    flag = false;
                    date.add(list);
                } else {
                    date.add(list);
                    flag = true;
                }
            }
        }
        return date;
    }

}
