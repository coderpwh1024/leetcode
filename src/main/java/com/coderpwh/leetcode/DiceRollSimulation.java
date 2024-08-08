package com.coderpwh.leetcode;

import java.util.Random;

public class DiceRollSimulation {


    public static void main(String[] args) {
        int targetSum = 2024;

        // 模拟次数
        int numSimulations = 100000;

        // 成功达到目标和的次数
        int successfulSimulations = 0;

        Random random = new Random();

        for (int i = 0; i < numSimulations; i++) {
            int totalSum = 0;
            while (totalSum < targetSum) {
                // 抛掷九面体
                totalSum += random.nextInt(9) + 1;
            }
            if (totalSum == targetSum) {
                successfulSimulations++;
            }
        }

        System.out.println(successfulSimulations);

        double probability = (double) successfulSimulations / numSimulations;
        System.out.printf("The estimated probability of reaching a sum of %d by rolling a nine-sided die is: %.8f%n", targetSum, probability);
    }
}
