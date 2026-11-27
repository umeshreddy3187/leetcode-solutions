class Solution {
    public int minOperations(int k) {
        if (k == 1) return 0;
        
        int minOps = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            int increases = i - 1;
            
            int copies = (k + i - 1) / i;
            
            int duplicates = copies - 1;
            
            
            int totalOps = increases + duplicates;
            
            minOps = Math.min(minOps, totalOps);
        }
        
        return minOps;
    }
}