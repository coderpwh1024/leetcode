package com.coderpwh.test;

public class ArraySort {

    public static void main(String[] args) {

        Integer arr[]={3,1,2,9,7,5,6};


         // 冒泡排序
//        maotao(arr);

        test2(arr);

    }


    /***
     *   冒泡排序
     *
     *   时间复杂度为O(N^2)
     *   空间复杂度为O(1)
     *
     *
     *
     *
     *
     */
    public static  void maotao(Integer arr[]){

        if(arr.length<=0){
            System.out.println("当前数组为空");
        }


        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    Integer temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }











      public  static void test2(Integer[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    Integer temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

      }






}
