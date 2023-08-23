package com.coderpwh.leetcode;

/**
 * 606
 * 给你二叉树的根节点 root ，请你采用前序遍历的方式，将二叉树转化为一个由括号和整数组成的字符串，返回构造出的字符串。
 * <p>
 * 空节点使用一对空括号对 "()" 表示，转化后需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。
 * <p>
 * 输入：root = [1,2,3,4]
 * 输出："1(2(4))(3)"
 * 解释：初步转化后得到 "1(2(4)())(3()())" ，但省略所有不必要的空括号对后，字符串应该是"1(2(4))(3)" 。
 *
 * @author coderpwh
 * @date 2023/8/23 14:33
 */
public class StringByBST {

    public static void main(String[] args) {
        StringByBST bst = new StringByBST();

        // 创建根节点
        TreeNode node = bst.createTreeNode();

//        TreeNode node = bst.createTreeNode2();

        // 获取字符串
        String str = bst.tree2str(node);
        System.out.println(str);

        Integer.valueOf(node.val);
    }


    /***
     * 创建根节点
     * @return
     */
    public TreeNode createTreeNode() {
        TreeNode node4 = new TreeNode("4");
        TreeNode node2 = new TreeNode("2", node4, null);
        TreeNode node3 = new TreeNode("3");
        TreeNode node1 = new TreeNode("1", node2, node3);
        return node1;
    }


    /***
     * 创建节点
     * @return
     */
    public TreeNode createTreeNode2() {
        TreeNode node3 = new TreeNode("3");

        TreeNode node1 = new TreeNode("1", null, node3);
        return node1;
    }


    /***
     *前序遍历(根,左 右)
     *root = [1,2,3,4]
     *
     * 1(2(4)())(3()())
     * 最终输出 "1(2(4))(3)"
     *     1
     *   2    3
     *4
     * @param root
     * @return
     */
    public String tree2str(TreeNode root) {
        StringBuffer buffer = new StringBuffer();
        if (root == null) {
            return "";
        }

        if (root.right == null && root.left == null) {
            return root.val;
        }
        if (root.right == null) {
            return buffer.append(root.val).append("(").append(tree2str(root.left)).append(")").toString();
        }
        return buffer.append(root.val).append("(").append(tree2str(root.left)).append(")(").append(tree2str(root.right)).append(")").toString();
    }


}
