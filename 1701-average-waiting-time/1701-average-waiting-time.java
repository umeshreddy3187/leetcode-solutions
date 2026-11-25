class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n=customers.length;
        long chef=customers[0][0];
        long sum=0;
        for(int i=0;i<n;i++){
            if(chef<customers[i][0]){
                chef=customers[i][0];
            }
            chef+=customers[i][1];
            sum+=(chef-customers[i][0]);
        }
        return (double)sum/n;
        
    }
}