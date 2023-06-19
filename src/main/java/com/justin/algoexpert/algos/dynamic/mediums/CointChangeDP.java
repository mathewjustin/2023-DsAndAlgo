package com.justin.algoexpert.algos.dynamic.mediums;

import java.util.Arrays;

/**
 * @author Justin Mathew @dev_io
 *
 * i is the amount we want to make up....
 * dp[i] stores the fewest the number of coins to make up the mount i.
 *
 * dp[i]=min(dp[i], dp[i-coin]+1)
 *
 */
public class CointChangeDP {

    public static void main(String[] args) {
        System.err.println(coinChange(new int[]{1,2,5},11));

    }

    public static int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {//Basically for each i we iterate through all the coins and figure out min . Like in bruteforce we do sub branches.
                 if (coins[j] <= i) {//i is the amount we want to make up. It checks if the coin can contribute towards making the amount i
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1); //i - coins[j] i is the amount we want to make up so i - coins[j] means amount minus coin...Remainder plus one.
                 }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
