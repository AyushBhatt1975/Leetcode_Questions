class Solution {
    int[][] q;
    int n;
    Long[] dp;

    public long mostPoints(int[][] questions) {
        this.q = questions;
        this.n = q.length;
        dp = new Long[n];

        return sol(0);
    }

    private long sol(int idx){
        if(idx >= n) return 0;
        if(dp[idx] != null) return dp[idx];

        int points = q[idx][0];
        int brainpower = q[idx][1];

        long solve = points + sol(idx+brainpower+1);

        long skip = sol(idx+1);

        return dp[idx] = Math.max(solve,skip);
    }
}