class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> r= new ArrayList<>();
        int i=0;
        for(int n:nums){
            i=((i*2)+n)%5;
            r.add(i==0);
        }
        return r;
        
    }
}