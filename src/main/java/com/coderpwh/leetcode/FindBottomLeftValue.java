package com.coderpwh.leetcode;

/**
 * 513. 找树左下角的值
 *
 * @author coderpwh
 */
public class FindBottomLeftValue {


    private int value = 0;

    private int Deep = -1;


    public static void main(String[] args) {

        FindBottomLeftValue find = new FindBottomLeftValue();

        // 获取二叉树
        BiTrees biTree = find.create();

        // 获取二叉树根结点
        TreeNodes root = biTree.getRoot();

//        find.findBottomLeftValue(root);

        find.test(root);

    }


    /***
     *   创建二叉树
     * @return
     */
    public BiTrees create() {

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node5 = new TreeNodes(5, node7, null);

        TreeNodes node6 = new TreeNodes(6);

        TreeNodes node3 = new TreeNodes(3, node5, node6);

        TreeNodes node4 = new TreeNodes(4);

        TreeNodes node2 = new TreeNodes(2, node4, null);

        TreeNodes root = new TreeNodes(1, node2, node3);

        return new BiTrees(root);
    }


    /**
     * 创建二叉树二
     *
     * @return
     */
    public BiTrees createTwo() {

        TreeNodes node1 = new TreeNodes(1);

        TreeNodes node3 = new TreeNodes(3);

        TreeNodes node2 = new TreeNodes(2, node1, node3);

        return new BiTrees(node2);
    }


    public int findBottomLeftValue(TreeNodes root) {

        value = root.val;
        findValue(root, Deep);

        System.out.println(value);
        return value;
    }


    /***
     *   思路:
     *      1. 时间复杂度为O(N)
     *      2. 空间复杂度为O(N)
     *      3. 利用递归方式先求出深度最大的一行，然后找出最左边的树
     *
     *
     * @param root
     * @param deep
     */
    public void findValue(TreeNodes root, int deep) {

        if (root == null) {
            return;
        }

        if (root.left == null || root.right == null) {
            if (deep > Deep) {
                value = root.val;
                Deep = deep;
            }
        }

        if (root.left != null) {
            findValue(root.left, deep + 1);
        }

        if (root.right != null) {
            findValue(root.right, deep + 1);
        }
    }


    public void test(TreeNodes root) {
        int height = getHeight(root);

        System.out.println(height);
    }


    /***
     *  递归方式求二叉树深度
     * @param root
     * @return
     */
    public int getHeight(TreeNodes root) {
        if (root != null) {
            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);
            return 1 + (leftHeight > rightHeight ? leftHeight : rightHeight);
        }
        return 0;
    }


    /***
     *
     *   中遍历方式
     *
     * @param root
     * @param count
     * @return
     */
    public int mid(TreeNodes root, Integer count) {

        if (root != null) {
            count = count + 1;
            mid(root.left, count);
            return root.val;
        } else {
            return -1;
        }
    }


    /***
     *  前序遍历方式
     * @param root
     * @param count
     * @return
     */
    public int pre(TreeNodes root, Integer count) {

        if (root != null) {
            count = count + 1;
            pre(root.right, count);
            return root.val;
        } else {
            return -1;
        }
    }


}
