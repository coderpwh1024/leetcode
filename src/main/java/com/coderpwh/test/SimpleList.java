package com.coderpwh.test;

public class SimpleList<T> {


    private Object[] testObj;

    private  int size=0;


    /**
     * 获取数组长度
     * @return
     */
    public int size(){
        return  -1;
    }


    /***
     * 判断数组是否为空
     * @return
     */
    public  boolean isEmpty(){
        return false;
    }


    /***
     * 把元素e追加到数组末尾(注:e可能为null)
     * @param e
     * @return
     */
    public  boolean add(T e){
        return false;
    }


    /***
     * 把元素e插入到数组index下标的位置
     * @param e
     * @param index
     * @return
     */
    public  boolean add(T e,int index){
        return  false;
    }


    /***
     * 从数组中删除下标为index的元素
     * @param index
     * @return
     */
    public  boolean remove(int index){
        return false;
    }

    public  T get(int index){
        return  null;
    }


}
