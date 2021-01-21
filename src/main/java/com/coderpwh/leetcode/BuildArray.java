package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BuildArray {

    public static void main(String[] args) {


        int target[] = {2, 3, 4};
        int n = 4;

        BuildArray build = new BuildArray();
        build.buildArray(target, n);
    }


    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();

        for (int i = 1, j = 0; j <= n && j < target.length; i++) {

            if (i < target[j]) {
                list.add("Push");
                list.add("Pop");
            } else {
                list.add("Push");
                j++;
            }
        }
        return list;
    }


}
