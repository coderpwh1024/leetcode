package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindMode {


    List<Integer> answer = new ArrayList<Integer>();
    int base, count, maxCount;


    public static void main(String[] args) {

        FindMode findMode = new FindMode();

        BiTrees biTrees = findMode.create();

        TreeNodes root = biTrees.getRoot();


        int[] arr = findMode.findMode(root);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }


    public BiTrees create() {

        TreeNodes node22 = new TreeNodes(2);

        TreeNodes node2 = new TreeNodes(2, node22, null);

        TreeNodes node1 = new TreeNodes(1, null, node2);

        return new BiTrees(node1);

    }


    public int[] findMode(TreeNodes root) {

        dfs(root);

        int[] mode = new int[answer.size()];

        for (int i = 0; i < answer.size(); ++i) {
            mode[i] = answer.get(i);
        }

        return mode;
    }

    public void dfs(TreeNodes root) {

        if (root == null) {
            return;
        }
        dfs(root.left);
        update(root.val);
        dfs(root.right);
    }

    public void update(int x) {

        if (x == base) {
            ++count;
        } else {
            count = 1;
            base = x;
        }

        if (count == maxCount) {
            answer.add(base);
        }

        if (count > maxCount) {
            maxCount = count;
            answer.clear();
            answer.add(base);
        }

    }

}
