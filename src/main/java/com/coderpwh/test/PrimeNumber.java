package com.coderpwh.test;


/***
 * 找出不大N的最大质数
 */
public class PrimeNumber {

    public static void main(String[] args) {


         int n=10;

        PrimeNumber number = new PrimeNumber();

        Integer count = number.getMaxNumber(n);

        System.out.println("不大于n: "+n+",的最大的质数为:"+count);

    }


    /***
     *  时间复杂度为O(N^2)
     *
     * @param n
     * @return
     */
    public int getMaxNumber(int n){
        for(int i=n;i>2;i--){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    break;
                }
                if(j==i-1){
                    System.out.println(i);
                    return  i;
                }
            }
        }
        return  -1;
    }


}
