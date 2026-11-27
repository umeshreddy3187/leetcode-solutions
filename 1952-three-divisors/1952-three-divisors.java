class Solution {
    public boolean isThree(int n) {
        if(n<=2) return false;
        int c=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                c++;
                if(i*i!=n){
                    c++;
                }
            }
        }
        return c==3;
        
    }
}