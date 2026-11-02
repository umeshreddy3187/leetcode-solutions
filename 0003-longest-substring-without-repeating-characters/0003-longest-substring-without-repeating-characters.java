class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int n=s.length();
        HashSet<Character> l=new HashSet<>();
        int left=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            while(l.contains(c)){
                l.remove(s.charAt(left));
                left++;
            }
            l.add(c);
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}