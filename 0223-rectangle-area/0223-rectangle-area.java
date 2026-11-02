class Solution {
    int mod(int n){
        if(n<0){
            return -n;
        }
        return n;
    }
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int ax=ax2-ax1;
        int ay=ay2-ay1;
        int bx=bx2-bx1;
        int by=by2-by1;
        int r1=mod(ax*ay);
        int r2=mod(bx*by);
        int area=r1+r2;
        int x=Math.min(ax2,bx2)-Math.max(ax1,bx1);
        int y=Math.min(ay2,by2)-Math.max(by1,ay1);
        int oa=0;
        if(x>0 && y>0){
            oa=x*y;

        }
        return area-oa;
    }
}