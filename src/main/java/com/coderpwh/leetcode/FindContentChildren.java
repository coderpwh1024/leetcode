package com.coderpwh.leetcode;

/****
 *
 *  g = [1,2,3], s = [1,1]
 *
 */
public class FindContentChildren {

    public static void main(String[] args) {

         int [] g = {1,2,3};
         int [] s = {1,1};
         // 1
        //   g = [1,2], s = [1,2,3]   2

        FindContentChildren find  = new FindContentChildren();
        find.findContentChildren(g,s);
        System.out.println(find.findContentChildren(g,s));

    }

    public int findContentChildren(int[] g, int[] s) {


         int count = 0;
         for(int i=0;i<g.length;i++){

             for(int j=0;j<s.length;j++){
                 if(g[i]==s[j]){
                     count++;
                     break;
                 }
             }

         }

        return count;

    }



}
