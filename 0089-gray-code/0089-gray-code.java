class Solution {
    public List<Integer> grayCode(int n) { 
        List<Integer> list=new ArrayList<>();
        int l=1<<n;
        for(int i=0;i<l;i++){
            list.add(i^(i>>1));
        }
        return list;

        
    }
}