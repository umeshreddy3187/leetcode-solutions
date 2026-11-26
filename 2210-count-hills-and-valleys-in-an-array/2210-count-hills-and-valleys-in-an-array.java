class Solution {
    public int countHillValley(int[] nums) {
        int c=0;
        int l=nums[0];
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
           if((nums[i]>l && nums[i]>nums[i+1]) || (nums[i]<l && nums[i]<nums[i+1])){
            c++;
           }
           l=nums[i];
        }
        return c;
    }
}