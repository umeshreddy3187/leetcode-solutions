class Solution {
    public int climbStairs(int n, int[] costs) {
        long[] dp = new long[n + 1];
        java.util.Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0;
        
        for (long j = 1; j <= n; j++) {
            for (long i = Math.max(0, j - 3); i < j; i++) {
                int costVal = costs[(int)j - 1];
                long jumpCost = costVal + (j - i) * (j - i);
                dp[(int)j] = Math.min(dp[(int)j], dp[(int)i] + jumpCost);
            }
        }
        
        return (int) dp[n];
    }
}