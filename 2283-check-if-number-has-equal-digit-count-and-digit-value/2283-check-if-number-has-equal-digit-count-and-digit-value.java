class Solution {
    public boolean digitCount(String num) {
        int n=num.length();
        int[] x=new int[n];
        for(int i=0;i<n;i++){
            if(num.charAt(i)-'0'<n){
                x[num.charAt(i)-'0']++;
            }
        }
        for(int i=0;i<n;i++){
            if(x[i]!=num.charAt(i)-'0'){
                return false;
            }
        }
        return true;
    }
}