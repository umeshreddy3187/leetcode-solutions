class Solution {
    public int alternateDigitSum(int n) {
        String snum=String.valueOf(n);
        int s=0;
        for(int i=0;i<snum.length();i++){
            int rem=snum.charAt(i)-'0';
            if(i%2==0){
                s+=(rem);
            }
            else{
                s-=rem;
            }
        }
        return s;
    }
}