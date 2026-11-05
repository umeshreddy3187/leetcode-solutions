class Solution {
    public int findGCD(int[] nums) {
        int max=nums[0],min=nums[0];
        for(int n:nums){
            max=Math.max(n,max);
            min=Math.min(n,min);
        }
        return gcd(max,min);
        
    }
    int gcd(int i,int j){
        return j==0?i:gcd(j,i%j);
    }
}