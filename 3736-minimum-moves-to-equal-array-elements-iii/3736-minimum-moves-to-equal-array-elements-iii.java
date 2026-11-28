class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        for(int num:nums){
            max=Math.max(max,num);
        }
        int count=0;
        for(int num:nums){
            count+=(max-num);
        }
        return count;
    }
}