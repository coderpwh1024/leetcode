package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author coderpwh
 */
public class BinaryTreePaths {

    public static void main(String[] args) {

     BinaryTreePaths path = new BinaryTreePaths();


     // 获取创建二叉树方法
     BiTrees biTrees = path.create();

     // 获取根结点
     TreeNodes root = biTrees.getRoot();


     path.binaryTreePaths(root);

     }


     /***
     *
     *   创建二叉树
     *
     * @return
     */
    public BiTrees create() {

        TreeNodes node5 = new TreeNodes(5);

        TreeNodes node2 = new TreeNodes(2, null, node5);

        TreeNodes node3 = new TreeNodes(3);

        TreeNodes node1 = new TreeNodes(1, node2, node3);

        return new BiTrees(node1);
    }


    public List<String> binaryTreePaths(TreeNodes root) {


        List<String> list = new ArrayList<>();

        String path = "";

        stringAppend(root, list, path);

        return list;
    }


    /***
     *      思路:
     *        1. 时间复杂度为O(N^2)
     *        2. 空间复杂度为O(N^2)
     *        3. 递归方式实现
     *
     *
     * @param root
     * @param list
     * @param path
     */
    public void stringAppend(TreeNodes root, List<String> list, String path) {

        if (root != null) {
            StringBuffer sb = new StringBuffer(path);
            sb.append(root.val);

            if (root.left == null && root.right == null) {
                list.add(sb.toString());
            } else {
                sb.append("->");
                stringAppend(root.left, list, sb.toString());
                stringAppend(root.right, list, sb.toString());

            }
        }


    }


}


