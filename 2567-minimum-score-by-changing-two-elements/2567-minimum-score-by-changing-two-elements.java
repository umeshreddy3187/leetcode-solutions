class Solution {
    public int minimizeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int max1=Math.abs(nums[2]-nums[n-1]);
        int s=max1;
        int max2=Math.abs(nums[1]-nums[n-2]);
        s=Math.min(s,max2);
        int max3=Math.abs(nums[0]-nums[n-3]);
        s=Math.min(s,max3);
        return s;
    }
}