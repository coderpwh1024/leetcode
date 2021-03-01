package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

/***
 *
 */
public class SortArrayByParity {

    public static void main(String[] args) {

        /***
         *   4,2 1 3
         */
        int[] arr = {3, 1, 2, 4};

        SortArrayByParity sort = new SortArrayByParity();
//        sort.sortArrayByParity(arr);
//        System.out.println(sort.sortArrayByParity(arr));

        sort.test(arr);

    }

    
    

    /****
     *    思路:
     *      1: 时间复杂度为O(N)
     *      2: 空间复杂度为O(N) 多创建了数组空间
     *      3: 2个for循环即可
     *
     *
     *
     * @param A
     */
    public void test(int[] A) {

        int[] arr = new int[A.length];
        int t = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                arr[t++] = A[i];
            }
        }


        for (int j = 0; j < A.length; j++) {
            if (A[j] % 2 != 0) {
                arr[t++] = A[j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }


    /****
     *    思路：
     *      1：时间复杂度为O(N^N)
     *      2：空间复杂度为O(N)
     *      3: for循环过多
     *
     *
     * @param A
     * @return
     */
    public int[] sortArrayByParity(int[] A) {


        int[] arr = new int[A.length];

        List<Integer> dateList = new ArrayList<>();


        List<Integer> list = new ArrayList<>();
        List<Integer> date = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {

            if (A[i] % 2 == 0) {
                list.add(A[i]);
            } else {
                date.add(A[i]);
            }
        }


        for (Integer a : list) {
            dateList.add(a);
        }
        for (Integer b : date) {
            dateList.add(b);
        }

        for (int i = 0; i < dateList.size(); i++) {
            arr[i] = dateList.get(i);
        }

        return arr;

    }

}
