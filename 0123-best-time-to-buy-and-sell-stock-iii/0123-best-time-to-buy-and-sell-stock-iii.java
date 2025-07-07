class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        // dp[idx][canBuy][transactionsLeft]
        int[][][] dp = new int[n][2][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return solve(0, 1, 2, prices, dp);
    }

    public int solve(int idx, int canBuy, int transactionsLeft, int[] prices, int[][][] dp) {
        if (idx == prices.length || transactionsLeft == 0) {
            return 0;
        }

        if (dp[idx][canBuy][transactionsLeft] != -1) {
            return dp[idx][canBuy][transactionsLeft];
        }

        int profit = 0;
        if (canBuy == 1) {
            int buy = -prices[idx] + solve(idx + 1, 0, transactionsLeft, prices, dp);
            int skip = solve(idx + 1, 1, transactionsLeft, prices, dp);
            profit = Math.max(buy, skip);
        } else {
            int sell = prices[idx] + solve(idx + 1, 1, transactionsLeft - 1, prices, dp);
            int skip = solve(idx + 1, 0, transactionsLeft, prices, dp);
            profit = Math.max(sell, skip);
        }

        return dp[idx][canBuy][transactionsLeft] = profit;
    }
}