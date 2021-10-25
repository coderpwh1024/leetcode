package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

/***
 *
 *  501 二叉搜索树种的众数
 *
 *  给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）
 *
 * 假定 BST 有如下定义：
 *
 * 结点左子树中所含结点的值小于等于当前结点的值
 * 结点右子树中所含结点的值大于等于当前结点的值
 * 左子树和右子树都是二叉搜索树
 * 例如：
 * 给定 BST [1,null,2,2],
 *
 *    1
 *     \
 *      2
 *     /
 *    2
 *
 *
 *
 *
 */
public class FindMode {


    List<Integer> answer = new ArrayList<Integer>();
    int base, count, maxCount;


    public static void main(String[] args) {

        FindMode findMode = new FindMode();


        // 创建二叉树
        BiTrees biTrees = findMode.create();

        // 获取根部
        TreeNodes root = biTrees.getRoot();


        int[] arr = findMode.findMode(root);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }


    /***
     *   创建二叉树
     *
     * @return
     */
    public BiTrees create() {

        TreeNodes node22 = new TreeNodes(2);

        TreeNodes node2 = new TreeNodes(2, node22, null);

        TreeNodes node1 = new TreeNodes(1, null, node2);

        return new BiTrees(node1);

    }


    /***
     *
     *    思路:
     *      1. 时间复杂度为O(N)
     *      2. 空间复杂度为O(N)
     *
     * @param root
     * @return
     */
    public int[] findMode(TreeNodes root) {

        dfs(root);

        int[] mode = new int[answer.size()];

        for (int i = 0; i < answer.size(); ++i) {
            mode[i] = answer.get(i);
        }

        return mode;
    }

    public void dfs(TreeNodes root) {

        if (root == null) {
            return;
        }
        dfs(root.left);
        update(root.val);
        dfs(root.right);
    }

    public void update(int x) {

        if (x == base) {
            ++count;
        } else {
            count = 1;
            base = x;
        }

        if (count == maxCount) {
            answer.add(base);
        }

        if (count > maxCount) {
            maxCount = count;
            answer.clear();
            answer.add(base);
        }

    }

}
