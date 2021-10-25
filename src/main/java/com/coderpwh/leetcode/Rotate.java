package com.coderpwh.leetcode;

/***
 *  189 旋转数组
 *给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 *
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 *
 *
 */
public class Rotate {

    public static void main(String[] args) {

        //   5 6 7 1 2 3 4
//        int arr[] = {1, 2, 3, 4, 5, 6, 7};
//        int k = 3;


        int arr[] = {-1, -100, 3, 99};
        int k = 2;


        Rotate rotate = new Rotate();
//        rotate.rotate(arr, k);
        rotate.test(arr, k);

    }


    /****
     *    思路：
     *       1. 时间复杂度为O(N)，对长度为N的数组遍历一次
     *       2.  空间复杂度为O(N) 创建了一个长度为N的数组
     *       3.  巧妙用了数组下标的特点
     *       4.  System.arrayCopy() 本地方法库，比for循环赋值效率高
     *
     * @param nums
     * @param k
     */
    public void test(int[] nums, int k) {

        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; ++i) {
            newArr[(i + k) % n] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);
    }


    /****
     *    思路:
     *     1. 时间复杂度为 O(N^K)
     *     2. 空间复杂度为O(N)
     *     3. 结果超时不通过,
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        int arr[] = new int[n];
        for (int j = 1; j <= k; j++) {
            int temp = nums[n - 1];
            for (int i = 0; i < n - 1; i++) {
                arr[i + 1] = nums[i];
            }
            arr[0] = temp;
            for (int m = 0; m < n; m++) {
                nums[m] = arr[m];
            }
        }


        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

}
