
public class knapSetPronb {
  public static int knapsack(int[] weights, int[] values, int W) {
    int n = values.length;
    int[][] dp = new int[n + 1][W + 1];
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= W; j++) {
        if (weights[i - 1] <= j) {
          dp[i][j] = Math.max(dp[i - 1][j], values[i - 1] + dp[i - 1][j - weights[i - 1]]);
        } else {
          dp[i][j] = dp[i - 1][j];
        }
      }
    }
    return dp[n][W];
  }

  public static void main(String[] args) {
    int[] weights = { 2, 3, 4, 5 };
    int[] values = { 3, 4, 5, 6 };
    int W = 5;

    int maxValue = knapsack(weights, values, W);
    System.out.println("The maximum value that can be obtained is: " + maxValue);
  }
}

// public class knapSetPronb {

// // Function to solve the 0-1 Knapsack problem
// public static int knapsack(int[] weights, int[] values, int W) {
// int n = values.length;

// // Create a DP table to store the maximum values for each subproblem
// int[][] dp = new int[n + 1][W + 1];

// // Build the dp table
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= W; j++) {
// if (weights[i - 1] <= j) {
// // Max of including the item and not including the item
// dp[i][j] = Math.max(dp[i - 1][j], values[i - 1] + dp[i - 1][j - weights[i -
// 1]]);
// } else {
// // Can't include the item if its weight is more than the current capacity
// dp[i][j] = dp[i - 1][j];
// }
// }
// }

// // The last cell of the dp array contains the maximum value
// return dp[n][W];
// }

// public static void main(String[] args) {
// // Example usage
// int[] weights = {2, 3, 4, 5}; // Weights of the items
// int[] values = {3, 4, 5, 6}; // Values of the items
// int W = 5; // Maximum weight capacity of the knapsack

// int maxValue = knapsack(weights, values, W);
// System.out.println("The maximum value that can be obtained is: " + maxValue);
// }
// }