class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n=items.length;
        int[] dp=new int[budget+1];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,items[i][1]);
            int free=0;
            for(int j=0;j<n;j++){
                if(i!=j && items[j][0]%items[i][0]==0){
                    free++;
                }
            }
            int price=items[i][1];
            int profit=free+1;
            for(int j=budget;j>=price;j--){
                dp[j]=Math.max(dp[j],dp[j-price]+profit);
            }
        }
        int ans=0;
        for(int i=0;i<=budget;i++){
            ans=Math.max(ans,dp[i]+(budget-i)/min);
        }
        return ans;
    }
}