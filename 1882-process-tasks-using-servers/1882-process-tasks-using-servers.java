class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        int n = servers.length;
        int m = tasks.length;
        int[] res = new int[m];

        // Available servers: ordered by weight, then index
        PriorityQueue<int[]> available = new PriorityQueue<>(
            (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]
        );

        // Busy servers: ordered by finish time, then weight, then index
        PriorityQueue<int[]> busy = new PriorityQueue<>(
            (a, b) -> {
                if (a[2] != b[2]) return a[2] - b[2];
                if (a[0] != b[0]) return a[0] - b[0];
                return a[1] - b[1];
            }
        );

        for (int i = 0; i < n; i++) {
            available.offer(new int[]{servers[i], i, 0}); // {weight, index}
        }

        long currentTime = 0;

        for (int i = 0; i < m; i++) {
            currentTime = Math.max(currentTime, i);

            
            if (available.isEmpty() && !busy.isEmpty()) {
                currentTime = Math.max(currentTime, busy.peek()[2]);
            }
            while (!busy.isEmpty() && busy.peek()[2] <= currentTime) {
                int[] server = busy.poll();
                available.offer(new int[]{server[0], server[1], 0});
            }

            int[] server = available.poll();
            res[i] = server[1];

            busy.offer(new int[]{server[0], server[1], (int) currentTime + tasks[i]});
        }

        return res;
    }
}