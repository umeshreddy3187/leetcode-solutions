class Solution {
    public int pivotInteger(int n) {
        if(n==1) return 1;
        if(n<=7) return -1;
        int x=1;
        while(x<=n){
            int s1=0,s2=0;
        for(int i=1;i<=x;i++){
            s1+=i;
        }
        for(int i=x;i<=n;i++){
            s2+=i;
        }
        if(s1==s2) return x;
        x++;
        }
        return -1;
    }
}