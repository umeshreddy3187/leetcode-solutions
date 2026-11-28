class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n=items.length;
        int[] f=new int[n+1];
        for(int[] item:items){
            f[item[0]]++;
        }
        int[] gain =new int[n+1];
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j+=i){
                gain[i]+=f[j];
            }
            gain[i]--;
        }
        Arrays.sort(items,(a,b)->Integer.compare(a[1],b[1]));
        int minprice=items[0][1];
        long rem=budget;
        long ans=0;
        for(int[] item:items){
            int factor=item[0];
            int price=item[1];
            if((long)price>2L*minprice){
                break;
            }
            int count=gain[factor];
            long take=Math.min(count,rem/price);
            ans+=take*2;
            rem-=take*price;
        }
        ans+=rem/minprice;
        return (int)ans;
    }
}