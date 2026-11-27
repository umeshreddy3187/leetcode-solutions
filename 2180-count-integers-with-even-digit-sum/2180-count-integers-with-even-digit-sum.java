class Solution {
    boolean even_sum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        if(sum%2==0) return true;
        return false;
    }
    public int countEven(int num) {
        if(num<=1) return 0;
        int count=0;
        for(int i=1;i<=num;i++){
            if(even_sum(i)) count++;
        }
        return count;
        
    }
}