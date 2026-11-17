class Solution {
    public int integerBreak(int n) {
        if(n<=3) return n-1;
        double c=1;
        if(n%3==1){
            c*=4;
            n-=4;
        }
        else if(n%3==2){
            c*=2;
            n-=2;
        }
        c*=Math.pow(3,n/3);
        return (int)c;
    }
}