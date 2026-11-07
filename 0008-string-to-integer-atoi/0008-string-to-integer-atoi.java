class Solution {
    public int myAtoi(String s) {
        if (s.length() == 0)
            return 0;
        int n = s.length(), i = 0;
        int m = 1;
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        if (i == n)
            return 0;
        if (s.charAt(i) == '-') {
            m = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }
        int r = 0;
        while (i < n) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                break;
            }
            int digit=c-'0';
            if (r > (Integer.MAX_VALUE - digit) / 10) {
                return (m == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            r = r * 10 + digit;
            i++;
        }

        return (int) (m * r);

    }
}