class Solution {
    public boolean checkString(String s) {
        int n=s.length();
        int b_a=0;
        int t_a=0;
        int k=0;
        boolean seen_b=false;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='a'){
                b_a++;
                t_a++;
            }
            if(c=='b'){
                seen_b=true;
                k=i;
                break;
            }
        }
        for(int i=k;i<n;i++){
            if(s.charAt(i)=='a' && seen_b){
                t_a++;
            }
        }
        
        return t_a==b_a;
        
    }
}