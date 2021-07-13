package com.coderpwh.leetcode;

public class DivisorGame {

    public static void main(String[] args) {

        int n = 2;

        DivisorGame game = new DivisorGame();
//        game.divisorGame(n);
        System.out.println(game.divisorGame(n));
    }

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

}
