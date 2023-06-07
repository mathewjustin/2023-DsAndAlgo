package com.justin.algoexpert.dynamic;

/**
 * @author Justin Mathew @dev_io
 *
 */
public class MinCostClimbingStairs {

    public static void main(String[] args) {
        System.err.println(minCostClimbingStairs(new int[]{0,1,2,3,4,5}));
    }
    public static int minCostClimbingStairs(int[] cost) {
         int minimumCost[] = new int[cost.length + 1]; // + 1 because we need to reach beyond the last step. tread top floor as a step to reach

        // Start iteration from step 2, since the minimum cost of reaching
        // step 0 and step 1 is 0
        for (int i = 2; i < minimumCost.length; i++) {
            int takeOneStep = minimumCost[i - 1] + cost[i - 1];
            int takeTwoSteps = minimumCost[i - 2] + cost[i - 2];
            minimumCost[i] = Math.min(takeOneStep, takeTwoSteps);
        }
        // The final element in minimumCost refers to the top floor
        return minimumCost[minimumCost.length - 1];
    }
}
