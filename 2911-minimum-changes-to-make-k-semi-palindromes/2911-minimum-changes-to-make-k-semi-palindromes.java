import java.util.Arrays;

class Solution {
    public int minimumChanges(String s, int k) {
        int n = s.length();
        int[][] cost = new int[n][n];

        // Step 1: Precompute the cost to make substring s[i..j] a semi-palindrome
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int len = j - i + 1;
                int minChanges = Integer.MAX_VALUE;

                // Try all proper divisors d of len
                for (int d = 1; d < len; d++) {
                    if (len % d == 0) {
                        int currentCost = 0;
                        // Check each of the d groups
                        for (int g = 0; g < d; g++) {
                            int left = i + g;
                            int right = j - (d - 1 - g);
                            while (left < right) {
                                if (s.charAt(left) != s.charAt(right)) {
                                    currentCost++;
                                }
                                left += d;
                                right -= d;
                            }
                        }
                        minChanges = Math.min(minChanges, currentCost);
                    }
                }
                cost[i][j] = minChanges;
            }
        }

        // Step 2: DP to partition prefix s[0..j] into 'rem' semi-palindromes
        int INF = 1_000_000;
        int[][] dp = new int[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], INF);
        }
        dp[0][0] = 0;

        for (int rem = 1; rem <= k; rem++) {
            // Start index i must leave room for (rem - 1) previous substrings of length >= 2
            for (int i = 2 * (rem - 1); i < n; i++) {
                if (dp[i][rem - 1] == INF) continue;
                
                // End index j starts at i + 1 so substring s[i..j] has length >= 2
                for (int j = i + 1; j < n; j++) {
                    dp[j + 1][rem] = Math.min(dp[j + 1][rem], dp[i][rem - 1] + cost[i][j]);
                }
            }
        }

        return dp[n][k];
    }
}