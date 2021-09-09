package com.coderpwh.leetcode;


/***
 *
 * 给你一棵 完全二叉树 的根节点 root ，求出该树的节点个数。
 *
 * 完全二叉树 的定义如下：在完全二叉树中，除了最底层节点可能没填满外，其余每层节点数都达到最大值，并且最下面一层的节点都集中在该层最左边的若干位置。若最底层为第 h 层，则该层包含 1~ 2h 个节点。
 *
 *  
 *输入：root = [1,2,3,4,5,6]
 * 输出：6
 * 示例 2：
 *
 * 输入：root = []
 * 输出：0
 * 示例 3：
 *
 * 输入：root = [1]
 * 输出：1
 *
 */
public class CountNodes {


    public static void main(String[] args) {

        CountNodes countNodes = new CountNodes();


        BiTrees biTrees = countNodes.create();

        TreeNodes root = biTrees.getRoot();


        countNodes.countNodes(root);

    }

    public int countNodes(TreeNodes root) {


        int count = getCount(root);

        System.out.println(count);

        return count;
    }


    public BiTrees create() {


        TreeNodes node4 = new TreeNodes(4);

        TreeNodes node5 = new TreeNodes(5);

        TreeNodes node2 = new TreeNodes(2, node4, node5);

        TreeNodes node6 = new TreeNodes(6);

        TreeNodes node3 = new TreeNodes(3, node6, null);

        TreeNodes node1 = new TreeNodes(1, node2, node3);

        return new BiTrees(node1);

    }


    /***
     *  思路:
     *     1. 时间复杂度为O(N)
     *     2. 空间复杂度为O(N)
     *     3. 主要利用递归方式实现
     *
     *
     *
     *
     * @param root
     * @return
     */
    public int getCount(TreeNodes root) {

        int count = 0;

        if (root == null) {
            return 0;
        } else {
            count = 1 + getCount(root.left) + getCount(root.right);
        }

        return count;

    }


}
