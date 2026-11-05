class Solution {
    public int maximumProduct(int[] nums) {
        int m=1,x=1,n=nums.length;
        Arrays.sort(nums);
        m=nums[n-1]*nums[n-2]*nums[n-3];
        x=nums[n-1]*nums[0]*nums[1];
        
        return Math.max(m,x);
        
    }
}