class Solution {
    public int maxIncreasingGroups(List<Integer> usageLimits) {
        Collections.sort(usageLimits);
        int group=0;
        long available=0;
        for(int limit:usageLimits){
            available+=limit;
            if(available>group){
                group++;
                available-=group;
            }
        }
        return group;
    }
}