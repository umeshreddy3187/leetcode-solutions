class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int temp = 0;
            while (n > 0) {
                int rem = n % 10;
                temp += (rem * rem);
                n /= 10;
            }
            n = temp;
        }
        
        return n == 1;
    }
}