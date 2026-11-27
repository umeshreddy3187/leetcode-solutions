class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0,i=x;
        while(i>0){
            sum+=(i%10);
            i/=10;
        }
        if(x%sum==0) return sum;
        return -1;
        
    }
}