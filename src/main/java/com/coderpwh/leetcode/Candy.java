package com.coderpwh.leetcode;

/****
 *
 *   135 分发糖果
 * 老师想给孩子们分发糖果，有 N 个孩子站成了一条直线，老师会根据每个孩子的表现，预先给他们评分。
 *
 * 你需要按照以下要求，帮助老师给这些孩子分发糖果：
 *
 * 每个孩子至少分配到 1 个糖果。
 * 相邻的孩子中，评分高的孩子必须获得更多的糖果。
 * 那么这样下来，老师至少需要准备多少颗糖果呢？
 *
 * 示例 1:
 *
 * 输入: [1,0,2]
 * 输出: 5
 * 解释: 你可以分别给这三个孩子分发 2、1、2 颗糖果。
 * 示例 2:
 *
 * 输入: [1,2,2]
 * 输出: 4
 * 解释: 你可以分别给这三个孩子分发 1、2、1 颗糖果。
 *      第三个孩子只得到 1 颗糖果，老师想给孩子们分发糖果，有 N 个孩子站成了一条直线，老师会根据每个孩子的表现，预先给他们评分。

 你需要按照以下要求，帮助老师给这些孩子分发糖果：

 每个孩子至少分配到 1 个糖果。
 相邻的孩子中，评分高的孩子必须获得更多的糖果。
 那么这样下来，老师至少需要准备多少颗糖果呢？

 示例 1:

 输入: [1,0,2]
 输出: 5
 解释: 你可以分别给这三个孩子分发 2、1、2 颗糖果。
 示例 2:

 输入: [1,2,2]
 输出: 4
 解释: 你可以分别给这三个孩子分发 1、2、1 颗糖果。
 第三个孩子只得到 1 颗糖果，这已满足上述两个条件。
 *
 *
 */
public class Candy {

    public static void main(String[] args) {


//        int arr[] = {1, 0, 2};

//        int arr[] = {1, 2, 2};

        int arr[] = {1, 2, 87, 87, 87, 2, 1};


        //  1  1 0  2 2  2
//        int arr[] = {1, 1, 0, 2, 2, 2};

        Candy candy = new Candy();
//        candy.candy(arr);
        candy.test(arr);
        System.out.println(candy.test(arr));


    }


    /****
     *
     *
     *
     * @param ratings
     * @return
     */
    public int test(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];
        for (int i = 0; i < n; i++) {
            if (i > 0 && ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }

        int right = 0, ret = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1 && ratings[i] > ratings[i + 1]) {
                right++;
            } else {
                right = 1;
            }
            ret += Math.max(left[i], right);
        }
        return ret;
    }


    /******
     *     此方法不通
     *
     *
     * @param ratings
     * @return
     */
    public int candy(int[] ratings) {

        int sum = 0;

        int min = ratings[0];
        int index = -1;

        for (int i = 0; i < ratings.length; i++) {
            min = Math.min(min, ratings[i]);
        }


        for (int i = 0; i < ratings.length; i++) {
            if (ratings[i] == min) {
                index = i;
                break;
            }
        }

        int sum1 = 0;
        for (int i = index; i > 0; i--) {
            if (ratings[i] < ratings[i - 1]) {
                sum1 = sum1 + 2;
            } else {
                sum1 = sum1 + 1;
            }
        }

        int sum2 = 0;

        for (int i = index; i < ratings.length - 1; i++) {

            if (ratings[i + 1] > ratings[i]) {
                sum2 = sum2 + 2;
            } else {
                sum2 = sum2 + 1;
            }
        }

        System.out.println(sum1);
        System.out.println(sum2);
        sum = sum1 + sum2 + 1;
        System.out.println(sum);


        return sum;
    }

}
