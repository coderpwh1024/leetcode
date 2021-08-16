 package com.coderpwh.leetcode;

import java.util.HashSet;
import java.util.Set;


/***
 *   653 两数之和 IV -输入BST
 *
 *   给定一个二叉搜索树 root 和一个目标结果 k，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
 */
public class FindTarget {

    public static void main(String[] args) {


        int k = 9;

        FindTarget find = new FindTarget();

        // 创建二叉树
        BiTrees biTrees = find.create();

        // 获取树根
        TreeNodes root = biTrees.getRoot();

        System.out.println(find.findTarget(root, k));


    }


    /***
     *    创建二叉树
     * @return
     */
    public BiTrees create() {

        TreeNodes node4 = new TreeNodes(4);
        TreeNodes node2 = new TreeNodes(2);

        TreeNodes node3 = new TreeNodes(3, node2, node4);

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node6 = new TreeNodes(6, null, node7);

        TreeNodes node5 = new TreeNodes(5, node3, node6);

        return new BiTrees(node5);

    }


    public boolean findTarget(TreeNodes root, int k) {

        if (root == null) {
            return false;
        }

        Set<Integer> set = new HashSet<>();


        return pre(root, set, k);
    }


    /***
     *
     *     思路:
     *        1. 时间复杂度为:O(N)
     *        2. 空间复杂度为: O(N)
     *        3. 利用HASH与递归方式实现
     *
     * @param root
     * @param set
     * @param k
     * @return
     */
    public boolean pre(TreeNodes root, Set<Integer> set, int k) {

        if (root == null) {
            return false;
        }


        if (set.contains(k - root.val)) {
            return true;
        }

        set.add(root.val);

        return pre(root.left, set, k) || pre(root.right, set, k);
    }


}
