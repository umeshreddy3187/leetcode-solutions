class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> r = new HashMap<>();
        r.put('I', 1);
        r.put('V', 5);
        r.put('X', 10);
        r.put('L', 50);
        r.put('C', 100);
        r.put('D', 500);
        r.put('M', 1000);
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = r.get(s.charAt(i));
            if ((i < s.length() - 1) && (j < r.get(s.charAt(i + 1)))) {
                n -= j;
            } else {
                n += j;
            }
        }
        return n;

    }
}