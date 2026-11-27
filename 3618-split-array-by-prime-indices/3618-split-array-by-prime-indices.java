class Solution {
    
    
    public long splitArray(int[] nums) {
        int n=nums.length;
        boolean[] p=new boolean[n];
        for(int i=2;i<n;i++){
            p[i]=true;
        }
        for(int i=2;i*i<n;i++){
            if(p[i]==true){
                for(int j=i*i;j<n;j+=i){
                    p[j]=false;
                }
            }
        }
        long a=0,b=0; 
        for(int i=0;i<n;i++){
            if(p[i])   a+=nums[i];
            else   b+=nums[i];
        }   
        return Math.abs(a-b);
    }
}