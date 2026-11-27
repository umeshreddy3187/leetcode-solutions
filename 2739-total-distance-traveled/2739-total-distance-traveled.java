class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int mileage=0,n=mainTank;
        while(mainTank>0){
            mainTank--;
            mileage+=10;
            if(mainTank==n-5 && additionalTank>0){
                mainTank++;
                additionalTank--;
                n=mainTank;
            }
            

        }
        return mileage ;
        
    }
}