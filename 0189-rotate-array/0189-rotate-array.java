class Solution {
    void rotarr(int[] nums,int low, int high){
        while(low<high){
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        rotarr(nums,0,n-1);
        rotarr(nums,0,k-1);
        rotarr(nums,k,n-1);

        
    }
}