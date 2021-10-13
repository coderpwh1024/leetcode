 package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author coderpwh
 */
public class ConvertBST {

    private int sum;

    public static void main(String[] args) {

        ConvertBST bst = new ConvertBST();

        // 创建二叉树
        BiTrees biTrees = bst.create();

        // 获取根结点
        TreeNodes root = biTrees.getRoot();

        //  进行累加
        bst.convertBST(root);

        List<Integer> list = new ArrayList<>();
        bst.mid(root, list);


        System.out.println();
        Integer sum = list.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);

    }


    /***
     *  创建二叉树
     * @return
     */
    public BiTrees create() {

        TreeNodes node8 = new TreeNodes(8);

        TreeNodes node7 = new TreeNodes(7, null, node8);

        TreeNodes node5 = new TreeNodes(5);

        TreeNodes node6 = new TreeNodes(6, node5, node7);

        TreeNodes node3 = new TreeNodes(3);

        TreeNodes node2 = new TreeNodes(2, null, node3);

        TreeNodes node0 = new TreeNodes(0);

        TreeNodes node1 = new TreeNodes(1, node0, node2);

        TreeNodes node4 = new TreeNodes(4, node1, node6);

        return new BiTrees(node4);
    }


    public TreeNodes convertBST(TreeNodes root) {
        int sum = 0;

        convertValue(root);

        return root;
    }


    /***
     *   思路:
     *     1.时间复杂度为O(N)
     *     2.空间复杂度为O(N)
     *     3. 由于是二叉搜索树，中序遍历后是，[1,2,3]
     *     则累加的结果为:[6,5,3],用反中序遍历的方式，先进行
     *    右结点，对根结点进行赋值后(累加)，后进行左结点
     *
     * @param root
     */
    public void convertValue(TreeNodes root) {
        if (root == null) {
            return;
        }
        convertValue(root.right);
        sum += root.val;
        root.val = sum;
        convertValue(root.left);
    }


    /***
     *   中序遍历方式
     *
     * @param root
     * @param list
     */
    public void mid(TreeNodes root, List<Integer> list) {
        if (root != null) {
            mid(root.left, list);
            System.out.print(root.val);
            System.out.print(" ");
            list.add(root.val);
            mid(root.right, list);
        }
    }


}
