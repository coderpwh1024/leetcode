package com.coderpwh.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 设计一个算法，找出二叉搜索树中指定节点的“下一个”节点（也即中序后继）。
 * <p>
 * 如果指定节点没有对应的“下一个”节点，则返回null。
 * <p>
 * 示例 1:
 * <p>
 * 输入: root = [2,1,3], p = 1
 * <p>
 * 2
 * / \
 * 1   3
 * <p>
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: root = [5,3,6,2,4,null,null,1], p = 6
 * <p>
 * 5
 * / \
 * 3   6
 * / \
 * 2   4
 * /
 * 1
 * <p>
 * 输出: null
 *
 * @author coderpwh
 * @date 2023/10/18 13:37
 */
public class InorderSuccessor {

    public static void main(String[] args) {

        InorderSuccessor order = new InorderSuccessor();

        Integer child = 1;

        TreeNode root = order.createNode();
        TreeNode childNode = order.getChildNode(child);
        System.out.println(childNode.val);
        System.out.println(root.val);

        TreeNode node = order.inorderSuccessor(root, childNode);
        System.out.println(node.val);

    }


    /***
     * 获取其子节点
     * @param child
     * @return
     */
    public TreeNode getChildNode(Integer child) {
        TreeNode node = new TreeNode(child + "");
        return node;
    }


    /***
     * 创建节点
     * @return
     */
    public TreeNode createNode() {
        TreeNode node3 = new TreeNode("3");
        TreeNode node = new TreeNode("1");

        TreeNode root = new TreeNode("2", node, node3);

        return root;
    }

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {

        Deque<TreeNode> stack = new ArrayDeque<>();

        TreeNode prev = null;
        TreeNode curr = root;

        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();

            if (prev == p) {
                return curr;
            }
            prev = curr;
            curr = curr.right;
        }
        return null;
    }


}
