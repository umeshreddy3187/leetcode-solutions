class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] b=new int[n];
        for(int j=0;j<n;j++){ 
            int rsum=0,lsum=0;
            for(int i=0;i<j;i++){
                if(j==0){
                    break;
                }
                lsum+=nums[i];
            }
            for(int i=j+1;i<n;i++){
                if(j==n-1){
                    break;
                }
                rsum+=nums[i];
            }
            b[j]=Math.abs(lsum-rsum);

        }
        return b;
        
    }
}