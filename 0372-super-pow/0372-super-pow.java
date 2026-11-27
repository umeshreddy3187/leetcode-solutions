class Solution {
    private int powMod(int a, int k) {
        int result = 1;
        a %= 1337;
        for (int i = 0; i < k; i++) {
            result = (result * a) % 1337;
        }
        return result;
    }

    public int superPow(int a, int[] b) {
        int res = 1;
        for (int digit : b) {
            res = powMod(res, 10) * powMod(a, digit) % 1337;
        }
        return res;
    }
}