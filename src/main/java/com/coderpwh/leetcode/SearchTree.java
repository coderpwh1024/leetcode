package com.coderpwh.leetcode;

import com.sun.org.apache.xalan.internal.res.XSLTErrorResources_zh_TW;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author coderpwh
 * @date 2023/8/29 11:32
 */
public class SearchTree {

    public static void main(String[] args) {

        int n = 3;

        SearchTree tree = new SearchTree();
        tree.numTrees(n);
    }


    public int numTrees(int n) {
        if (n == 0) {
            return 0;
        }


        return -1;
    }


    /***
     *
     * @param start
     * @param end
     * @return
     */
    public List<TreeNode> getNumber(int start, int end) {
        List<TreeNode> list = new LinkedList<>();
        if (start > end) {
            list.add(null);
            return list;
        }

        for (int i = start; i < end; i++) {
            List<TreeNode> leftNodeList = getNumber(start, i - 1);
            List<TreeNode> rightNodeList = getNumber(i + 1, end);

            for (TreeNode left : leftNodeList) {
                for (TreeNode right : rightNodeList) {
                    TreeNode node = new TreeNode(i + "");
                    node.left = left;
                    node.right = right;
                    list.add(node);
                }
            }
        }
        return list;
    }


}
