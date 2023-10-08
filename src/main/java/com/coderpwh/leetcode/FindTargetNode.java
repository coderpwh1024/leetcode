package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * LCR 174. 寻找二叉搜索树中的目标节点
 * <p>
 * 某公司组织架构以二叉搜索树形式记录，节点值为处于该职位的员工编号。请返回第 cnt 大的员工编号。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * 输入：root = [7, 3, 9, 1, 5], cnt = 2
 * 7
 * / \
 * 3   9
 * / \
 * 1   5
 * 输出：7
 * 输出：7
 *
 * @author coderpwh
 * @date 2023/10/8 17:10
 */
public class FindTargetNode {

    public static void main(String[] args) {

        FindTargetNode find = new FindTargetNode();

        TreeNode root = find.createNode();

        int n = 4;

        Integer result = find.findTargetNode(root, n);
        System.out.println(result);


    }


    /***
     * 创建二叉树
     * @return
     */
    public TreeNode createNode() {

        TreeNode node6 = new TreeNode("6");
        TreeNode node8 = new TreeNode("8");

        TreeNode node7 = new TreeNode("7", node6, node8);

        TreeNode node1 = new TreeNode("1");
        TreeNode node2 = new TreeNode("2", node1, null);

        TreeNode node5 = new TreeNode("5", node2, node7);

        TreeNode node20 = new TreeNode("20");

        TreeNode node15 = new TreeNode("15", null, node20);

        TreeNode root = new TreeNode("10", node5, node15);

        return root;


    }


    public int findTargetNode(TreeNode root, int cnt) {

        List<Integer> list = new ArrayList<>();

        mid(root, list);

        if (list != null && list.size() > 0) {
            return list.get(list.size()  - cnt);
        } else {
            return -1;
        }
    }


    /***
     * 中序遍历
     * @param root
     * @param list
     */
    public void mid(TreeNode root, List<Integer> list) {
        if (root != null) {
            mid(root.left, list);
            list.add(Integer.valueOf(root.val));
            mid(root.right, list);
        }
    }

}
