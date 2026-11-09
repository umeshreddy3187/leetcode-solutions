import java.util.*;

class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        int n = arrival.length;
        
        // Min-heap to store busy servers: pair of {end_time, server_id}
        PriorityQueue<int[]> busyServers = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        
        // TreeSet to store available server indices
        TreeSet<Integer> availableServers = new TreeSet<>();
        for (int i = 0; i < k; i++) {
            availableServers.add(i);
        }
        
        int[] requestCount = new int[k];
        
        for (int i = 0; i < n; i++) {
            int startTime = arrival[i];
            int endTime = startTime + load[i];
            
            // Free up servers whose tasks have finished by the current request's arrival time
            while (!busyServers.isEmpty() && busyServers.peek()[0] <= startTime) {
                availableServers.add(busyServers.poll()[1]);
            }
            
            // If all servers are busy, drop the request
            if (availableServers.isEmpty()) {
                continue;
            }
            
            // Find the first available server >= (i % k)
            Integer serverId = availableServers.ceiling(i % k);
            
            // If none found >= (i % k), wrap around and pick the first available server from 0
            if (serverId == null) {
                serverId = availableServers.first();
            }
            
            // Assign the request to this server
            availableServers.remove(serverId);
            busyServers.offer(new int[]{endTime, serverId});
            requestCount[serverId]++;
        }
        
        // Find the maximum number of requests handled by any server
        int maxRequests = 0;
        for (int count : requestCount) {
            if (count > maxRequests) {
                maxRequests = count;
            }
        }
        
        // Collect all busiest servers
        List<Integer> busiest = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (requestCount[i] == maxRequests) {
                busiest.add(i);
            }
        }
        
        return busiest;
    }
}