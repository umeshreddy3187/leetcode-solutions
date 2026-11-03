class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }

        }
        return sb.toString().equals(sb.reverse().toString());
        
    }
}