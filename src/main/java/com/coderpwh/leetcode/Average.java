package com.coderpwh.leetcode;

public class Average {


    public static void main(String[] args) {


//        int[] arr = {4000, 3000, 1000, 2000};

//        int[] arr = {8000, 9000, 2000, 3000, 6000, 1000};

        int arr[] = {48000, 59000, 99000, 13000, 78000, 45000, 31000, 17000, 39000, 37000, 93000, 77000, 33000, 28000, 4000, 54000, 67000, 6000, 1000, 11000};

        Average average = new Average();
//        average.average(arr);

        System.out.println(average.average(arr));

    }


    /***
     *
     *    思路:
     *       1. 时间复杂度为O(N)
     *       2. 空间复杂度为O(1)
     *       3. 主要控制double的范围
     *
     *
     * @param salary
     * @return
     */
    public double average(int[] salary) {


        double max = Integer.MIN_VALUE;

        double min = Integer.MAX_VALUE;

        double sum = 0;
        for (Integer num : salary) {
            sum += num;

            max = Math.max(num, max);
            min = Math.min(num, min);
        }

        return (sum - max - min) / (salary.length - 2);


    }
}
