class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int sum=0;
        int[] b=new int[n];
        for(int x:nums) sum+=x;
        int lsum=0;
        for(int i=0;i<n;i++){ 

            int rsum=sum-lsum-nums[i];
            b[i]=Math.abs(lsum-rsum);
            lsum+=nums[i];
        }
        return b;
        
    }
}