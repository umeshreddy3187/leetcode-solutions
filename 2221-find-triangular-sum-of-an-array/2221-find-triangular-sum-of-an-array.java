class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length; 
        if(n==1) return nums[0]; 
        int[] num=new int[n-1]; 
        for(int i=0;i<n-1;i++){
            num[i]=(nums[i+1]+nums[i])%10; 
        } 
        return triangularSum(num); 
    } 
}