class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n=customers.length;
        long chef=customers[0][0];
        long sum=0;
        for(int i=0;i<n;i++){
            int a=customers[i][0];
            if(chef<a){
                chef=a;
            }
            chef+=customers[i][1];
            sum+=(chef-a);
        }
        return (double)sum/n;
        
    }
}