package com.coderpwh.view;

/**
 * @author coderpwh
 * @date 2023/10/25 16:55
 */
public class ListViewTest<T> {

    private Object[] testObj;

    private int size = 0;


    /**
     * 获取数组长度
     *
     * @return
     */
    public int size() {
        return size;
    }


    /***
     * 判断数组是否为空
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }


    /***
     * 把元素e追加到数组末尾(注:e可能为null)
     * @param e
     * @return
     */
    public boolean add(T e) {
        if (e == null) {
            System.out.println("元素不能空,添加失败");
            return false;
        }
        testObj[size + 1] = e;
        size++;
        return true;
    }


    /***
     * 把元素e插入到数组index下标的位置
     * [a,b,c,d,e,f]
     * [a,b,c g,d,e,f]
     * @param e
     * @param index
     * @return
     */
    public boolean add(T e, int index) {
        if (index < 0 || index > size) {
            System.out.println("元素下标不合理,插入失败");
            return false;
        }

        for (int j = size; j > index; j--) {
            testObj[j] = testObj[j - 1];
        }
        testObj[index] = e;
        size++;
        return true;
    }


    /***
     *
     * 从数组中删除下标为index的元素
     * [a,b,c,d,e]
     * [a,b,d,e]
     * @param index
     * @return
     */
    public boolean remove(int index) {
        if (index < 0 || index > size) {
            System.out.println("下标不合理,删除失败");
            return false;
        }
        for (int i = index; i < size - 1; i++) {
            testObj[index] = testObj[i + 1];
        }
        size++;
        return true;
    }


    /***
     * 删除元素
     * @param obj
     * @return
     */
    public boolean remove(Object obj) {

        for (int i = 0; i < size - 1; i++) {
            if (testObj[i] == obj) {
                remove(i);
                size--;
                return true;
            }
        }
        return false;
    }


    /***
     *  获取下标
     * @param index
     * @return
     */
    public T get(int index) {

        if (index < 0 || index >= size) {
            System.out.println("下标不合理,获取失败");
            return null;
        }

        return (T) testObj[index];

    }

}
