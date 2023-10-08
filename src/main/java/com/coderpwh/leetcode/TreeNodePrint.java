package com.coderpwh.leetcode;

import sun.reflect.generics.tree.Tree;

import java.util.Stack;

/**
 * @author coderpwh
 * @date 2023/10/8 11:10
 */
public class TreeNodePrint {

    public static void main(String[] args) {

        TreeNodePrint print = new TreeNodePrint();

        // 创建二叉树
        TreeNode root = print.creatNode();

        // 递归前序遍历方式
        print.pre(root);
        System.out.println();
        print.preByStack(root);

        System.out.println();
        System.out.println("------------------------");
        System.out.println();

        // 中序遍历
        print.mid(root);
        System.out.println();
        print.midByStack(root);


        System.out.println();
        System.out.println("------------------------");
        System.out.println();

        // 后序遍历
        print.after(root);
        System.out.println();
        print.afterByStack(root);


    }


    /***
     * 创建二叉树
     * @return
     */
    public TreeNode creatNode() {
        TreeNode node1 = new TreeNode("1");
        TreeNode node3 = new TreeNode("3");

        TreeNode node2 = new TreeNode("2", node1, node3);

        TreeNode node7 = new TreeNode("7");

        TreeNode root = new TreeNode("4", node2, node7);

        return root;
    }

    /***
     * 递归方式前序遍历
     * @param root
     */
    public void pre(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            pre(root.left);
            pre(root.right);
        }
    }


    /***
     *  前序遍历非递归方式
     * @param root
     */
    public void preByStack(TreeNode root) {

        Stack<TreeNode> stack = new Stack();
        TreeNode curr = root;
        stack.push(curr);

        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            System.out.print(pop.val + " ");
            if (pop.right != null) {
                stack.push(pop.right);
            }

            if (pop.left != null) {
                stack.push(pop.left);
            }
        }
    }

    /***
     *  递归中序遍历
     * @param root
     */
    public void mid(TreeNode root) {
        if (root != null) {
            mid(root.left);
            System.out.print(root.val + " ");
            mid(root.right);
        }
    }


    /***
     * 非递归中序遍历
     * @param root
     */
    public void midByStack(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode pop = stack.pop();
            System.out.print(pop.val + " ");
            cur = pop.right;
        }
    }


    /**
     * 后序遍历递归方式
     *
     * @param root
     */
    public void after(TreeNode root) {
        if (root != null) {
            after(root.left);
            after(root.right);
            System.out.print(root.val + " ");
        }
    }


    /***
     * 后序遍历(非递归方式)
     * @param root
     */
    public void afterByStack(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> res = new Stack<>();

        TreeNode curr = root;
        stack.push(curr);

        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            res.push(pop);

            if (pop.left != null) {
                stack.push(pop.left);
            }

            if (pop.right != null) {
                stack.push(pop.right);
            }
        }

        while (!res.isEmpty()) {
            TreeNode pop = res.pop();
            System.out.print(pop.val + " ");
        }
    }


}
