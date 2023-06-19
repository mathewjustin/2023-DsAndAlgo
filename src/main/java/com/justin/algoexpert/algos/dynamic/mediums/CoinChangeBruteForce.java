package com.justin.algoexpert.algos.dynamic.mediums;

/**
 * @author Justin Mathew @dev_io
 *
 *
 * You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
 * Return the fewest number of coins that you need to make up that amount.
 * If that amount of money cannot be made up by any combination of the coins, return -1.
 * You may assume that you have an infinite number of each kind of coin.
 *
 *
 */
public class CoinChangeBruteForce {

    /*BruteForceAlgo*/

    public static void main(String[] args) {

        System.err.println(coinChange(new int[]{1,2,5},11));

    }

    public static int coinChange(int[] coins, int amount) {

         return recursionHelper(coins,amount);

    }

    public static int recursionHelper(int[] coins, int remain)

    {

        if(remain==0) return 0;
        if(remain<0) return -1;

        int minCount=Integer.MAX_VALUE;
        for(int coin : coins)
        {
            int count=recursionHelper(coins,remain-coin);
            if(count==-1) continue;
            minCount=Math.min(minCount,count+1);
        }
        return minCount==Integer.MAX_VALUE? -1 : minCount;
    }
}
