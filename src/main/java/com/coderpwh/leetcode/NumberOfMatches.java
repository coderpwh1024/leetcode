package com.coderpwh.leetcode;

/**
 * 给你一个整数 n ，表示比赛中的队伍数。比赛遵循一种独特的赛制：
 * <p>
 * 如果当前队伍数是 偶数 ，那么每支队伍都会与另一支队伍配对。总共进行 n / 2 场比赛，且产生 n / 2 支队伍进入下一轮。
 * 如果当前队伍数为 奇数 ，那么将会随机轮空并晋级一支队伍，其余的队伍配对。总共进行 (n - 1) / 2 场比赛，且产生 (n - 1) / 2 + 1 支队伍进入下一轮。
 * 返回在比赛中进行的配对次数，直到决出获胜队伍为止。
 *
 * @author pengwenhao
 * @date 2022/1/25
 */
public class NumberOfMatches {

    public static void main(String[] args) {

        // 6
        int a = 7;

        //13
//        int a = 1;

        NumberOfMatches number = new NumberOfMatches();
        int count = number.numberOfMatches(a);

        System.out.println("count:" + count);
    }

    public int numberOfMatches(int n) {

        int count = 0;

        count = test(n, count);


        return count;
    }

    public int test(int n, int count) {


        int i = 0;
        while (n > 1) {

            if (n % 2 == 0) {
                int a = n / 2;
                n = n - a;
                count += a;
            } else {

                int a = (n - 1) / 2;
                n = n - a;
                count += a;
            }


            i++;
        }

        return count;
    }


}
