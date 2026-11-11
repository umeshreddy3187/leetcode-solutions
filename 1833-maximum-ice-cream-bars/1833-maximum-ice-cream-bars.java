class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=0,k=0;
        for(int i:costs){
            max=Math.max(i,max);
        }
        int[] c=new int[max+1];
        for(int i=0;i<costs.length;i++){
            c[costs[i]]++;
        }
        for(int i=1;i<max+1;i++){
            if((long)i*c[i]<=coins){
                coins-=(i*c[i]);
                k+=c[i];
            }
            else if(i<=coins ){
                for(int j=1;j<=c[i];j++){
                    if(i>coins){
                        break;
                    }
                    coins-=i;
                    k++;
                }
            }
        }
        return k;
        
    }
}