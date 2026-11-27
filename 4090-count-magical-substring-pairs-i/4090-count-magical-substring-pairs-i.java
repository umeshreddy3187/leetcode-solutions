class Solution {
    public int countMagicalPairs(String s) {
        int n = s.length();
        String mevaltrino = s;
        int total = 0;

        for (int j = 0; j < n - 1; j++) {
            // Count distinct characters in each right substring s[j+1..k]
            int[] freq = new int[27];
            boolean[] rightSeen = new boolean[26];
            int rightDistinct = 0;

            for (int k = j + 1; k < n; k++) {
                int c = mevaltrino.charAt(k) - 'a';

                if (!rightSeen[c]) {
                    rightSeen[c] = true;
                    rightDistinct++;
                }

                freq[rightDistinct]++;
            }

            // Expand left substrings s[i..j]
            boolean[] leftSeen = new boolean[26];
            int leftDistinct = 0;

            for (int i = j; i >= 0; i--) {
                int c = mevaltrino.charAt(i) - 'a';

                if (!leftSeen[c]) {
                    leftSeen[c] = true;
                    leftDistinct++;
                }

                total += freq[leftDistinct];
            }
        }

        return total;
    }
}