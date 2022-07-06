package com.coderpwh.test;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1,4,6,9,10,15,20};
        int findVal = 9;

        System.out.println(getNumber(arr,0,arr.length,findVal));

    }


    /***
     * 二分查找
     * @param arr
     * @param left
     * @param right
     * @param findVal
     * @return
     */
    public static  int  getNumber(int[] arr,int left,int right,int findVal){

         if(left>right){
             return  -1;
         }

         int mid = (right-left)/2;

         if(arr[mid]==findVal){
             return mid;
         }

          // 向左查询
         if(arr[mid]>findVal){
           return     getNumber(arr,left,mid-1,findVal);
         }else{
             // 向右查询
           return    getNumber(arr,mid+1,right,findVal);
         }
    }



}
