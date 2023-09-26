package Algorthims.DynamicProgramming;

public class Knapsack {

    /**
     * Comment Block: Solving 0-1 Knapsack Problem Using Dynamic Programming
     *
     * The knapSack method solves the 0-1 Knapsack problem by using a 2D dynamic programming array.
     * The problem aims to maximize the total value of items included in the knapsack without exceeding its capacity.
     *
     * @param W   The maximum weight the knapsack can hold
     * @param wt  Array containing weights of items
     * @param val Array containing values of items
     * @param n   Number of items
     * @return    The maximum value that can be obtained by including items in the knapsack
     */
    public static int knapSack(int W, int wt[], int val[], int n) {
        // 2D DP array to store the maximum value for each weight and number of items considered
        int[][] dp = new int[n + 1][W + 1];

        // Iterate through each item and each weight to fill up the DP table
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {

                // Base case: No items or no weight means zero value
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                }
                // Case when the item can be included in the knapsack
                else if (wt[i - 1] <= w) {
                    // Max value obtained by either including or excluding the item
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                }
                // Case when the item's weight exceeds the current knapsack weight limit
                else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        // The value at dp[n][W] will be the maximum value that can be obtained
        return dp[n][W];
    }
}


