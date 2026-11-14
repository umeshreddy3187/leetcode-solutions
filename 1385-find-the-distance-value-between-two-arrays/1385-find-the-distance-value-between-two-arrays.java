class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0;
        int m=arr1.length;
        int n=arr2.length;
        int[] arr=new int[m];
        for(int i=0;i<m;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                min=Math.min(min,Math.abs(arr2[j]-arr1[i]));
            }
            arr[i]=min;
        }
        for (int num:arr){
            if(num>d)  c++;
        }
        return c;
    }
}