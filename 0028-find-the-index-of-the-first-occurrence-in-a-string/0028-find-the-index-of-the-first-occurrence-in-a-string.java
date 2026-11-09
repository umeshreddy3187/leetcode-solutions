class Solution {
    public int strStr(String haystack, String needle) {
        boolean s=haystack.contains(needle);
        if(s){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}