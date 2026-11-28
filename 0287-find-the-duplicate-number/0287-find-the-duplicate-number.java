class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count=nums[i];
            }
        }
        return count;
    }
}