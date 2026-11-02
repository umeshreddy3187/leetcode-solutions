class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result=new StringBuilder();
        int n1=a.length();
        int n2=b.length();
        int carry=0;
        if(n1<n2){
            for(int i=0;i<n2-n1;i++){
                a='0'+a;
            }
            n1=n2;
        }
        if(n1>n2){
            for(int i=0;i<n1-n2;i++){
                b='0'+b;
            }
            n2=n1;
        }
        while(n1>0 && n2>0){
            int a1=a.charAt(n1-1)-'0';
            int b1=b.charAt(n2-1)-'0';
            int sum=(a1+b1+carry)%2;
            carry=(a1+b1+carry)/2;
            result.append(sum);
            n1--;
            n2--;
        }
        if(carry==1){
            result.append(1);
        }
        return result.reverse().toString();
    }
}