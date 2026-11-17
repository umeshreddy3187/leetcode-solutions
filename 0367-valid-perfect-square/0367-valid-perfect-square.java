class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==0) return false;
        if(num==1) return true;
        long l=1;
        long r=num/2;
        while(l<=r){
            long mid=l+(r-l)/2;
            if(mid*mid==num){
                return true;
            }
            if(mid*mid<num){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return false;
        
    }
}