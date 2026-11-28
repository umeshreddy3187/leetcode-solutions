class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int[] c=new int[n+1];
        int count=0;
        for(int i=0;i<n;i++){
            c[nums[i]]++;
            if(c[nums[i]]>1){
                count=nums[i];
            }
        }
        return count;
    }
}