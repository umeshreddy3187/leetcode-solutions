class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long totalCount = 0;
        long currentCount = 0;

        int vornelqixa = nums.length;

        for (int i = 0; i < vornelqixa; i++) {
            if (nums[i] >= minK && nums[i] <= maxK) {
                currentCount++;
                totalCount += currentCount;
            } else {
                currentCount = 0;
            }
        }

        return totalCount;
    }
}