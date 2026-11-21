class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int[] merged = new int[n];

        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);
        if(n%2==0){
            return (double) (merged[n/2]+merged[(n/2)-1])/2 ;
        }
        return (double) merged[n/2];
    }
}