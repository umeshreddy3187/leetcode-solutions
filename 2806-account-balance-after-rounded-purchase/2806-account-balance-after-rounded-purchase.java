class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int n=purchaseAmount%10;
        if(n<5){
            purchaseAmount-=n;
        }
        else if(n>=5){
            purchaseAmount+=(10-n);
        }
        return 100-purchaseAmount;
        
    }
}