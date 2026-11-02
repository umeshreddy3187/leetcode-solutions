class Solution {
    public int lengthOfLastWord(String s) {
        String l=s.trim();
        int n=l.length();
        int j=0;
        for(int i=n-1;i>=0;i--){
            if(l.charAt(i)!=' '){
                j++;
            }
            else{
                break;
            }
        }
        return j;

    }
}