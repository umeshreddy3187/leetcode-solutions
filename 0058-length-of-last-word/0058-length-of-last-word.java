class Solution {
    public int lengthOfLastWord(String s) {
        List<String> l=new ArrayList<>();
        l=Arrays.asList(s.split(" "));
        return (l.get(l.size()-1)).length();
        
    }
}