class Solution {
    public String baseNeg2(int n) {
        if(n==0) return "0";
       StringBuilder s= new StringBuilder();
       while(n!=0){
        int r=n%-2;
        n/=-2;
        if(r<0){
            r+=2;
            n+=1;
        }
         s.append(r);
       }
       return s.reverse().toString();
    }
}