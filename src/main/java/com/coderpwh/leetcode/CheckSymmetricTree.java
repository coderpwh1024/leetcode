package com.coderpwh.leetcode;


/***
 *
 * LCR 145. 判断对称二叉树
 *
 *请设计一个函数判断一棵二叉树是否 轴对称 。
 * 输入：root = [6,7,7,8,9,9,8]
 * 输出：true
 * 解释：从图中可看出树是轴对称的。
 */
public class CheckSymmetricTree {


    public static void main(String[] args) {

        CheckSymmetricTree tree = new CheckSymmetricTree();

         // 创建节点
         TreeNode node = tree.createTreeNode();

         // 对称
        boolean flag=  tree.checkSymmetricTree(node);
        System.out.println(flag);
    }




    /***
     * 创建二叉树
     * @return
     */
    public TreeNode createTreeNode(){
        TreeNode node81 = new TreeNode("8");
        TreeNode node91 = new TreeNode("9");

        TreeNode node71 = new TreeNode("7",node81,node91);

        TreeNode node8 = new TreeNode("8");
        TreeNode node9 = new TreeNode("9");

        TreeNode node7 = new TreeNode("7",node9,node8);

        TreeNode node = new TreeNode("6",node71,node7);

        return  node;
    }


    /***
     * 递归方式
     * @param root
     * @return
     */
    public boolean checkSymmetricTree(TreeNode root) {

        return  check(root,root);
    }

    public  boolean check(TreeNode node ,TreeNode root){

        if(node==null&&root==null){
            return  true;
        }

        if(node==null||root==null){
            return false;
        }

        return  root.val==node.val&&check(node.left,root.right)&&check(node.right,root.left);
    }

}
