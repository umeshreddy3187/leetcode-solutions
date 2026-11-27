
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> arr = new ArrayList<>();
        int i = left;

        while (i <= right && i >= left) {
            int temp = i, c1 = 0, c2 = 0;

            while (temp > 0) {
                int rem = temp % 10;
                temp /= 10;
                c1++;

                if (rem == 0) {
                    break;
                }

                if (i % rem == 0) {
                    c2++;
                }
            }

            if (c1 == c2) {
                arr.add(i);
            }

            i++;
        }

        return arr;
    }
}
