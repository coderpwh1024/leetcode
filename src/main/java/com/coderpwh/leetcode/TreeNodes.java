package com.coderpwh.leetcode;

/**
 * @author coderpwh
 */
public class TreeNodes {

     Integer val;

    TreeNodes left;

    TreeNodes right;

    TreeNodes() {

    }

    TreeNodes(Integer val) {
        this.val = val;
    }

    TreeNodes(Integer val, TreeNodes left, TreeNodes right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
