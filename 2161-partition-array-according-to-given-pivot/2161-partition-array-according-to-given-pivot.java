class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length,k=0;
        int[] p=new int[n];
        for(int i=0;i<n;i++){
            if(pivot>nums[i])    p[k++]=nums[i];
        }
        for(int i=0;i<n;i++){
            if(pivot==nums[i])    p[k++]=nums[i];
        }
        for(int i=0;i<n;i++){
            if(pivot<nums[i])    p[k++]=nums[i];
        }
        return p;
    }
}