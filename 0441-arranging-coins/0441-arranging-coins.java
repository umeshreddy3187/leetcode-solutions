class Solution {
    public int arrangeCoins(int n) {
        int c=0,j=n;
        for(int i=1;i<=n;i++){
            j-=i;
            if(j<i+1){
                c=i;
                break;
            }
        }
        return c;
    }
}