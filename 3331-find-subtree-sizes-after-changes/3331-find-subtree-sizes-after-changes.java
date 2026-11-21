import java.util.*;

class Solution {
    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            adj[parent[i]].add(i);
        }

        int[] newParent = new int[n];
        newParent[0] = -1;
        int[] lastSeen = new int[26];
        Arrays.fill(lastSeen, -1);
        dfsReparent(0, adj, s, lastSeen, newParent);
        List<Integer>[] newAdj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            newAdj[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            newAdj[newParent[i]].add(i);
        }
        int[] ans = new int[n];
        dfsSize(0, newAdj, ans);
        return ans;
    }

    private void dfsReparent(int u, List<Integer>[] adj, String s, int[] lastSeen, int[] newParent) {
        int idx = s.charAt(u) - 'a';
        if (u > 0) {
            newParent[u] = (lastSeen[idx] != -1) ? lastSeen[idx] : newParent[u];
        }

        int prev = lastSeen[idx];
        lastSeen[idx] = u;

        for (int v : adj[u]) {
            newParent[v] = u;
            dfsReparent(v, adj, s, lastSeen, newParent);
        }
        lastSeen[idx] = prev;
    }

    private int dfsSize(int u, List<Integer>[] newAdj, int[] ans) {
        int size = 1;
        for (int v : newAdj[u]) {
            size += dfsSize(v, newAdj, ans);
        }
        ans[u] = size;
        return size;
    }
}