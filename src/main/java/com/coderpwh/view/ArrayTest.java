package com.coderpwh.view;

import java.util.List;

public class ArrayTest {
    public static void main(String[] args) {

        Integer[] arr = {2, 5, 4, 3, 1, 6, 8, 9};


        ArrayTest arrayTest =  new ArrayTest();
         List<Integer> result = arrayTest.exchange(arr);


         for(int i=0;i<result.size();i++){
             System.out.print(result.get(i));
         }


    }


    public List<Integer> exchange(Integer[] arr) {

        return null;
    }


}
