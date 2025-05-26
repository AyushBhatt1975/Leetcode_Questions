class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int result = solve(0, amount, coins, dp);
        return result >= (int)1e9 ? -1 : result;
    }

    private int solve(int idx, int target, int[] coins, int[][] dp) {
        if (idx == coins.length) {
            return target == 0 ? 0 : (int)1e9; 
        }

        if (dp[idx][target] != -1) return dp[idx][target];

        
        int notTake = solve(idx + 1, target, coins, dp);

        
        int take = (int)1e9;
        if (coins[idx] <= target) {
            take = 1 + solve(idx, target - coins[idx], coins, dp);
        }

        return dp[idx][target] = Math.min(take, notTake);
    }
}
