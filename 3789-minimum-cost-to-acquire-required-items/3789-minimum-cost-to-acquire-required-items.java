class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long cost=Math.min(costBoth,cost1+cost2)*(long)Math.min(need1,need2);
        if(need1>need2){
            long rem1=need1-need2;
            cost+=Math.min(costBoth,cost1)*rem1;
        } 
        else {
            long rem2=need2-need1;
            cost+=Math.min(costBoth,cost2)*rem2;
        }
        return cost;
        
    }
}