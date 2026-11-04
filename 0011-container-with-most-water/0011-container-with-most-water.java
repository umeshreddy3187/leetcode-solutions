class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            if (height[left] >= height[right])
                right--;
            else
                left++;
            max = Math.max(max, area);
        }
        return max;

    }
}