class Solution {
    public int countDigits(int num) {
        int i=num,c=0;
        while(i>0){
            int rem=i%10;
            if(num%rem==0) c++;
            i/=10;
        }
        return c;
        
    }
}