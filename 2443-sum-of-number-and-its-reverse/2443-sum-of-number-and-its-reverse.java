class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for(int i=0;i<=num;i++){
            String rev=new StringBuilder(String.valueOf(i)).reverse().toString();
            int r=Integer.parseInt(rev);
            if(r+i==num) return true;
        }
        return false;

        
    }
}