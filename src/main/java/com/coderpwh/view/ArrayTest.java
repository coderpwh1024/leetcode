package com.coderpwh.view;

import java.util.ArrayList;
import java.util.List;


/***
 * 奇数在前，偶数在后，奇数的相对位置与偶数的相对位置保持不变
 *
 */
public class ArrayTest {
    public static void main(String[] args) {

//        Integer[] arr = {2, 5, 4, 3, 1, 6, 8, 9};


        int[] arr = {1, 2, 3, 4, 5};

        ArrayTest arrayTest = new ArrayTest();

      /*

        List<Integer> result = arrayTest.exchange(arr);


        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
          */

        int[] result = arrayTest.trainingPlan(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }


    }


    public int[] trainingPlan(int[] actions) {

        int i = 0;
        int j = actions.length - 1;
        int temp;

        while (i < j) {
            while (i < j && (actions[i] & 1) == 1) {
                i++;
            }
            while (i < j && (actions[j] & 1) == 0) {
                j--;
            }
            temp = actions[i];
            actions[i] = actions[j];
            actions[j] = temp;
        }
        return actions;

    }


    /***
     * 时间时间复杂度为O(N)
     * 空间复杂度为O(N)
     * @param arr
     * @return
     */
    public List<Integer> exchange(Integer[] arr) {


        List<Integer> list = new ArrayList<>();
        List<Integer> listOne = new ArrayList<>();
        List<Integer> listTwo = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                listTwo.add(arr[i]);
            } else {
                listOne.add(arr[i]);
            }
        }

        list.addAll(listOne);
        list.addAll(listTwo);

        return list;
    }


}
