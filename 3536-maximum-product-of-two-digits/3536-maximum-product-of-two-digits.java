class Solution {
    public int maxProduct(int n) {
        int max1 = -1;
        int max2 = -1;
        int countMax1 = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit > max1) {
                max2 = max1;
                max1 = digit;
                countMax1 = 1;
            } else if (digit == max1) {
                countMax1++;
            } else if (digit > max2) {
                max2 = digit;
            }

            n /= 10;
        }

        if (countMax1 >= 2) {
            return max1 * max1;
        }

        return max1 * max2;
    }
}