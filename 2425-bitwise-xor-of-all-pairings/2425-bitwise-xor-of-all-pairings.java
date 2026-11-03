class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int s=0;
        // for(int i =0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         s^=(nums1[i]^nums2[j]);
        //     }
        // }
        if(m%2!=0){
            for(int i=0;i<n;i++){
                s^=nums1[i];
            }
        }
        if(n%2!=0){
            for(int i=0;i<m;i++){
                s^=nums2[i];
            }
        }
        return s;
        
    }
}