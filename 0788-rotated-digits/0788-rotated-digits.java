class Solution {
    boolean y(int n){
            int j=n;
            boolean x=false;
            while(j>0){
                int rem=j%10;
                if(rem==3||rem==4||rem==7) return false;
                if(rem==2||rem==5||rem==6||rem==9)  x=true;
                j/=10;
             }
        return x;
            
    }
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=1;i<=n;i++) {
            if(y(i)) count++; 
        }
        return count;
        
        
    }
}