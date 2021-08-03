package com.coderpwh.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/***
 *
 *  101 对称二叉树
 *
 *  给定一个二叉树，检查它是否是镜像对称的。
 *
 *  
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 *  
 *
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *
 *
 */
public class IsSymmetric {

    public static void main(String[] args) {


        IsSymmetric isSymmetric = new IsSymmetric();
        BiTree root = isSymmetric.createBTree();

//        isSymmetric.isSymmetric(root.getRoot());

        System.out.println(isSymmetric.isSymmetric(root.getRoot()));


    }


    public BiTree createBTree() {

        TreeNode node7 = new TreeNode(3);
        TreeNode node6 = new TreeNode(4);

        TreeNode node3 = new TreeNode(2, node6, node7);

        TreeNode node5 = new TreeNode(4);
        TreeNode node4 = new TreeNode(3);

        TreeNode node2 = new TreeNode(2, node4, node5);

        TreeNode node1 = new TreeNode(1, node2, node3);


        return new BiTree(node1);

    }

    public boolean isSymmetric(TreeNode root) {

        boolean flag = check(root, root);

        boolean f = test(root, root);
        System.out.println("f:" + f);

        return flag;
    }


    /***
     *   思路:
     *       1.时间复杂度为O(N)
     *       2.空间复杂度为O(N)
     *       3.利用递归方式
     * @param p
     * @param q
     * @return
     */
    public boolean check(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }


    /***
     *     思路:
     *        1.时间复杂度为O(N)
     *        2.空间复杂度为O(N)
     *        3. 借助队列与循环实现
     *
     * @param p
     * @param q
     * @return
     */
    public boolean test(TreeNode p, TreeNode q) {

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(p);
        queue.offer(q);

        while (!queue.isEmpty()) {

            p = queue.poll();
            q = queue.poll();

            if (p == null && q == null) {
                continue;
            }

            if (p == null || q == null || (p.val != q.val)) {
                return false;
            }

            queue.offer(p.left);
            queue.offer(q.right);


            queue.offer(p.right);
            queue.offer(q.left);
        }
        return true;
    }

}
