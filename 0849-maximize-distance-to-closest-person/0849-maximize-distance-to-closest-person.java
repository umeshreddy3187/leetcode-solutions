class Solution {
    public int maxDistToClosest(int[] seats) {
        int maxDist = 0;
        int lastPerson = -1;
        int n = seats.length;

        for (int i = 0; i < n; i++) {
            if (seats[i] == 1) {
                if (lastPerson == -1) {
                    // Distance from the start to the first person
                    maxDist = i;
                } else {
                    // Distance between two people
                    maxDist = Math.max(maxDist, (i - lastPerson) / 2);
                }
                lastPerson = i;
            }
        }

        // Distance from the last person to the end of the row
        maxDist = Math.max(maxDist, n - 1 - lastPerson);

        return maxDist;
    }
}