class Solution {
    public int maxProfit(int k,int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n+1][k+1][2];
        for(int[][]d : dp){
            for(int []d1:d){
                Arrays.fill(d1,-1);
            }
        }
        return solve(0,k,1,prices,dp);
    }

    public int solve(int idx, int k, int canBuy, int[] prices,int[][][]dp) {
        if (idx >= prices.length|| k==0) {
            return 0;
        }
        if(dp[idx][k][canBuy] != -1){
            return dp[idx][k][canBuy]; 
        }

        if (canBuy == 1) {
            int idle = solve(idx + 1,k, canBuy, prices,dp);
            int buy = -prices[idx] + solve(idx + 1,k, 1 - canBuy, prices,dp);
            return dp[idx][k][canBuy] = Math.max(idle, buy);
        } else {
            int idle = solve(idx + 1, k, canBuy, prices,dp);
            int sell = prices[idx] + solve(idx + 1, k - 1, 1 - canBuy, prices,dp);
            return dp[idx][k][canBuy] = Math.max(idle, sell);
        }

    }

}