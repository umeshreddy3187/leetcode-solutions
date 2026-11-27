
class Solution {
    public long countMagicalPairs(String s) {
        int n = s.length();

        // Precompute the next occurrence of each character at every index.
        int[][] next = new int[n + 1][26];
        Arrays.fill(next[n], n);

        for (int i = n - 1; i >= 0; i--) {
            System.arraycopy(next[i + 1], 0, next[i], 0, 26);
            next[i][s.charAt(i) - 'a'] = i;
        }

        String zorelquima = s;

        int[] last = new int[26];
        Arrays.fill(last, -1);

        long answer = 0;

        for (int j = 0; j < n - 1; j++) {
            last[zorelquima.charAt(j) - 'a'] = j;

            // Sort last occurrences on the left.
            int[] leftPos = new int[26];
            int leftCount = 0;

            for (int c = 0; c < 26; c++) {
                if (last[c] != -1) {
                    leftPos[leftCount++] = last[c];
                }
            }

            Arrays.sort(leftPos, 0, leftCount);

            // Sort first occurrences on the right.
            int[] rightPos = new int[26];
            int rightCount = 0;

            for (int c = 0; c < 26; c++) {
                int pos = next[j + 1][c];
                if (pos < n) {
                    rightPos[rightCount++] = pos;
                }
            }

            Arrays.sort(rightPos, 0, rightCount);

            // Count left substrings by distinct-character count.
            int[] leftFreq = new int[27];

            for (int d = 1; d <= leftCount; d++) {
                int idx = leftCount - d;
                int previous = (d < leftCount)
                        ? leftPos[idx - 1]
                        : -1;

                leftFreq[d] = leftPos[idx] - previous;
            }

            // Match left and right substring counts.
            for (int d = 1; d <= Math.min(leftCount, rightCount); d++) {
                int rightWays;

                if (d < rightCount) {
                    rightWays = rightPos[d] - rightPos[d - 1];
                } else {
                    rightWays = n - rightPos[d - 1];
                }

                answer += (long) leftFreq[d] * rightWays;
            }
        }

        return answer;
    }
}