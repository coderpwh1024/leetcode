package com.coderpwh.leetcode;

import java.util.*;

/**
 * 199. 二叉树的右视图
 * <p>
 * 给定一个二叉树的 根节点 root，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * <p>
 * 输入: [1,2,3,null,5,null,4]
 * 输出: [1,3,4]
 * 示例 2:
 * <p>
 * 输入: [1,null,3]
 * 输出: [1,3]
 * 示例 3:
 * <p>
 * 输入: []
 * 输出: []
 *
 * @author coderpwh
 * @date 2023/10/26 16:41
 */
public class RightSideView {

    public static void main(String[] args) {

        RightSideView view = new RightSideView();
        // 创建节点
        TreeNode root = view.createNode();

//        List<Integer> list = view.rightSideView(root);

        List<Integer> list = view.rightSideView(root);

        if (list != null && list.size() > 0) {
            for (Integer a : list) {
                System.out.print(a + " ");
            }
        }

    }


    /***
     *  创建根节点
     * @return
     */
    public TreeNode createNode() {

        TreeNode node5 = new TreeNode("5");
        TreeNode node2 = new TreeNode("2", null, node5);

        TreeNode node4 = new TreeNode("4");
        TreeNode node3 = new TreeNode("3", null, node4);

        TreeNode root = new TreeNode("1", node2, node3);
        return root;
    }


    public List<Integer> testRightSideView(TreeNode root) {

        Map<Integer, Integer> rightmostValueAtDepth = new HashMap<>();
        int max_depth = -1;

        Deque<TreeNode> nodeStack = new LinkedList<TreeNode>();
        Deque<Integer> depthStack = new LinkedList<Integer>();
        nodeStack.push(root);
        depthStack.push(0);

        while (!nodeStack.isEmpty()) {
            TreeNode node = nodeStack.pop();
            int depth = depthStack.pop();

            if (node != null) {
                max_depth = Math.max(max_depth, depth);

                if (!rightmostValueAtDepth.containsKey(depth)) {
                    rightmostValueAtDepth.put(depth, Integer.valueOf(node.val));
                }

                nodeStack.push(node.left);
                nodeStack.push(node.right);
                depthStack.push(depth + 1);
                depthStack.push(depth + 1);
            }

        }

        List<Integer> rightView = new ArrayList<>();

        for (int depth = 0; depth < max_depth; depth++) {
            rightView.add(rightmostValueAtDepth.get(depth));
        }
        return rightView;
    }


    /***
     * 1. test code 不通过
     *
     * @param root
     * @return
     */
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if (root != null) {
            pre(root, list);
        }
        return list;
    }

    public void pre(TreeNode root, List<Integer> list) {

        if (root != null) {
            list.add(Integer.valueOf(root.val));
            pre(root.right, list);
        }
    }


}
