class Solution {
    public int maxProduct(int n) {
        int max1 = 0, max2 = 0;

        // Extract digits
        while (n > 0) {
            int digit = n % 10;
            n /= 10;

            // Track top 2 largest digits
            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2) {
                max2 = digit;
            }
        }

        return max1 * max2;
    }
}
