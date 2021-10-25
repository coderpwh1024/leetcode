package com.coderpwh.leetcode;


/***
 *
 *  100 相同的树
 *
 *  给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
 *
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：p = [1,2,3], q = [1,2,3]
 * 输出：true
 * 示例 2：
 *
 *
 * 输入：p = [1,2], q = [1,null,2]
 * 输出：false
 * 示例 3：
 *
 *
 * 输入：p = [1,2,1], q = [1,1,2]
 * 输出：false
 *
 *
 *
 *
 *
 */
public class IsSameTree {

    public static void main(String[] args) {


        IsSameTree tree = new IsSameTree();


        // 调用创建二叉树
        BiTrees biTrees1 = tree.create();

        // 获取二叉树根结点
        TreeNodes p = biTrees1.getRoot();

        //调用创建二叉树
        BiTrees biTrees2 = tree.create2();

        // 获取二叉树根结点
        TreeNodes q = biTrees2.getRoot();


        // 中根判断方式
        System.out.println(tree.isSameTree(p, q));

        // 前根判断方式
        System.out.println(tree.testPre(p, q));


        // 后根判断方式
        System.out.println(tree.testAfter(p, q));


    }


    /***
     * 创建二叉树
     * @return
     */
    public BiTrees create() {

        TreeNodes node2 = new TreeNodes(2);

        TreeNodes node3 = new TreeNodes(3);

        TreeNodes node1 = new TreeNodes(1, node2, node3);

        return new BiTrees(node1);
    }


    /***
     *   创建二叉树
     * @return
     */
    public BiTrees create2() {

        TreeNodes node2 = new TreeNodes(2);

        TreeNodes node3 = new TreeNodes(3);

        TreeNodes node1 = new TreeNodes(1, node2, node3);

        return new BiTrees(node1);
    }


    /***
     *    思路:
     *       1. 时间复杂度为:O(N)
     *       2. 空间复杂度为:O(1)
     *       3. 判断两个树是否相同，可以用中根遍历方式
     *          先判断两个树的左结点是否相等
     *          若相等，则判断根结点值是否相等
     *          若相等， 则判断右结点是否相等
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNodes p, TreeNodes q) {

        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null) {
            if (isSameTree(p.left, q.left)) {
                if (p.val.equals(q.val)) {
                    if (isSameTree(p.right, q.right)) {

                        return true;
                    }
                }
            }
        }
        return false;
    }
    /***
     *  利用前根方式来判断二叉树是否相等
     * @param p
     * @param q
     * @return
     */
    public boolean testPre(TreeNodes p, TreeNodes q) {

        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null) {

            if (p.val.equals(q.val)) {
                if (testPre(p.left, q.left)) {
                    if (testPre(p.right, q.right)) {
                        return true;
                    }

                }
            }

        }
        return false;
    }


    /***
     *
     *    利用后根方式实现
     *
     * @param p
     * @param q
     * @return
     */
    public boolean testAfter(TreeNodes p, TreeNodes q) {

        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null) {

            if (testAfter(p.left, q.left)) {

                if (testAfter(p.right, q.right)) {
                    if (p.val.equals(q.val)) {
                        return true;
                    }
                }
            }

        }
        return false;
    }

}
