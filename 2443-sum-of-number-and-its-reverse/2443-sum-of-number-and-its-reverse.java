class Solution {
    int reverse(int x){
        int rev=0;
        while(x>0){
            int rem=x%10;
            rev=rev*10+rem;
            x/=10;
        }
        return rev;
    }
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0) return true;
        for(int i=1;i<num;i++){
            if(i+reverse(i)==num){
                return true;
            }
        }
        return false;

        
    }
}