class Solution {
    public int lastRemaining(int n) {
        int h=1;
        int step=1;
        int r=n;
        boolean l=true;
        while(r>1){
            if(l||r%2!=0){
                h+=step;
            }
            r/=2;
            step*=2;
            l=!l;
        }
        return h;
    }
}