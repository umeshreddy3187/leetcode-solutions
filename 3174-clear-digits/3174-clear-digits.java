class Solution {
    public String clearDigits(String s) {
        int n=s.length();
        char[] arr=s.toCharArray();
        for(int i=0;i<n;i++){
            if(Character.isDigit(arr[i])){
                int j=i-1;
                while(j>=0){
                    if(arr[j]!='*' && !Character.isDigit(arr[j])){
                        arr[j]='*';
                        break;
                    }
                    j--;
                }
                arr[i]='*';
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(arr[i]!='*'){
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}