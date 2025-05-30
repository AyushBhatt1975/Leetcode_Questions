class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for ( int[] d : dp) {
            Arrays.fill(d, -1);
        }
        return solve(m - 1, n - 1, dp);

    }

    private static int solve(int i, int j, int[][] dp) {
        if (i == 0 && j == 0) {
            return 1;
        }
        if (i < 0 || j < 0) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int up = solve(i - 1, j, dp);
        int down = solve(i, j - 1, dp);

        dp[i][j] = up + down;

        return dp[i][j];
    }
}