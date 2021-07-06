package com.coderpwh.leetcode;

import java.util.*;


/****
 *
 *  1418  点菜展示表
 *
 *
 * 给你一个数组 orders，表示客户在餐厅中完成的订单，确切地说， orders[i]=[customerNamei,tableNumberi,foodItemi] ，其中 customerNamei 是客户的姓名，tableNumberi 是客户所在餐桌的桌号，而 foodItemi 是客户点的餐品名称。
 *
 * 请你返回该餐厅的 点菜展示表 。在这张表中，表中第一行为标题，其第一列为餐桌桌号 “Table” ，后面每一列都是按字母顺序排列的餐品名称。接下来每一行中的项则表示每张餐桌订购的相应餐品数量，第一列应当填对应的桌号，后面依次填写下单的餐品数量。
 *
 * 注意：客户姓名不是点菜展示表的一部分。此外，表中的数据行应该按餐桌桌号升序排列。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：orders = [["David","3","Ceviche"],["Corina","10","Beef Burrito"],["David","3","Fried Chicken"],["Carla","5","Water"],["Carla","5","Ceviche"],["Rous","3","Ceviche"]]
 * 输出：[["Table","Beef Burrito","Ceviche","Fried Chicken","Water"],["3","0","2","1","0"],["5","0","1","0","1"],["10","1","0","0","0"]]
 * 解释：
 * 点菜展示表如下所示：
 * Table,Beef Burrito,Ceviche,Fried Chicken,Water
 * 3    ,0           ,2      ,1            ,0
 * 5    ,0           ,1      ,0            ,1
 * 10   ,1           ,0      ,0            ,0
 * 对于餐桌 3：David 点了 "Ceviche" 和 "Fried Chicken"，而 Rous 点了 "Ceviche"
 * 而餐桌 5：Carla 点了 "Water" 和 "Ceviche"
 * 餐桌 10：Corina 点了 "Beef Burrito"
 * 示例 2：
 *
 * 输入：orders = [["James","12","Fried Chicken"],["Ratesh","12","Fried Chicken"],["Amadeus","12","Fried Chicken"],["Adam","1","Canadian Waffles"],["Brianna","1","Canadian Waffles"]]
 * 输出：[["Table","Canadian Waffles","Fried Chicken"],["1","2","0"],["12","0","3"]]
 * 解释：
 * 对于餐桌 1：Adam 和 Brianna 都点了 "Canadian Waffles"
 * 而餐桌 12：James, Ratesh 和 Amadeus 都点了 "Fried Chicken"
 *
 *
 *
 *
 *
 */
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
     *      思路:
     *         1. 时间复杂度为O(T+NlogN+MlogM+MN)
     *         2.  空间复杂度为O(T+N+M)
     *
     *
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

        for (List<String> t : table) {
            System.out.println(t);
        }

        return table;
    }


    public List<List<String>> test(List<List<String>> orders) {

        Set<String> nameSet = new HashSet<>();

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

            for (int j = 0; j < n; j++) {
                row.add(Integer.toString(cnt.getOrDefault(names.get(j), 0)));
            }
            table.add(row);

        }
        return table;
    }


}
