
class Solution {
    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;

        int[] sa = buildSuffixArray(nums);

        
        int[] pos = new int[n];

        for (int i = 0; i < n; i++) {
            pos[sa[i]] = i;
        }

        int[] maxLcp = new int[n];
        int h = 0;

        for (int i = 0; i < n; i++) {
            int p = pos[i];

            if (p == 0) {
                h = 0;
                continue;
            }

            int j = sa[p - 1];

            while (i + h < n && j + h < n &&
                   nums[i + h] == nums[j + h]) {
                h++;
            }

            maxLcp[i] = Math.max(maxLcp[i], h);
            maxLcp[j] = Math.max(maxLcp[j], h);

            if (h > 0) h--;
        }

        int ans = n;

        for (int i = 0; i < n; i++) {
            int len = maxLcp[i] + 1;

            if (len <= n - i) {
                ans = Math.min(ans, len);
            }
        }

        return ans;
    }

    int[] buildSuffixArray(int[] nums) {
        int n = nums.length;

        int[] sa = new int[n];
        int[] rank = nums.clone();
        int[] temp = new int[n];
        int[] newRank = new int[n];

        for (int i = 0; i < n; i++) {
            sa[i] = i;
        }

        int maxRank = 100000;

        for (int k = 1; k < n; k *= 2) {

            countingSort(sa, temp, rank, k, maxRank);
            countingSort(temp, sa, rank, 0, maxRank);

            int classes = 0;

            newRank[sa[0]] = classes;

            for (int i = 1; i < n; i++) {
                int a = sa[i - 1];
                int b = sa[i];

                int a1 = rank[a];
                int b1 = rank[b];

                int a2 = (a + k < n) ? rank[a + k] : -1;
                int b2 = (b + k < n) ? rank[b + k] : -1;

                if (a1 != b1 || a2 != b2) {
                    classes++;
                }

                newRank[b] = classes;
            }

            int[] swap = rank;
            rank = newRank;
            newRank = swap;

            maxRank = classes;

            if (classes == n - 1) break;
        }

        return sa;
    }

    void countingSort(
        int[] input,
        int[] output,
        int[] rank,
        int offset,
        int maxRank
    ) {
        int[] count = new int[maxRank + 2];

        for (int idx : input) {
            int key = (idx + offset < rank.length)
                ? rank[idx + offset] + 1
                : 0;

            count[key]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = input.length - 1; i >= 0; i--) {
            int idx = input[i];

            int key = (idx + offset < rank.length)
                ? rank[idx + offset] + 1
                : 0;

            output[--count[key]] = idx;
        }
    }
}
