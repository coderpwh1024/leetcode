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
