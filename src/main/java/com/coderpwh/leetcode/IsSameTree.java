package com.coderpwh.leetcode;

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


        System.out.println(tree.isSameTree(p, q));


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

}
