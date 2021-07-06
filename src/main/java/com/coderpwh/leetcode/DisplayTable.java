package com.coderpwh.leetcode;

import java.util.*;

public class DisplayTable {

    public static void main(String[] args) {

//        orders = [["David","3","Ceviche"],["Corina","10","Beef Burrito"],["David","3","Fried Chicken"],["Carla","5","Water"],["Carla","5","Ceviche"],["Rous","3","Ceviche"]]

        List<List<String>> orders = new ArrayList<>();

        List<String> list1 = new ArrayList<>();
        list1.add("David");
        list1.add("3");
        list1.add("Ceviche");
        orders.add(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Corina");
        list2.add("10");
        list2.add("Beef Burrito");
        orders.add(list2);

        List<String> list3 = new ArrayList<>();
        list3.add("David");
        list3.add("3");
        list3.add("Fried Chicken");
        orders.add(list3);


        List<String> list4 = new ArrayList<>();
        list4.add("Carla");
        list4.add("5");
        list4.add("Water");
        orders.add(list4);


        List<String> list5 = new ArrayList<>();
        list5.add("Carla");
        list5.add("5");
        list5.add("Ceviche");
        orders.add(list5);

        List<String> list6 = new ArrayList<>();
        list6.add("Rous");
        list6.add("3");
        list6.add("Ceviche");
        orders.add(list6);


        DisplayTable table = new DisplayTable();
        table.displayTable(orders);

    }


    /***
     *
     * [
     *
     * ["Table","Beef Burrito","Ceviche","Fried Chicken","Water"],
     * ["3","0","2","1","0"],
     * ["5","0","1","0","1"],
     * ["10","1","0","0","0"]
     *
     * ]

     Table,Beef Burrito,Ceviche,Fried Chicken,Water
     3    ,0           ,2      ,1            ,0
     5    ,0           ,1      ,0            ,1
     10   ,1           ,0      ,0            ,0
     * @param orders
     * @return
     */
    public List<List<String>> displayTable(List<List<String>> orders) {

        Set<String> nameSet = new HashSet<String>();

        Map<Integer, Map<String, Integer>> foodsCnt = new HashMap<Integer, Map<String, Integer>>();

        for (List<String> order : orders) {
            nameSet.add(order.get(2));
            int id = Integer.parseInt(order.get(1));
            Map<String, Integer> map = foodsCnt.getOrDefault(id, new HashMap<String, Integer>());
            map.put(order.get(2), map.getOrDefault(order.get(2), 0) + 1);
            foodsCnt.put(id, map);
        }


        int n = nameSet.size();
        List<String> names = new ArrayList<>();
        for (String name : nameSet) {
            names.add(name);
        }
        Collections.sort(names);


        int m = foodsCnt.size();
        List<Integer> ids = new ArrayList<>();
        for (int id : foodsCnt.keySet()) {
            ids.add(id);
        }
        Collections.sort(ids);


        List<List<String>> table = new ArrayList<>();
        List<String> header = new ArrayList<>();
        header.add("Table");

        for (String name : names) {
            header.add(name);
        }
        table.add(header);

        for (int i = 0; i < m; i++) {
            int id = ids.get(i);

            Map<String, Integer> cnt = foodsCnt.get(id);
            List<String> row = new ArrayList<String>();
            row.add(Integer.toString(id));

            for (int j = 0; j < n; ++j) {
                row.add(Integer.toString(cnt.getOrDefault(names.get(j), 0)));
            }
            table.add(row);
        }

        return table;
    }
}
