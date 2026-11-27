class Solution {
    int dist (int[] p1,int[] p2){
        int d1=p1[0]-p2[0];
        int d2=p1[1]-p2[1];
        return d1*d1 + d2*d2;
    }
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[] d=new int[6];
        d[0]=dist(p1,p2);
        d[1]=dist(p2,p3);
        d[2]=dist(p3,p4);
        d[3]=dist(p4,p1);
        d[4]=dist(p1,p3);
        d[5]=dist(p2,p4);
        Arrays.sort(d);
        
        return d[0]>0 && d[0]==d[1] && d[1]==d[2] && d[2]==d[3] && d[3]==d[0] && d[4]==d[5] && d[4]==2*d[0];
        
        
    }
}