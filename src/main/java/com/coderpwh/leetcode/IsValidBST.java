 package com.coderpwh.leetcode;

/***
 *
 *  98 验证二叉搜索树
 *
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 *
 * 假设一个二叉搜索树具有如下特征：
 *
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 * 示例 1:
 *
 * 输入:
 *     2
 *    / \
 *   1   3
 * 输出: true
 * 示例 2:
 *
 * 输入:
 *     5
 *    / \
 *   1   4
 *      / \
 *     3   6
 * 输出: false
 * 解释: 输入为: [5,1,4,null,null,3,6]。
 *      根节点的值为 5 ，但是其右子节点值为 4 。
 */
public class IsValidBST {

    public static void main(String[] args) {

        IsValidBST bst = new IsValidBST();

        BiTrees biTrees = bst.create2();

        TreeNodes root = biTrees.getRoot();

//        bst.isValiBST();

        System.out.println(bst.isValiBST(root));

    }


    /***
     *   创建二叉树
     *
     * @return
     */
    public BiTrees create() {

        TreeNodes node1 = new TreeNodes(1);
        TreeNodes node2 = new TreeNodes(3);

        TreeNodes node3 = new TreeNodes(2, node1, node2);

        return new BiTrees(node3);
    }


    /***
     *
     *  创建二叉树
     *
     * @return
     */
    public BiTrees create2() {

        TreeNodes node3 = new TreeNodes(3);
        TreeNodes node6 = new TreeNodes(6);

        TreeNodes node4 = new TreeNodes(4, node3, node6);

        TreeNodes node1 = new TreeNodes(1);


        TreeNodes node5 = new TreeNodes(5, node1, node4);

        return new BiTrees(node5);


    }


    public boolean isValiBST(TreeNodes root) {

        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }


    /***
     *
     *    思路:
     *       1.时间复杂度为O(N)
     *       2. 空间复杂度为O(N)
     *       3. 递归方式实现，分别用long 类型的最大值与最小值来判断
     *          左子树上的结点必须小于根结点，遍历左子时，最大值是root.val
     *          同理遍历右子树时，最小值是root.val
     *
     *
     * @param root
     * @param lower
     * @param upper
     * @return
     */
    public boolean check(TreeNodes root, long lower, long upper) {

        if (root == null) {
            return true;
        }

        if (root.val <= lower || root.val >= upper) {
            return false;
        }

        return check(root.left, lower, root.val) && check(root.right, root.val, upper);

    }


}
