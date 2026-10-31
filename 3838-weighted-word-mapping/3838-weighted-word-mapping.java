class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String r="";
        for(int i=0;i<words.length;i++){
            int sum=0;
            for(int j=0;j<words[i].length();j++){
                sum+=weights[words[i].charAt(j)-'a'];
            }
            r+=(char)(26-(sum%26)+96);

        }
        return r;
    }
}