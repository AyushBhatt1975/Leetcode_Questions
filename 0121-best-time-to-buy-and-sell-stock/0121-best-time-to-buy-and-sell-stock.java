class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n+1][2][2];
        for(int[][]d : dp){
            for(int []d1:d){
                Arrays.fill(d1,-1);
            }
        }
        return solve(0,1,1,prices,dp);
    }

    public int solve(int idx, int transCount, int canBuy, int[] prices,int[][][]dp) {
        if (idx >= prices.length || transCount == 0) {
            return 0;
        }
        if(dp[idx][transCount][canBuy] != -1){
            return dp[idx][transCount][canBuy]; 
        }

        if (canBuy == 1) {
            int idle = solve(idx + 1, transCount, canBuy, prices,dp);
            int buy = -prices[idx] + solve(idx + 1, transCount, 1 - canBuy, prices,dp);
            return dp[idx][transCount][canBuy] = Math.max(idle, buy);
        } else {
            int idle = solve(idx + 1, transCount, canBuy, prices,dp);
            int sell = prices[idx] + solve(idx + 1, transCount - 1, 1 - canBuy, prices,dp);
            return dp[idx][transCount][canBuy] = Math.max(idle, sell);
        }

    }

}