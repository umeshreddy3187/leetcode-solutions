class Solution {
    int s(int a){
        int sum=0;
        while(a>0){
            sum+=a%10;
            a/=10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int n:nums){
            sum1+=n;
            sum2+=s(n);
        }
        return Math.abs(sum1-sum2);
        
    }
}