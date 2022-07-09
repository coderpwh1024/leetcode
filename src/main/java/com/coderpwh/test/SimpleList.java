package com.coderpwh.test;

public class SimpleList <T>{

    private  Object[] testObj;

    private  int size=0;

    private  int initSize=10;

    /***
     *  获取数组长度
     * @return
     */
    public int size(){

        return  size;
    }


     // 构造函数中的初始化数组
    public SimpleList(){
        testObj = new Object[initSize];
        testObj.toString();
    }



    /***
     *  判断数组是否为空
     * @return
     */
    public boolean isEmpty(){
        return  this.size>0?false:true;

    }

    /***
     * 添加新元素
     * @param e
     * @return
     */
    public boolean add(T e){

          if(size>=testObj.length-1){
              Object[] a = new Object[testObj.length+1];
              a.toString();
              testObj=a;
          }

          testObj[size++]=e;
        return  true;
    }


    /***
     *  把元素e插入到数组index下标的位置
     * @param e
     * @param index
     * @return
     */
    public  boolean add(T e,int index){
        return  false;
    }


    /***
     *  移除元素
     * @param o
     * @return
     */
    public  boolean remove(Object o){

         // 会存在 数组越界问题等
        for(int i=0;i<size;i++){
            if(o.equals(testObj[i])){
                testObj[i]=testObj[i+1];
                size--;
            }
        }
        return  true;
    }


    /***
     *   根据下标移除元素
     * @param index
     * @return
     */
    public boolean remove(int index){

        for(int i=index;i<size;i++){
            testObj[i]=testObj[i+1];
        }
        testObj[size]=0;
        size--;
        return true;
    }

    /***
     * 获取其中的元素
     * @param index
     * @return
     */
    public T get(int index){

         return  (T)testObj[index];
    }






}
