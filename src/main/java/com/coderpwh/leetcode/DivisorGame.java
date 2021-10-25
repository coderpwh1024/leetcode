package com.coderpwh.leetcode;


/***
 *    1025. 除数博弈
 *
 *
 *  爱丽丝和鲍勃一起玩游戏，他们轮流行动。爱丽丝先手开局。
 *
 * 最初，黑板上有一个数字 N 。在每个玩家的回合，玩家需要执行以下操作：
 *
 * 选出任一 x，满足 0 < x < N 且 N % x == 0 。
 * 用 N - x 替换黑板上的数字 N 。
 * 如果玩家无法执行这些操作，就会输掉游戏。
 *
 * 只有在爱丽丝在游戏中取得胜利时才返回 True，否则返回 False。假设两个玩家都以最佳状态参与游戏。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：2
 * 输出：true
 * 解释：爱丽丝选择 1，鲍勃无法进行操作。
 * 示例 2：
 *
 * 输入：3
 * 输出：false
 * 解释：爱丽丝选择 1，鲍勃也选择 1，然后爱丽丝无法进行操作
 *
 *
 */
public class DivisorGame {

    public static void main(String[] args) {

        int n = 3;

        DivisorGame game = new DivisorGame();
//        game.divisorGame(n);
        System.out.println(game.divisorGame(n));

        System.out.println(game.test(n));
    }


    /***
     *    思路:
     *      1. 时间复杂度为O(N)
     *      2. 空间复杂度为O(1)
     *      3. 测试用例不通过，没理解清楚题意
     *
     *
     *
     * @param n
     * @return
     */
    public boolean divisorGame(int n) {

        int x = 1;
        boolean flag = false;
        while (true) {

            if (x < n && n % x == 0) {
                n = n - x;
                flag = true;
                break;
            }
            x++;

        }

        return flag;

    }


    /***
     *   思路:
     *       1. 时间复杂度为O(1)
     *       2. 空间复杂度为O(1)
     *
     *       n： 1 事，（0，1）之间没有因子，故alisi 失败
     *       n: 2   alisi 取 1 n就变为1 了 alisi 成功
     *       n: 3   alisi 只能取 1 n变为2 ,根据2 的结论  alisi 失败
     *       n： 4  alisi 取 1 或2  取1：n 变为3 则 Bob则失败 ，取2 alisi 成功
     *       n： 5   alisi 取1 n变为4 alisi 失败
     *
     *       .........
     *
     *      奇数失败，偶数成功
     *
     *
     *
     * @param n
     * @return
     */
    public boolean test(int n) {
        return n % 2 == 0;
    }

}
