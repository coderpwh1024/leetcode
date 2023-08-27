package com.coderpwh.view;


import java.util.ArrayList;
import java.util.List;

/***
 * 1000个数范围是[0,999],有2个相同的数，请设计算法找出来
 */
public class FindTwoNumber {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(99);
        list.add(999);
        list.add(91);
        list.add(0);
        list.add(2);
        list.add(1);

        FindTwoNumber find = new FindTwoNumber();
        Integer result = find.findNumber(list);
        System.out.println(result);



    }

    public Integer findNumber(List<Integer> list){
         if(list!=null&&list.size()>0){
             for(int i=0;i<list.size();i++){
                 for(int j=0;j<list.size();j++){
                     if(list.get(i).equals(list.get(j))&&i!=j){
                         return  list.get(i);
                     }
                 }
             }
         }
        return  -1;
    }


}
