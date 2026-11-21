class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=nums.clone();
        Arrays.sort(arr);
        int a=-1,b=-1;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target) {
                break;
            }
            else if(sum<target) left++;
            else right--;
        }
        for(int i=0;i<nums.length;i++){
            if (a == -1 && nums[i] == arr[left]) {
                a = i;
             }
            else if (i != a && b == -1 && nums[i] == arr[right]) {
                b = i;
             }

            if (a != -1 && b != -1) {
                 break;
             }
        }
        
        return new int[]{a,b};

        
    }
}