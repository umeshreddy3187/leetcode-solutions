class Solution {
    public int hammingWeight(int n) {
        // String s=Integer.toBinaryString(n);
        int c=0;
        while(n!=0){
            n&=(n-1);
            c++;
        }
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='1')  c++;
        // }
        return c;
    }
}