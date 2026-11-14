import java.util.Arrays;

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0;
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(b(arr2,arr1[i],d)){
                c++;
            }
        }
        return c;
    }
    boolean b(int[] arr,int x,int d){
        int l=0,r=arr.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(Math.abs(arr[m]-x)<=d){
                return false;
            }
            if(arr[m]<x){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return true;
    }
}
    
    