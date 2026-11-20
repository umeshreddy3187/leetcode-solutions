import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> dp = new HashMap<>();
        int ans = 1;

        for (int x : nums) {
            int bumpVal = dp.getOrDefault(x, 0) + 1;
            int keepVal = dp.getOrDefault(x - 1, 0) + 1;

            dp.put(x + 1, Math.max(dp.getOrDefault(x + 1, 0), bumpVal));
            dp.put(x, Math.max(dp.getOrDefault(x, 0), keepVal));

            ans = Math.max(ans, Math.max(dp.get(x + 1), dp.get(x)));
        }

        return ans;
    }
}