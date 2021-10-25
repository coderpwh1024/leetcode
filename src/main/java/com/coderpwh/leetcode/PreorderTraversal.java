package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

/***
 *
 * 二叉树的前序遍历
 *
 */
public class PreorderTraversal {


    public static void main(String[] args) {

        PreorderTraversal preorderTraversa = new PreorderTraversal();

//        BiTree biTree = preorderTraversa.createBTree();

        BiTree biTree = preorderTraversa.createBTree2();


        // 根结点
        TreeNode root = biTree.getRoot();


        preorderTraversa.preorderTraversal(root);


    }


    /***
     *
     * 创建二叉树
     *
     * @return
     */
    public BiTree createBTree() {

        TreeNode node7 = new TreeNode(7 + "");
        TreeNode node6 = new TreeNode(6 + "");

        TreeNode node3 = new TreeNode(3 + "", node6, node7);

        TreeNode node5 = new TreeNode(5 + "");
        TreeNode node4 = new TreeNode(4 + "");

        TreeNode node2 = new TreeNode(2 + "", node4, node5);

        TreeNode node1 = new TreeNode(1 + "", node2, node3);


        return new BiTree(node1);
    }

    public BiTree createBTree2() {



        TreeNode nodeF = new TreeNode("F");
        TreeNode nodeG = new TreeNode("G");

        TreeNode nodeC = new TreeNode("C", nodeF, nodeG);


        TreeNode nodeH = new TreeNode("H");
        TreeNode nodeI = new TreeNode("I");

        TreeNode nodeD = new TreeNode("D", nodeH, nodeI);

        TreeNode nodeJ = new TreeNode("J");

        TreeNode nodeE = new TreeNode("E", nodeJ, null);

        TreeNode nodeB = new TreeNode("B", nodeD, nodeE);



        TreeNode nodeA = new TreeNode("A",nodeB,nodeC);
        return new BiTree(nodeA);

    }


    public List<String> preorderTraversal(TreeNode root) {

        List<String> list = new ArrayList<>();


        // 调用递归的方式
//        preRootTraversal(root, list);

//        midRootTraversal(root,list);

        afterRootTraversal(root, list);

        for (String count : list) {
            System.out.print(count + " ");
        }

        return list;
    }


    /***
     *     思路:
     *         1. 递归方式实现二叉树的先根遍历
     *         2. 时间复杂度为O(N)
     *         3. 空间复杂度为O(N)
     * @param root
     * @param list
     */
    public void preRootTraversal(TreeNode root, List<String> list) {

        if (root != null) {
            list.add(root.val);
            preRootTraversal(root.left, list);
            preRootTraversal(root.right, list);
        }
    }


    /***
     *
     *   中序遍历方式
     *
     * @param root
     * @param list
     */
    public void midRootTraversal(TreeNode root, List<String> list) {

        if (root != null) {
            midRootTraversal(root.left, list);
            list.add(root.val);
            midRootTraversal(root.right, list);
        }

    }


    /***
     *
     *   后根遍历--递归
     *
     * @param root
     * @param list
     */
    public void afterRootTraversal(TreeNode root, List<String> list) {

        if (root != null) {
            afterRootTraversal(root.left, list);
            afterRootTraversal(root.right, list);
            list.add(root.val);
        }
    }

}
