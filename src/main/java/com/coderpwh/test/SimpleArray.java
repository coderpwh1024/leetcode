package com.coderpwh.test;

/**
 * @author coderpwh
 * @date 2023/9/14 14:45
 */
public class SimpleArray<T> {

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
            System.out.println("e为空");
            return false;
        }
        testObj[size] = e;
        size++;
        return false;
    }


    /***
     * 把元素e插入到数组index下标的位置
     * @param e
     * @param index
     * @return
     */
    public boolean add(T e, int index) {
        if (index < 0 || index > size) {
            System.out.println("下标不合法");
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
     * @param index
     * @return
     */
    public boolean remove(int index) {
        if (index < 0 || index > size) {
            System.out.println("下标不合法");
            return false;
        }

        for (int i = index; i < size - 1; i++) {
            testObj[i] = testObj[i + 1];
        }
        size--;
        return true;
    }


    /***
     * 删除元素
     * @param obj
     * @return
     */
    public boolean remove(Object obj) {
        for (int i = 0; i < size - 1; i++) {
            if (testObj[i].equals(obj)) {
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
            System.out.println("小标不合法");
            return null;
        }
        return (T) testObj[index];
    }


}
