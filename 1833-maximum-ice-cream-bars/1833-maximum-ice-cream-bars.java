class Solution {
    public int maxIceCream(int[] costs, int coins) {
        // int max=0;
        // for(int n:costs){
        //     max=Math.max(max,n);
        // }
        // int[] c=new int[max+1];
        // for(int i=1;i<max+1;i++){

        // }
        // while(coins>0){

        // }
        Arrays.sort(costs);
        int k=0;
        for(int n:costs){
            if(n<=coins){
                coins-=n;
                k++;
            }
            else if(n>coins){
                break;
            }
        }
        return k;
        
    }
}