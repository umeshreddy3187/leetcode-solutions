class Solution {
    public int dayOfYear(String date) {
        int y = Integer.parseInt(date.substring(0, 4));
        int m = Integer.parseInt(date.substring(5, 7));
        int d = Integer.parseInt(date.substring(8, 10));
        int day=d;
        int[] mo={0,31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0;i<m;i++){
            day+=mo[i];
        }
        boolean leap=(y%4==0 && y%100!=0)||(y%400==0);
        if(leap && m>2 ) day++;
        return day;
        
    }
}