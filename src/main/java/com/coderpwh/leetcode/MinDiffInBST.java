 package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 783. 二叉搜索树节点最小距离
 * <p>
 * 给你一个二叉搜索树的根节点 root ，返回 树中任意两不同节点值之间的最小差值 。
 * <p>
 * 注意：本题与 530：https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/ 相同
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [4,2,6,1,3]
 * 输出：1
 * 示例 2：
 *
 * @author coderpwh
 */
public class MinDiffInBST {

    public static void main(String[] args) {

        MinDiffInBST min = new MinDiffInBST();


        // 创建二叉树
        BiTrees biTrees = min.create();

        // 获取根结点
        TreeNodes root = biTrees.getRoot();

        // 打印最小值
        System.out.println(min.minDiffInBST(root));


    }


    /***
     *
     *   创建二叉树
     * @return
     */
    public BiTrees create() {

        TreeNodes node1 = new TreeNodes(1);

        TreeNodes node3 = new TreeNodes(3);

        TreeNodes node2 = new TreeNodes(2, node1, node3);

        TreeNodes node6 = new TreeNodes(6);

        TreeNodes node4 = new TreeNodes(4, node2, node6);

        return new BiTrees(node4);


    }


    /***
     *
     *    思路:
     *       1. 时间复杂度为O(N)
     *       2. 空间复杂度为O(N),递归用到了隐形的栈空间
     *       3. 二叉搜索树 用中序遍历的方式遍历，是按小到达顺序，然后最去比较两个数相互之家的值
     *
     * @param root
     * @return
     */
    public int minDiffInBST(TreeNodes root) {


        List<Integer> list = new ArrayList<>();

        midPrint(root, list);

        Integer min = Integer.MAX_VALUE;

        if (list != null) {


            for (int i = 0; i < list.size() - 1; i++) {

                min = Math.min(min, Math.abs(list.get(i) - list.get(i + 1)));
            }
        }

        return min;


    }


    /***
     *     思路:
     *       1. 时间复杂度为O(N)
     *       2. 空间复杂度为:O(N)
     *       3. 用中序遍历方式实现
     *
     * @param root
     * @param list
     */
    public void midPrint(TreeNodes root, List<Integer> list) {

        if (root != null) {
            midPrint(root.left, list);
            list.add(root.val);
            midPrint(root.right, list);

        }
    }


}
