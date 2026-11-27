class Solution {
    int encrypt(int x){
        int max=0,n=0;
        while(x>0){
            int rem=x%10;
            max=Math.max(rem,max);
            x/=10;
            n++;
        }
        int y=0;
        for(int i=1;i<=n;i++) y=y*10+max;
        return y;

    }
    public int sumOfEncryptedInt(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=encrypt(nums[i]);
        }
        return sum;
        
    }
}