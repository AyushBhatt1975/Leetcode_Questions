class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length][amount + 1];
        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }
        int ans = minCoins(0, amount, coins, dp);
        if (ans == 100000) {
            return -1;
        }
        return ans;
    }

    public int minCoins(int idx, int amount, int[] coins, int[][] dp) {
        if (amount == 0) {
            return 0;
        }
        if (idx >= coins.length) {
            return 100000;

        }
        if (dp[idx][amount] != -1) {
            return dp[idx][amount];
        }
        int take = 100000;
        if (coins[idx] <= amount) {
            take = 1 + minCoins(idx, amount - coins[idx], coins, dp);
        }
        int nottake = minCoins(idx + 1, amount, coins, dp);

        dp[idx][amount] = Math.min(take, nottake);
        return dp[idx][amount];
    }
}