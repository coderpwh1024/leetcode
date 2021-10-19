 package com.coderpwh.leetcode;



/**
 * 563 二叉树的坡度
 *
 * @author coderpwh
 */
public class FindTilt {


    private int total = 0;


    public static void main(String[] args) {

        FindTilt find = new FindTilt();

        BiTrees biTrees = find.create();

        TreeNodes root = biTrees.getRoot();


        System.out.println(find.findTilt(root));


    }


    public BiTrees create() {

        TreeNodes node3 = new TreeNodes(3);

        TreeNodes node5 = new TreeNodes(5);

        TreeNodes node2 = new TreeNodes(2, node3, node5);

        TreeNodes node7 = new TreeNodes(7);

        TreeNodes node9 = new TreeNodes(9, null, node7);

        TreeNodes node4 = new TreeNodes(4, node2, node9);

        return new BiTrees(node4);
    }


    public int findTilt(TreeNodes root) {

        traverse(root);

        return total;
    }

    public int traverse(TreeNodes root) {

        if (root == null) {
            return 0;
        }

        int left = traverse(root.left);

        int right = traverse(root.right);

        total += Math.abs(left - right);

        return root.val+left+right;

    }


    public void pre(TreeNodes root) {

        if (root != null) {
            System.out.print(root.val);
            System.out.print(" ");
            pre(root.left);
            pre(root.right);

        }
    }

}
