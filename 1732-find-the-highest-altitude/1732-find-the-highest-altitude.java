class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] h=new int[n+1];
        h[0]=0;
        // int g=0;
        int max=0;
        for(int i=1;i<n+1;i++){
            h[i]=h[i-1]+gain[i-1];
            max=Math.max(h[i],max);
            // g+=gain[i];
            // max=Math.max(max,g);
        }
        return max;
        
    }
}