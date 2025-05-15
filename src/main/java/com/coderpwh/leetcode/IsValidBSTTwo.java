package com.coderpwh.leetcode;
import java.util.ArrayList;
import java.util.List;

/**
 * 面试题 04.05. 合法二叉搜索树
 * 实现一个函数，检查一棵二叉树是否为二叉搜索树。
 * <p>
 * 示例 1:
 * 输入:
 * 2
 * / \
 * 1   3
 * 输出: true
 * 示例 2:
 * 输入:
 * 5
 * / \
 * 1   4
 * / \
 * 3   6
 * 输出: false
 * 解释: 输入为: [5,1,4,null,null,3,6]。
 * 根节点的值为 5 ，但是其右子节点值为 4 。
 *
 * @author coderpwh
 * @date 2023/10/18 10:54
 */
public class IsValidBSTTwo {

    public static void main(String[] args) {

        IsValidBSTTwo valid = new IsValidBSTTwo();

        // 创建二叉树
        TreeNode node = valid.createNode();

        Boolean result = valid.isValidBST(node);
        System.out.println(result);

    }


    /***
     * 创建二叉树
     * @return
     */
    public TreeNode createNode() {
        TreeNode node3 = new TreeNode("3");
        TreeNode node6 = new TreeNode("6");

        TreeNode node1 = new TreeNode("1", node3, node6);
        TreeNode node4 = new TreeNode("4");

        TreeNode root = new TreeNode("5", node1, node4);
        return root;
    }


    /***
     *
     * 1. 时间复杂度为O(N)
     * 2. 空间复杂度为O(N)
     * 3. 二叉树采用中序遍历方式，则是从小到大排序
     *
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        mid(root, list);

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public void mid(TreeNode root, List<Integer> list) {

        if (root != null) {
            mid(root.left, list);
            list.add(Integer.valueOf(root.val));
            mid(root.right, list);
        }

    }


}
